
mysql client >> pwd -admin
$mysql> --user=your-user-name --password=your-password 
create database userdb;
CREATE TABLE CONTACTS (     id     INT PRIMARY KEY AUTO_INCREMENT,     firstname    VARCHAR(30),     lastname    VARCHAR(30),     telephone   VARCHAR(15),     email         VARCHAR(30),     created     TIMESTAMP DEFAULT NOW() ); 
create table patient(patientid INT PRIMARY KEY AUTO_INCREMENT ,pfname varchar(25),lname varchar(25));
ALTER TABLE patient ADD CONSTRAINT pk_patient PRIMARY KEY(patientid)
create table address( patient_add_id INT PRIMARY KEY, addresstype varchar(1),street1 varchar(25),street2 varchar(25), 
constraint patfk foreign key(patient_add_id) references patient(patientid)  );
mysql>show databases;
mysql> use userdb;
mysql>show tables;

CREATE TABLE users (
  USER_ID INT(10) UNSIGNED NOT NULL,
  USERNAME VARCHAR(45) NOT NULL,
  PASSWORD VARCHAR(45) NOT NULL,
  ENABLED tinyint(1) NOT NULL,
  PRIMARY KEY (USER_ID)
) ;

CREATE TABLE user_roles (
  USER_ROLE_ID INT(10) UNSIGNED NOT NULL,
  USER_ID INT(10) UNSIGNED NOT NULL,
  AUTHORITY VARCHAR(45) NOT NULL,
  PRIMARY KEY (USER_ROLE_ID),
  KEY FK_user_roles (USER_ID),
  CONSTRAINT FK_user_roles FOREIGN KEY (USER_ID) REFERENCES users (USER_ID)
) ;

INSERT INTO users (USER_ID, USERNAME,PASSWORD, ENABLED)
VALUES (100, 'admin', 'admin', TRUE);
 
INSERT INTO user_roles (USER_ROLE_ID, USER_ID,AUTHORITY)
VALUES (1, 100, 'ROLE_USER');