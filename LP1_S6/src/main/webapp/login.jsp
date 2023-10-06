<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header>
 	<img alt="No disponible" src="img/ban.jpg">	
	</header>
	<div>
 	<h1>Acceso al sistema</h1>
 	<form action="">
 		<label>Usuario :</label><br>
 		<input type="email" required placeholder="Ingrese correo" maxlenght="50" name="usuario">
 		<br>
 		<label>Clave :</label><br>
 		<input type="password" required placeholder="Mayúscula y 8 números" pattern="[A-Z][0-9]{8}" maxlenght="9" name="clave">
 		<br>
 		<input type="checkbox">
 		<label>Olvidó su contraseña?</label><br>
 		<input type="submit" value="Enviar">
 	</form>
	</div>

</body>
</html>