# dwitter

MYSQL
create database dwitter;

use dwitter;

drop table user_profile;

create table user_profile(
	id integer primary key,
    username varchar(20),
    password varchar(32),
    first_name varchar(100),
    last_name varchar(100),
    email varchar(200),
    phone_number integer(10)
)
;

select * from user_profile;
