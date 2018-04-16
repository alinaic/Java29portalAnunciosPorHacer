<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="index.jsp">volver a inicio</a>
	<br /> Registra tu usuario:
	<br />
	<form action="ServletRegistroUsuario" method="post">
		nombre: <input type="text" name="campoNombre" /><br /> 
		direccion: <input
			type="text" name="campoDireccion" /><br /> 
		telefono: <input
			type="text" name="campoTelefono" /><br /> 
		email: <input type="text" name="campoEmail" /><br /> 
		descripcion: <br />
		<textarea rows="3" cols="20" name="campoDescripcion"></textarea>
		<br /> <input type="submit" value="ACEPTAR" /><br />
		<br />
	</form>


</body>
</html>