<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title> 
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.1/css/bulma.min.css">
    </head> 
    <body background="../src/java/imagenes/instituloImagen.jpg"> 

        <br>
        <br>

        <div class="hero-body">
            <div class="container has-text-centered">
                <h1 class="title"></h1>
                <div class="columns is-gapless">
                    <div class="column">
                        <figure class="image is-128x128">
                            <img src="../src/java/imagenes/logoSantoTomas.jpeg">
                        </figure>
                    </div>

                </div>
                <section class="hero is-primary  is-bold">
                    <div class="hero-body">
                        <div class="container">
                            <h1 class="title is-center">Ingreso Seguro Santo Tomás</h1>
                            <h2 class="subtitle is-center">
                                Bienvenido
                            </h2>
                            <br>
                            <br>

                        </div>


                        <div class="columns">
                            <div class="column is-4">

                            </div>
                            <div class="column is-4">
                                <form action="loginCheck.do" method="post">
                                    <div class="field">
                                        <div class="control has-icons-left has-icons-right">
                                            <input class="input" type="text" placeholder="Nombre de usuario:"  name="username" required="">
                                            <span class="icon is-small is-left">
                                                <i class="fas fa-user"></i>
                                            </span>
                                            <span class="icon is-small is-right">
                                                <i class="fas fa-check"></i>
                                            </span>
                                        </div>

                                    </div>
                                    <div class="field">
                                        <p class="control has-icons-left">
                                            <input class="input" type="password" placeholder="Password" name="password" required="">
                                            <span class="icon is-small is-left">
                                                <i class="fas fa-lock"></i>
                                            </span>
                                        </p>
                                    </div>
                                    <div class="field">
                                        <p class="control">
                                            <button class="button is-success" type="submit" value="Submit">
                                                Login
                                            </button>
                                        </p>
                                    </div>
                                </form>
                            </div>
                            <div class="column is-4">

                            </div>
                        </div>

                    </div>
                </section>
            </div>
        </div>
    </body>
</html>

