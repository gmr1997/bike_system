/*
 Navicat Premium Data Transfer

 Source Server         : gmr
 Source Server Type    : MySQL
 Source Server Version : 50710
 Source Host           : localhost:3306
 Source Schema         : db_bikesharing

 Target Server Type    : MySQL
 Target Server Version : 50710
 File Encoding         : 65001

 Date: 16/08/2019 10:45:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bike_info
-- ----------------------------
DROP TABLE IF EXISTS `bike_info`;
CREATE TABLE `bike_info`  (
  `thebike_id` int(4) NOT NULL AUTO_INCREMENT,
  `thebike_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `thebike_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `thecomponet_id` int(4) NULL DEFAULT NULL,
  `thebreakage` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `thereport_time` datetime(0) NULL DEFAULT NULL,
  `thestate_id` int(4) NULL DEFAULT NULL,
  PRIMARY KEY (`thebike_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bike_info
-- ----------------------------
INSERT INTO `bike_info` VALUES (1, 'bj-000000001', '北京市海淀区北四环28号', 1, '丢失', '2019-03-12 00:00:00', 1);
INSERT INTO `bike_info` VALUES (2, 'bj-000000002', '北京市昌平区政府街20号', 2, '弯曲', '2019-02-11 00:00:00', 1);
INSERT INTO `bike_info` VALUES (3, 'bj-000000003', '北京市东城区毛家湾胡同甲13号', 3, '扭曲', '2019-02-15 00:00:00', 1);
INSERT INTO `bike_info` VALUES (4, 'bj-000000004', '北京市海淀区新建宫门路19号', 4, '刹车失灵', '2018-11-12 00:00:00', 2);
INSERT INTO `bike_info` VALUES (5, 'bj-000000005', '北京市朝阳区北辰东路15号', 5, '位置定位不准确', '2019-04-20 00:00:00', 3);
INSERT INTO `bike_info` VALUES (6, 'bj-000000006', '北京市丰台区南四环中路235号', 6, '右踏板脱落', '2019-04-11 00:00:00', 1);
INSERT INTO `bike_info` VALUES (7, 'bj-000000007', '北京市东城区雍和宫大街12号', 7, '铃铛不响', '2019-05-12 00:00:00', 1);
INSERT INTO `bike_info` VALUES (8, 'bj-000000008', '北京市东城区雍和宫大街12号', 7, '铃铛不响', '2019-05-12 00:00:00', 1);
INSERT INTO `bike_info` VALUES (9, 'bj-000000009', '北京市东城区雍和宫大街12号', 7, '铃铛不响', '2019-05-12 00:00:00', 1);
INSERT INTO `bike_info` VALUES (10, 'bj-0000000010', '北京市东城区雍和宫大街12号', 7, '铃铛不响', '2019-05-12 00:00:00', 1);
INSERT INTO `bike_info` VALUES (11, 'bj-0000000011', '北京市东城区雍和宫大街12号', 7, '铃铛不响', '2019-05-12 00:00:00', 1);
INSERT INTO `bike_info` VALUES (12, 'bj-0000000012', '北京市东城区雍和宫大街12号', 7, '铃铛不响', '2019-05-12 00:00:00', 1);
INSERT INTO `bike_info` VALUES (13, 'bj-0000000013', '北京市东城区雍和宫大街12号', 7, '铃铛不响', '2019-05-12 00:00:00', 1);

-- ----------------------------
-- Table structure for componet
-- ----------------------------
DROP TABLE IF EXISTS `componet`;
CREATE TABLE `componet`  (
  `componet_id` int(4) NOT NULL AUTO_INCREMENT,
  `componet_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`componet_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of componet
-- ----------------------------
INSERT INTO `componet` VALUES (1, '桌垫');
INSERT INTO `componet` VALUES (2, '前轮');
INSERT INTO `componet` VALUES (3, '龙头');
INSERT INTO `componet` VALUES (4, '刹车');
INSERT INTO `componet` VALUES (5, '位置');
INSERT INTO `componet` VALUES (6, '踏板');
INSERT INTO `componet` VALUES (7, '铃铛');

-- ----------------------------
-- Table structure for state
-- ----------------------------
DROP TABLE IF EXISTS `state`;
CREATE TABLE `state`  (
  `state_id` int(4) NOT NULL AUTO_INCREMENT,
  `state_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`state_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of state
-- ----------------------------
INSERT INTO `state` VALUES (1, '未维修');
INSERT INTO `state` VALUES (2, '已维修');
INSERT INTO `state` VALUES (3, '维修中');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `user_id` int(4) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `user_password` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `user_sex` int(1) NULL DEFAULT NULL COMMENT '用户性别(0男，1女)',
  `user_tel` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户电话',
  `user_email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户邮箱',
  `user_pic` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户头像',
  `reg_time` datetime(0) NULL DEFAULT NULL COMMENT '注册时间',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES (1, 'admin', '111', 0, '15121111111', '123@163.com', 'http://127.0.0.1:8082/img/eb96b90f-63fd-498b-8bb7-e858d8f0b393.jpg', '2019-06-22 09:12:52');

SET FOREIGN_KEY_CHECKS = 1;
