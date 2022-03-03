use eme_res;
create table userdata(
    id int NOT null primary key auto_increment,
    r_name varchar(200) NOT null,
    need varchar(100),
    disaster varchar(100),
    contact varchar(10) NOT null,
    email varchar(200) NOT null,
    city varchar(200),
    district varchar(200),
    state varchar(200) );


CREATE TABLE `admindata` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(64) NOT NULL,
  `role` varchar(45) NOT NULL,
  `enabled` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
);

INSERT INTO `admindata` (`username`,`password`,`role`,`enabled`)
VALUES ('Ishan',
'$2a$12$LGkAnNH7u2rbbkpLTIxMS.kP8xnrcOLSqAYUSPu1OqpadzWvYUb3W',
'ROLE_ADMIN', 1);

INSERT INTO `admindata` (`username`,`password`,`role`,`enabled`)
VALUES ('Admin',
'$2a$12$7xdCO5Nh6r.Ko8C4S8wSLeP/G7K6KVu/IxSIxWwFkUGI0bSaTFkvS',
'ROLE_ADMIN', 1);

