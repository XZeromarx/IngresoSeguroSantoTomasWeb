<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/jquery-3.3.1.min.js"></script>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.1/css/bulma.min.css">

        <title>Menú principal</title>
    </head>
    <body>
    <center>
        <nav class="navbar is-primary">


            <div><label class="title is-black is-centered">Menú principal</label></div>


        </nav>
    </center>
    <br>
    <br>
    <br>
    <br>
    <div class="columns">
        <div class="column is-3"></div>

        <div class="column is-5">

            <div>
                <div>
                    <div>
                        <form action="#" method="POST">
                            <input class="input" name="nombre" id="nombre" type="text" placeholder="Nombre">
                            <br>
                            <br>
                            <input class="button is-danger" type="button" value="Filtrar" onclick="enviarInfo()">
                        </form>

                    </div>
                </div>
            </div>
        </div>
        <div class="column is-3">
            <form action="allHistoryRec.jsp" method="POST">

                <input class="button is-primary is-rounded" type="submit" value="Mostrar Todo" />

            </form>
        </div>
    </div>


    <script>

        function enviarInfo() {
            var name = $("#nombre").val();

            $.ajax({
                type: 'POST',
                url: 'http://localhost:8080/IngresoSantoTomasWeb/buscarPorNombre.do',
                data: {nombre: name
                }
            }).done(function (resultadoHtml) {
                $("#divMostrarRegistro").html(resultadoHtml);
            });
        }

    </script>

    <div class="columns">
        <div class="column is-3"></div>
        <div class="column is-5">
            <div id="divMostrarRegistro"> <!-- Se va a cargar con ajax -->
                <table class= "table is-bordered is-striped is-narrow is-hoverable is-fullwidth">
                    <tr>
                        <th>Nombre</th>
                        <th>Rut</th>
                        <th>Fecha y hora de ingreso</th>
                    </tr>
                    <p class='select-css' id='nombre' name='txtNombre'> </p>

            </div>
            <div class="column is-3"></div>
        </div>
    </div>
</body>
</html>
