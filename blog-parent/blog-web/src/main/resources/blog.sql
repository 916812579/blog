-- 用户表
create table user (
   id  bigint(20) unsigned NOT NULL AUTO_INCREMENT,
   nicename varchar(255) NOT NULL DEFAULT '',
   name varchar(255)  NOT NULL DEFAULT '',
   password varchar(255)  NOT NULL DEFAULT '',
   email varchar(255)  NOT NULL DEFAULT '',
   islock char(1)  NOT NULL DEFAULT '0',
   isreadonly char(1)  NOT NULL DEFAULT '0',
   iswrite char(1)  NOT NULL DEFAULT '0',
   isadmin char(1)  NOT NULL DEFAULT '0',
    PRIMARY KEY (`id`)
    
);