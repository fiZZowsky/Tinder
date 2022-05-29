/*
Navicat MySQL Data Transfer

Source Server         : SEVER 9999
Source Host           : localhost:3306
Source Database       : database

Target Server Type    : MYSQL

Date: 2022-05-29 11:14:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for files
-- ----------------------------
DROP TABLE IF EXISTS `files`;
CREATE TABLE `files` (
  `FileID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `FileExtension` varchar(255) DEFAULT NULL,
  `BlurHash` varchar(255) DEFAULT NULL,
  `Status` char(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`FileID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of files
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `UserID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `UserName` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('36', 'fizzy', '123');
INSERT INTO `user` VALUES ('37', 'vidi', '123');
INSERT INTO `user` VALUES ('38', 'greenpoint', '123');

-- ----------------------------
-- Table structure for user_account
-- ----------------------------
DROP TABLE IF EXISTS `user_account`;
CREATE TABLE `user_account` (
  `UserID` int(10) unsigned NOT NULL,
  `UserName` varchar(255) DEFAULT NULL,
  `Gender` char(1) NOT NULL DEFAULT '',
  `Image` longblob,
  `ImageString` varchar(255) DEFAULT '',
  `Status` char(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`UserID`),
  CONSTRAINT `user_account_ibfk_1` FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_account
-- ----------------------------
INSERT INTO `user_account` VALUES ('36', 'fizzy', '', null, '', '1');
INSERT INTO `user_account` VALUES ('37', 'vidi', '', null, '', '1');
INSERT INTO `user_account` VALUES ('38', 'greenpoint', '', null, '', '1');
