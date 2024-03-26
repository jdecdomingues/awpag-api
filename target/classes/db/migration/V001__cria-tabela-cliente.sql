create table cliente (
                         id bigint not null auto_increment,
                         nome varchar(100) not null,
                         email varchar (255) not null,
                         telefone varchar(2) not null,

                         primary key (id)
);

alter table cliente add constraint uk_cliente unique (email);
