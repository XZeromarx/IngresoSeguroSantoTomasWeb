package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import database.model.DBUserLogin;
import database.dao.impl.UserLoginDaoImpl;
import database.dao.impl.UserDaoImpl;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head> \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bulma@0.9.1/css/bulma.min.css\">\n");
      out.write("    </head> \n");
      out.write("    <body background=\"../src/java/imagenes/instituloImagen.jpg\"> \n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"hero-body\">\n");
      out.write("            <div class=\"container has-text-centered\">\n");
      out.write("                <h1 class=\"title\"></h1>\n");
      out.write("                <div class=\"columns is-gapless\">\n");
      out.write("                    <div class=\"column\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <section class=\"hero is-primary  is-bold\">\n");
      out.write("                    <div class=\"hero-body\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <h1 class=\"title is-center\">Ingreso Seguro Santo Tomás</h1>\n");
      out.write("                            <h2 class=\"subtitle is-center\">\n");
      out.write("                                Bienvenido\n");
      out.write("                            </h2>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"columns\">\n");
      out.write("                            <div class=\"column is-4\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"column is-4\">\n");
      out.write("                                <div id=\"divError\" class=\"divError\"> </div>\n");
      out.write("                                <div class=\"field\">\n");
      out.write("                                    <div class=\"control has-icons-left has-icons-right\">\n");
      out.write("                                        <input class=\"input\" type=\"text\" id=\"name\" placeholder=\"Nombre de usuario:\"  name=\"username\" required=\"\">\n");
      out.write("                                        <span class=\"icon is-small is-left\">\n");
      out.write("                                            <i class=\"fas fa-user\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"icon is-small is-right\">\n");
      out.write("                                            <i class=\"fas fa-check\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"field\">\n");
      out.write("                                    <p class=\"control has-icons-left\">\n");
      out.write("                                        <input class=\"input\" type=\"password\" id=\"pass\" placeholder=\"Password\" name=\"password\" required=\"\">\n");
      out.write("                                        <span class=\"icon is-small is-left\">\n");
      out.write("                                            <i class=\"fas fa-lock\"></i>\n");
      out.write("                                        </span>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"field\">\n");
      out.write("                                    <p class=\"control\">\n");
      out.write("                                        <button class=\"button is-success\" type=\"button\" id=\"btnLogin\" value=\"Submit\" onclick=\"login()\">\n");
      out.write("                                            Login\n");
      out.write("                                        </button>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <style>\n");
      out.write("                                .divError {\n");
      out.write("                                    color: crimson\n");
      out.write("                                }\n");
      out.write("                            </style>\n");
      out.write("                            <script>\n");
      out.write("\n");
      out.write("                                function login() {\n");
      out.write("                                    var nombre = $(\"#name\").val();\n");
      out.write("                                    var clave = $(\"#pass\").val();\n");
      out.write("\n");
      out.write("                                    $.ajax({\n");
      out.write("                                        type: 'POST',\n");
      out.write("                                        url: 'http://localhost:8080/IngresoSantoTomasWeb/loginCheck.do',\n");
      out.write("                                        data: {nombre: nombre, clave: clave}\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    }).done(function () {\n");
      out.write("                                        location.href = \"http://localhost:8080/IngresoSantoTomasWeb/menuPrincipal.jsp\";\n");
      out.write("                                    }).fail(function () {\n");
      out.write("                                        document.getElementById('divError').innerHTML += '<h1>Contraseña o usuario incorrecto</h1>';\n");
      out.write("                                    });\n");
      out.write("                                }\n");
      out.write("                            </script>\n");
      out.write("                            <div class=\"column is-4\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
