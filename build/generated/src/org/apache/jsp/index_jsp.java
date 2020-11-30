package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Menú principal</h1>\n");
      out.write("        <nav>\n");
      out.write("            <!-- Left side -->\n");
      out.write("            <div>\n");
      out.write("                <div>\n");
      out.write("                    <p><strong>x</strong> registros</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <div>\n");
      out.write("                        <form action=\"#\" method=\"POST\">\n");
      out.write("                            <input class=\"input\" name=\"nombre\" id=\"nombre\" type=\"text\" placeholder=\"Nombre\">\n");
      out.write("                            <input class=\"input\" type=\"button\" value=\"Filtrar\" onclick=\"enviarInfo()\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <script>\n");
      out.write("\n");
      out.write("                function enviarInfo() {\n");
      out.write("                    var nombre = $(\"#nombre\").val();\n");
      out.write("\n");
      out.write("                    $.ajax({\n");
      out.write("                        type: 'POST',\n");
      out.write("                        url: 'http://localhost:8080/IngresoSantoTomasWeb/buscarPorNombre.do',\n");
      out.write("                        data: {nombre: nombre\n");
      out.write("                        }\n");
      out.write("                    }).done(function (resultadoHtml) {\n");
      out.write("                        $(\"#divMostrar\").html(resultadoHtml);\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("            <!-- Right side -->\n");
      out.write("            <div class=\"level-right\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <form action=\"allHistoryRec.jsp\" method=\"POST\">\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" value=\"Mostrar Todo\" />\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <p class=\"level-item\"><a>Registrados ultimamente</a></p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"divMostrar\"> <!-- Se va a cargar con ajax -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
