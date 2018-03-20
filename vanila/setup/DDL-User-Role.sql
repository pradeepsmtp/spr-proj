
list schemas ;
set schema SPR ;

create schema SPR

--select * from SYS.SYSTABLES  where TABLETYPE='T'

--select * from SYS.SYSCOLUMNS

-- DROP  Customer
Drop TABLE myuser

CREATE TABLE myuser (
  user_id int PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY,
  email varchar(20) UNIQUE  NOT NULL,
  name varchar(20) DEFAULT NULL,
  last_name varchar(20) DEFAULT NULL,
  password varchar(20) DEFAULT 'PASS'  
);

 
CREATE TABLE ROLE (
  role_id int PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY,
  role varchar(20) DEFAULT NULL  
);

select * from  myuser role 

select * from SYS.SYSTABLES  where TABLETYPE='T' ;

insert into myuser(EMAIL, NAME, LAST_NAME, PASSWORD) 
values ('pk@pk.com', 'PK', 'AN', 'password');

insert into myuser(EMAIL, NAME, LAST_NAME, PASSWORD) 
values ('foo@bar.com', 'Foo', 'Bar', 'password');

insert into myuser(EMAIL, NAME, LAST_NAME ) 
values ('jo@bar.com', 'Joo', 'Bar' );
