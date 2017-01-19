# --- !Ups

create table contacts (
  id                  SERIAL,
  name                varchar(255),
  emailAddress        varchar(255),
  primary key (id)
);



# --- !Downs

drop table if exists contacts;

