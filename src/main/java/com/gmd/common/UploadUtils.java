package com.gmd.common;

import com.gmd.vo.ResultValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Description 文件上传工具类
 * @Author GanMingRan
 * @Date 2019/6/26 10:22
 **/
@RestController
public class UploadUtils {

    @Value("${web.user-path}")
    private String userPath;

    /**
     * 用户头像上传
     * @param file 前端传过来的文件
     * @return
     */
    @RequestMapping(value = "/uploadPhoto")
    public ResultValue uploadPhoto(@RequestParam("userPhoto") MultipartFile file) {
        ResultValue rv = new ResultValue();

        try {
            Map<String, Object> map = this.uploadFile(userPath, file);
            if(map != null && map.size() > 0){
                rv.setCode(0);
                rv.setDataMap(map);
                return rv;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        rv.setMessage("头像上传失败！");
        rv.setCode(1);
        return rv;
    }

    @RequestMapping(value = "/deletePhoto")
    public ResultValue deletePhoto(@RequestParam("userPic") String userPic){
        ResultValue rv = new ResultValue();

        try {
            //通过参数userPic获取文件名
            int index = userPic.lastIndexOf("/");
            if(index != -1){
                String fileName = userPic.substring(index + 1);
                File file = new File(this.userPath + fileName);
                System.out.println(userPath + fileName);
                file.delete();
                rv.setMessage("删除成功！");
                rv.setCode(0);
                return rv;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        rv.setCode(1);
        rv.setMessage("删除失败！");
        return rv;
    }

    /**
     * 上传文件
     *
     * @param path 上传文件的路径
     * @param file 上传的文件
     * @return 成功返回java.util.Map类的实例（包含新的文件名以及文件扩展名），否则返回null
     * @throws IOException
     */
    private Map<String, Object> uploadFile(String path, MultipartFile file) throws IOException {
        //获取新的文件名
        String newFileName = UploadUtils.getFileNameByUUID();

        //通过上传的文件，获取文件后缀名
        String extendeName = UploadUtils.getExtendeName(file.getOriginalFilename());

        //上传文件
        //1.将文件转换为字节类型的数组
        byte[] b = file.getBytes();
        //2.创建File类的对象，并设置文件名上传路径及文件夹名
        File saveFile = new File(path + newFileName + extendeName);
        //3.上传文件
        FileCopyUtils.copy(b, saveFile);
        Map<String, Object> map = new HashMap<>();
        map.put("newFileName", newFileName);
        map.put("extendeName", extendeName);
        return map;
    }

    /**
     * 通过UUID获取唯一的文件名
     * @return 文件名
     */
    public static String getFileNameByUUID(){
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }

    /**
     * 获取文件后缀名
     * @param fileName 完整文件名
     * @return 文件后缀名
     */
    public static String getExtendeName(String fileName){
        if(fileName == null || fileName.length() == 0){
            return null;
        }
        //.出现的最后一次
        int index = fileName.lastIndexOf(".");
        if(index == -1){//如果找不到“.”，返回null
            return null;
        }
        return fileName.substring(index);
    }
}
