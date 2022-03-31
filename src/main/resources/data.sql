create table if not exists course(
                       id integer not null,
                       name varchar(255) not null,
                       primary key(id)
);

insert into course(id, name) values (10001, 'JPA in 50 Steps');
insert into course(id, name) values (10002, 'Spring in 50 Steps');
insert into course(id, name) values (10003, 'Spring Boot in 100 Steps');
