<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="pb" class="bean.Preisbean"></jsp:useBean>
	<jsp:setProperty property="*" name="pb" />

	<h3>Nettopreis</h3>
	<jsp:getProperty property="netto" name="pb" />
	EUR
	<br>
	<h3>Steuerklasse</h3>
	<jsp:getProperty property="steuerklasse" name="pb" />
	<br>
	<h3>Bruttopreis</h3>
	<jsp:getProperty property="brutto" name="pb" />
	EUR


</body>
</html>