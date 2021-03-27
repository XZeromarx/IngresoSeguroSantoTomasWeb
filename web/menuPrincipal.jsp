<%@page import="database.model.DBHistory"%>
<%@page import="database.dao.impl.HistoryDaoImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/jquery-3.3.1.min.js"></script>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.1/css/bulma.min.css">
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.22/datatables.min.css"/>
        <script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.22/datatables.min.js"></script>

        <title>Menú principal</title>
    </head>
    <style >
        html {
            background: url("https://pbs.twimg.com/profile_images/1007746897568727040/JktpRMmk.jpg") center fixed no-repeat;
        }
        
    </style>
    <body>








        <br>
        <br>
        <br>
        <br>
        <div class="columns">
            <div class="column is-3"></div>



        </div>



        <div class="columns">
            <div class="column is-2"></div>
            <div class="column is-8">
                <div class="box has-background-success-light">
                    <div id="divMostrarRegistro"> <!-- Se va a cargar con ajax -->


                        <table class="table is-bordered is-hoverable has-text-centered" id="registro">
                            <thead>
                                <tr>
                                    <td>Nombre</td>
                                    <td>Rut</td>
                                    <td>Fecha Ingreso</td>
                                    <td>Tipo de Ingreso</td>
                                    <td>Modificar usuario</td>

                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    HistoryDaoImpl hd = new HistoryDaoImpl();

                                    for (DBHistory dbh : hd.getAll()) {
                                %>
                                <tr>

                                    <td><%= dbh.getUserName()%></td>
                                    <td><%= dbh.getUserRut()%></td>
                                    <td><%= dbh.getRegisterDate()%></td>
                                    <td><%= dbh.getUserType()%></td>
                                    <td> <form action="editarRegistro.jsp">
                                            <input type="hidden" value="<%= dbh.getUserId()%>" name="idUser">
                                            <button type="submit" class="button is-rounded is-warning is-hoverable is-small">Editar Registro</button>
                                        </form>
                                    </td>

                                </tr>
                                </form>
                                <%}%>
                            </tbody>
                        </table>  


                    </div>
                </div>
            </div>
            <div class="column is-2"></div>
        </div>
        <br>
        <br>

    </body>

    <script>
        $(document).ready(function () {
            $('#registro').dataTable({
            });
        });

        
        
    </script>


</html>
