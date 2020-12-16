<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.22/datatables.min.css"/>
        <script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.22/datatables.min.js"></script>
        <title>JSP Page</title>
    </head>
    <script>
        $(document).ready(function () {
            $('#tabla1').dataTable();
        })
    </script>
    <body>
        <table id="tabla1">
            <thead>
                <tr><td>Nombre</td><td>Rut</td><td>Fecha</td><td>columna 4</td></tr>
            </thead>
            <tbody>
                <tr><td>uno</td><td>dos</td><td>tres</td><td>cuatro</td></tr>
                <tr><td>cinco</td><td>seis</td><td>siete</td><td>ocho</td></tr>
                <tr><td>nueve</td><td>diez</td><td>once</td><td>doce</td></tr>
                <tr><td>trece</td><td>catorce</td><td>quince</td><td>dieciseis</td></tr>
            </tbody>
        </table>
    </body>
</html>
