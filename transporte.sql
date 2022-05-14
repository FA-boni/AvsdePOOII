create database transporte
use transporte;

 create table usuarios (
  id int NOT NULL AUTO_INCREMENT,
  username varchar(40) NOT NULL,
  senha varchar(8) NOT NULL,
  perfil enum('Administrador','Motorista','Usuário') NOT NULL,
  PRIMARY KEY (id));
  
  INSERT INTO usuarios VALUES
  ('1','Luiz Augusto','12345','Administrador');
  
   select * from usuarios;
   
   describe usuarios;
   
   INSERT INTO usuarios (username,senha,perfil) values
   ('teste','teste','Administrador');
   
   select * from usuarios;
   
  