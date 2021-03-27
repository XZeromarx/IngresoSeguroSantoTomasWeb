
<%@page import="database.model.DBUserLogin"%>
<%@page import="database.dao.impl.UserLoginDaoImpl"%>
<%@page import="database.dao.impl.UserDaoImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title> 
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.1/css/bulma.min.css">
        <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
    </head> 
    <body> 



        <div class="hero-body">

            <div class="container has-text-centered">



                <section class="hero is-primary  is-bold">
                    <div class="hero-body">

                        <div class="container">

                            <h1 class="title is-center">Ingreso Seguro Santo Tomás</h1>

                            <br>

                        </div>
                        <div class="columns">
                            <div class="column is-4">

                            </div>

                            <div class="column is-4">



                                <div class="columns">
                                    <div class="column is-4"></div>
                                    <div class="column">
                                        <h2 class="subtitle is-center">
                                            <figure class="image">
                                                <img class="is-rounded" src="https://www.universidadesonline.cl/logos/original/logo-universidad-santo-tomas.png">
                                            </figure>
                                            Bienvenido
                                        </h2>
                                    </div>
                                    <div class="column is-4"></div>

                                </div>





                                <div class="field">

                                    <input class="input is-primary" type="text" id="name" placeholder="Nombre de usuario:"  name="username" required="">

                                </div>
                                <div class="field">

                                    <input class="input is-primary" type="password" id="pass" placeholder="Password" name="password" required="">


                                </div>
                                <div class="field">

                                    <button class="button is-link is-rounded is-hoverable is-large" type="button" id="btnLogin" value="Submit" onclick="login()">
                                        Login
                                    </button>
                                    <div id="divError"> </div>
                                </div>

                            </div>


                            <div class="column is-4">

                            </div>

                        </div>

                    </div>
                </section>
            </div>
        </div>

        <style>
            body {
                background-image: url("https://www.elrancaguino.cl/wp-content/uploads/2020/07/frontis-santo-tomas-rancagua-ocarrol.jpg");
                background-size: cover;
                background-color: #00ffbe;
            }
        </style>

        <script>
            function login() {
                var nombre = $("#name").val();
                var clave = $("#pass").val();
                $.ajax({
                    type: 'POST',
                    url: 'http://localhost:8080/IngresoSeguroSantoTomasWeb/loginCheck.do',
                    data: {nombre: nombre, clave: clave}


                }).done(function () {
                    location.href = "http://localhost:8080/IngresoSeguroSantoTomasWeb/menuPrincipal.jsp";
                }).fail(function () {
                    document.getElementById("divError").innerHTML = '\
                <br>\n\
                <section class="hero is-danger">\n\
                <p class="title">Contraseña incorrecta</p>\n\
                <p class="subtitle">Intente nuevamente</p>\n\
                </section>';

                });
            }
        </script>

    </div>
</body>
</html>