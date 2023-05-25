/*
 Navicat Premium Data Transfer

 Source Server         : seig-root
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : 192.168.92.129:3306
 Source Schema         : student

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 23/05/2023 19:13:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu`  (
  `uid` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `username` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES ('1234', 'bbyy', '1111');
INSERT INTO `stu` VALUES ('2222', 'bbbb', '5555');
INSERT INTO `stu` VALUES ('9001', 'WANGWU', '123456');
INSERT INTO `stu` VALUES ('9003', 'zhaoliu', '12345');
INSERT INTO `stu` VALUES ('9005', 'TONY', '123');
INSERT INTO `stu` VALUES ('9006', 'zhangsan', '1234');
INSERT INTO `stu` VALUES ('9007', 'LISI', '123456');
INSERT INTO `stu` VALUES ('9009', 'yangbin', '123456');
INSERT INTO `stu` VALUES ('9077', 'ACAC', '1234');
INSERT INTO `stu` VALUES ('9988', 'yb518', '6666');

SET FOREIGN_KEY_CHECKS = 1;
