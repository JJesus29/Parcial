DELIMITER $$
DROP PROCEDURE IF EXISTS insertar_dato;
CREATE PROCEDURE insertar_dato(
DNI VARCHAR(30),
Multa VARCHAR(30),
Monto INT,
Correo VARCHAR(40)
)
begin
INSERT INTO Registros VALUES(DNI,Multa,Monto,Correo);
end $$
DELIMITER ;