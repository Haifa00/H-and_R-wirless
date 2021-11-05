{\rtf1\ansi\ansicpg1252\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 devices, CREATE TABLE `devices` (\
  `device_id` int(11) NOT NULL AUTO_INCREMENT,\
  `model` varchar(45) NOT NULL,\
  `price` int(11) NOT NULL,\
  `image` varchar(256) NOT NULL,\
  PRIMARY KEY (`device_id`)\
) /*!50100 TABLESPACE `innodb_system` */ ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1\
\
plans, CREATE TABLE `plans` (\
  `planId` int(11) NOT NULL AUTO_INCREMENT,\
  `name` varchar(45) NOT NULL,\
  `numberOfLines` int(11) NOT NULL,\
  `description` varchar(1000) NOT NULL,\
  `pricePerLine` int(11) NOT NULL,\
  PRIMARY KEY (`planId`)\
) /*!50100 TABLESPACE `innodb_system` */ ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1\
\
userplan, CREATE TABLE `userplan` (\
  `userPlan_Id` int(11) NOT NULL AUTO_INCREMENT,\
  `plan_Id` int(11) NOT NULL,\
  `user_Id` int(11) NOT NULL,\
  `nickname` varchar(45) DEFAULT NULL,\
  PRIMARY KEY (`userPlan_Id`)\
) /*!50100 TABLESPACE `innodb_system` */ ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=latin1\
\
userplanline, CREATE TABLE `userplanline` (\
  `line_Id` int(11) NOT NULL AUTO_INCREMENT,\
  `phonenumber` bigint(10) NOT NULL,\
  `userplan_Id` int(11) DEFAULT NULL,\
  `device_Id` int(11) DEFAULT NULL,\
  PRIMARY KEY (`line_Id`),\
  UNIQUE KEY `phoneNumber_UNIQUE` (`phonenumber`),\
  UNIQUE KEY `line_Id_UNIQUE` (`line_Id`),\
  KEY `userPlan_Id_idx` (`userplan_Id`),\
  CONSTRAINT `userPlan_Id` FOREIGN KEY (`userplan_Id`) REFERENCES `userplan` (`userPlan_Id`) ON DELETE CASCADE ON UPDATE CASCADE\
) /*!50100 TABLESPACE `innodb_system` */ ENGINE=InnoDB AUTO_INCREMENT=220 DEFAULT CHARSET=latin1\
\
users, CREATE TABLE `users` (\
  `userId` int(11) NOT NULL AUTO_INCREMENT,\
  `firstName` varchar(45) NOT NULL,\
  `lastName` varchar(45) NOT NULL,\
  `userName` varchar(45) NOT NULL,\
  `password` varchar(45) DEFAULT NULL,\
  PRIMARY KEY (`userId`),\
  UNIQUE KEY `userName_UNIQUE` (`userName`),\
  UNIQUE KEY `userId_UNIQUE` (`userId`)\
) /*!50100 TABLESPACE `innodb_system` */ ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=latin1\
\
\
}