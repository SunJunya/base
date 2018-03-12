/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : sale

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2016-11-19 17:57:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tproduct`
-- ----------------------------
DROP TABLE IF EXISTS `tproduct`;
CREATE TABLE `tproduct` (
  `barcode` varchar(8) NOT NULL,
  `product` varchar(30) NOT NULL,
  `price` float NOT NULL,
  `stock` int(11) NOT NULL,
  `provider` varchar(30) NOT NULL,
  PRIMARY KEY (`barcode`),
  KEY `product` (`product`),
  KEY `price` (`price`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tproduct
-- ----------------------------
INSERT INTO `tproduct` VALUES ('000001', '三星手机', '4999.3', '70', '三星');
INSERT INTO `tproduct` VALUES ('000002', '华为手机', '2999.9', '184', '华为');
INSERT INTO `tproduct` VALUES ('000003', '苹果电脑', '6999.2', '78', '苹果');
INSERT INTO `tproduct` VALUES ('000004', '海尔冰箱', '3333', '25', '海尔');
INSERT INTO `tproduct` VALUES ('000005', '联想笔记本', '6678', '31', '联想');

-- ----------------------------
-- Table structure for `tsaledetail`
-- ----------------------------
DROP TABLE IF EXISTS `tsaledetail`;
CREATE TABLE `tsaledetail` (
  `Id` varchar(12) NOT NULL DEFAULT '',
  `barcode` varchar(8) NOT NULL,
  `product` varchar(255) NOT NULL,
  `price` float NOT NULL,
  `number` int(11) NOT NULL,
  `saletime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `saleperson` varchar(255) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `barcode` (`barcode`),
  KEY `product` (`product`),
  KEY `price` (`price`),
  CONSTRAINT `barcode` FOREIGN KEY (`barcode`) REFERENCES `tproduct` (`barcode`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `price` FOREIGN KEY (`price`) REFERENCES `tproduct` (`price`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `product` FOREIGN KEY (`product`) REFERENCES `tproduct` (`product`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tsaledetail
-- ----------------------------
INSERT INTO `tsaledetail` VALUES ('201610300001', '000001', '苹果电脑', '4999.3', '1', '2016-11-04 16:05:11', '胡四');
INSERT INTO `tsaledetail` VALUES ('201611040001', '000001', '三星手机', '4999.3', '3', '2016-11-04 10:21:00', '李四');
INSERT INTO `tsaledetail` VALUES ('201611040002', '000002', '华为手机', '2999.9', '2', '2016-11-04 10:26:41', '张三');
INSERT INTO `tsaledetail` VALUES ('201611040003', '000003', '苹果电脑', '6999.2', '3', '2016-11-04 10:34:57', '吴方');
INSERT INTO `tsaledetail` VALUES ('201611040004', '000002', '华为手机', '2999.9', '2', '2016-11-04 16:03:44', '张三丰');
INSERT INTO `tsaledetail` VALUES ('201611040005', '000002', '华为手机', '2999.9', '2', '2016-11-04 16:04:14', '李连杰');
INSERT INTO `tsaledetail` VALUES ('201611040006', '000002', '华为手机', '2999.9', '3', '2016-11-04 16:49:49', '宋江');
INSERT INTO `tsaledetail` VALUES ('201611040007', '000003', '苹果电脑', '6999.2', '5', '2016-11-04 16:53:53', '曹操');
INSERT INTO `tsaledetail` VALUES ('201611040008', '000001', '三星手机', '4999.3', '3', '2016-11-04 16:54:46', '周星驰');
INSERT INTO `tsaledetail` VALUES ('201611040009', '000005', '联想笔记本', '6678', '4', '2016-11-04 17:01:15', '刘德华');
INSERT INTO `tsaledetail` VALUES ('201611040010', '000005', '联想笔记本', '6678', '3', '2016-11-04 17:01:56', '周润发');
INSERT INTO `tsaledetail` VALUES ('201611040011', '000004', '海尔冰箱', '3333', '3', '2016-11-04 18:12:16', '王五');
INSERT INTO `tsaledetail` VALUES ('201611040012', '000004', '海尔冰箱', '3333', '2', '2016-11-04 18:13:17', '李四');
INSERT INTO `tsaledetail` VALUES ('201611040013', '000003', '苹果电脑', '6999.2', '1', '2016-11-04 18:16:26', '赵六');
INSERT INTO `tsaledetail` VALUES ('201611040014', '000001', '三星手机', '4999.3', '6', '2016-11-04 18:17:00', '张三');
INSERT INTO `tsaledetail` VALUES ('201611040015', '000002', '华为手机', '2999.9', '2', '2016-11-04 18:27:27', '李四');
INSERT INTO `tsaledetail` VALUES ('201611040016', '000001', '三星手机', '4999.3', '2', '2016-11-04 18:29:13', '吴克');
INSERT INTO `tsaledetail` VALUES ('201611060001', '000001', '三星手机', '4999.3', '2', '2016-11-06 15:14:31', '王五');
INSERT INTO `tsaledetail` VALUES ('201611060002', '000003', '苹果电脑', '6999.2', '2', '2016-11-06 15:19:50', '李四');
INSERT INTO `tsaledetail` VALUES ('201611060003', '000001', '三星手机', '4999.3', '3', '2016-11-06 15:20:21', '张三');
INSERT INTO `tsaledetail` VALUES ('201611060004', '000001', '三星手机', '4999.3', '3', '2016-11-06 15:23:36', '李四');
INSERT INTO `tsaledetail` VALUES ('201611060005', '000003', '苹果电脑', '6999.2', '3', '2016-11-06 15:38:49', '赵六');
INSERT INTO `tsaledetail` VALUES ('201611080001', '000001', '三星手机', '4999.3', '2', '2016-11-08 17:28:20', '吴六');
INSERT INTO `tsaledetail` VALUES ('201611150001', '000001', '三星手机', '4999.3', '2', '2016-11-15 17:37:42', '苏三');
INSERT INTO `tsaledetail` VALUES ('201611190001', '000001', '三星手机', '4999.3', '2', '2016-11-19 10:32:43', '王五');
INSERT INTO `tsaledetail` VALUES ('201611190002', '000002', '华为手机', '2999.9', '3', '2016-11-19 11:01:26', '李四');
INSERT INTO `tsaledetail` VALUES ('201611190003', '000002', '华为手机', '2999.9', '2', '2016-11-19 16:41:31', '张三');

-- ----------------------------
-- Table structure for `tuser`
-- ----------------------------
DROP TABLE IF EXISTS `tuser`;
CREATE TABLE `tuser` (
  `userName` varchar(11) NOT NULL DEFAULT '',
  `password` varchar(255) DEFAULT NULL,
  `chrName` varchar(255) DEFAULT NULL,
  `roleName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tuser
-- ----------------------------
INSERT INTO `tuser` VALUES ('admin', '123', '管理员', '经理');
INSERT INTO `tuser` VALUES ('test', '222', '测试用户', '员工');
