create table USER_DATA(id int(6) AUTO_INCREMENT primary key,username varchar(30),password varchar(200),
FIRSTNAME varchar(30),lastname varchar(30),
email varchar(100),enabled varchar(1),lastpasswordrestdate timestamp(6)) AUTO_INCREMENT = 1;


create table AUTHORITY(authority_id int(6) AUTO_INCREMENT primary key
,name varchar(100)) AUTO_INCREMENT =1;


create table USER_AUTHORITY(user_id int(6),user_authority_id int(6),
foreign key (user_id) references USER_DATA(id),foreign key (user_authority_id) 
references AUTHORITY(authority_id));


create table USER_INFORMATION(user_id int(6)  auto_increment  key,
username varchar(100),created_date timestamp(6)) auto_increment 600;