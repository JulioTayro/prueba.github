DROP DATABASE IF EXISTS examen1;
CREATE database examen1;

USE examen1;

CREATE TABLE users (
	id INT auto_increment NOT NULL,
	dni VARCHAR(8) NULL,
	nombre VARCHAR(100) NULL,
	apellido VARCHAR(100) NULL,
	nacimiento TIMESTAMP NULL,
	usuario VARCHAR(100) null,
	contrasenia VARCHAR(100) null, 
	CONSTRAINT users_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO users (dni, nombre, apellido, nacimiento) VALUES('75823694', 'julio', 'tayro', NOW());
INSERT INTO users (dni, nombre, apellido, nacimiento) VALUES('75841236', 'alexander', 'ponte', NOW());