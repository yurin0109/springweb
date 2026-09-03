DROP DATABASE IF EXISTS mydb0902;
CREATE DATABASE mydb0902;
USE mydb0902;
create table test(
    no int PRIMARY key AUTO_INCREMENT ,
    content VARCHAR(255) ,
    writer VARCHAR(255)
);