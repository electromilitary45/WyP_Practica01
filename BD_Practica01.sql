drop schema practica;
drop user usuario_practica;


CREATE SCHEMA practica;
use practica;
create user 'usuario_practica'@'%' identified by 'la_Clave';
grant all privileges on practica.* to 'usuario_practica'@'%';
flush privileges;

/*Se crea la tabla de clientes llamada cliente... igual que la clase Cliente */
CREATE TABLE practica.estado (
  id_Pais INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(20) NOT NULL,
  capital VARCHAR(30) NOT NULL,
  poblacion int not null,
  provincias int not NULL,
  PRIMARY KEY (`id_Pais`)
  )
  
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

INSERT INTO practica.estado (nombre, capital, poblacion,provincias) VALUES 
('Costa Rica', 'San José', 1000000, 7),
('Estados Unidos', 'Washington D. C.', 32322123, 50),
('España', 'Madrid', 1234123, 10);

