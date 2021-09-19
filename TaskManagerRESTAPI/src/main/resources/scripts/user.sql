create table if not exists user (
    id INT auto_increment primary key,
    username VARCHAR(255) not null,
    password VARCHAR(500) not null,
    role VARCHAR(255) not null,
    created_at TIMESTAMP default current_timestamp,
    updated_at TIMESTAMP default current_timestamp,
    version LONG
    ) engine=innodb;

INSERT INTO user(id,password,username,role)
VALUES(1,'$2a$12$tZLPGLFWrBMUg.k6u5.BlOvpCTm9YT9FOnoEwVIOchLigMVc2PR2G','sourov','ADMIN');

INSERT INTO user(id,password,username,role)
VALUES(2,'$2a$12$tZLPGLFWrBMUg.k6u5.BlOvpCTm9YT9FOnoEwVIOchLigMVc2PR2G','user','USER');
