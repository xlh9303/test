create table t_user(
id int primary key,
username varchar(20),
password varchar(20),
account decimal(10,2)
);
alter user scott account unlock;
alter user scott identified by tiger;

select * from t_user;

CREATE SEQUENCE  t_user_SEQ 
START WITH 1
INCREMENT BY 1 
MINVALUE 1 
MAXVALUE 999999999999999999999999999 
CACHE 20 
NOORDER  
NOCYCLE ;

select t_user_seq.nextval from dual;
