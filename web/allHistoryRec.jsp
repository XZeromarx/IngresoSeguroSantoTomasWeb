<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="database.model.DBHistory"%>
<%@page import="database.dao.impl.HistoryDaoImpl"%>
<%@page import="database.Conexion"%>
<%@page import="config.FPConfig"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.1/css/bulma.min.css">
        <title>Todos los registros</title>
    </head>
    <body>
        <h1 class="title">Todos los registros</h1>
        <%
            HistoryDaoImpl daoImpl = new HistoryDaoImpl();
        %>



        <ol>
            <%for (DBHistory record : daoImpl.getAll()) {%>
            <li>Nombre: <%= record.getUserName()%>   </li>
            <li>Rut: <%= record.getUserRut()%></li>
            <li>Fecha Registro: <%= record.getRegisterDate()%></li>
            <a>--------------------------------------------------</a>

            <%}%> 

        </ol>

        <p class="level-item"><strong> <a href="menuPrincipal.jsp">Volver</a> </strong></p>

    </body>
</html>
