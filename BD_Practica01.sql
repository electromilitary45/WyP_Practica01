drop schema practica ;
drop user usuario_practica;


CREATE SCHEMA practica ;
create user 'usuario_practica'@'%' identified by 'la_Clave';
grant all privileges on practica.* to 'usuario_practica'@'%';
flush privileges;

/*Se crea la tabla de clientes llamada cliente... igual que la clase Cliente */
CREATE TABLE practica.pais (
  id_pais INT NOT NULL AUTO_INCREMENT,
  nombre_pais VARCHAR(20) NOT NULL,
  capital_pais VARCHAR(30) NOT NULL,
  moneda VARCHAR(25) NULL,
  idioma_oficial VARCHAR(15) NULL,
  PRIMARY KEY (`id_pais`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

INSERT INTO practica.pais (id_pais, nombre_pais, capital_pais, moneda, idioma_oficial) VALUES 
(1,'Costa Rica', 'San José', 'Colones', 'Español'),
(2,'Estados Unidos', 'Washington D. C.', 'Dolar', 'Inglés'),
(3,'España', 'Madrid', 'Euro', 'Español');