<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agenda</title>
</head>
<body>
<p>Digite os dados solicitados abaixo e clique em enviar:</p> 
<BR>
<BR>
<form action="ServletAgenda" method="post">
	Nome: <input type="text" name="nome"/>
	<input type="submit" value="Enviar" />
	<BR>
	<BR>
	Telefone: <input type="text" name="telefone"/>
	<input type="submit" value="Enviar" />
	<BR>
	<BR>
	Data de nascimento: <input type="text" name="dataNascimento"/>
	<input type="submit" value="Enviar" />
</form>
</body>
</html>