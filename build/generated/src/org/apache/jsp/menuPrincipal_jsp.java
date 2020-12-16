package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import database.model.DBHistory;
import database.dao.impl.HistoryDaoImpl;

public final class menuPrincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bulma@0.9.1/css/bulma.min.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/v/dt/dt-1.10.22/datatables.min.css\"/>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdn.datatables.net/v/dt/dt-1.10.22/datatables.min.js\"></script>\n");
      out.write("\n");
      out.write("        <title>Menú principal</title>\n");
      out.write("    </head>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function() {\n");
      out.write("       $('#tabla1').dataTable( {\n");
      out.write("           \"bPaginate\": false,\n");
      out.write("           \"bFilter\": false\n");
      out.write("                    } );\n");
      out.write("} );\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <nav class=\"navbar is-primary\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div><label class=\"title is-black is-centered\">Menú principal</label></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("    </center>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <div class=\"columns\">\n");
      out.write("        <div class=\"column is-3\"></div>\n");
      out.write("\n");
      out.write("        <div class=\"column is-5\">\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <div>\n");
      out.write("                    <div>\n");
      out.write("                        <form action=\"#\" method=\"POST\">\n");
      out.write("                            <input class=\"input\" name=\"nombre\" id=\"nombre\" type=\"text\" placeholder=\"Nombre\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <input class=\"button is-danger\" type=\"button\" value=\"Filtrar\" onclick=\"enviarInfo()\">\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"column is-3\">\n");
      out.write("            <form action=\"allHistoryRec.jsp\" method=\"POST\">\n");
      out.write("\n");
      out.write("                <input class=\"button is-primary is-rounded\" type=\"submit\" value=\"Mostrar Todo\" />\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("        function enviarInfo() {\n");
      out.write("            var name = $(\"#nombre\").val();\n");
      out.write("\n");
      out.write("            $.ajax({\n");
      out.write("                type: 'POST',\n");
      out.write("                url: 'http://localhost:8080/IngresoSantoTomasWeb/buscarPorNombre.do',\n");
      out.write("                data: {nombre: name\n");
      out.write("                }\n");
      out.write("            }).done(function (resultadoHtml) {\n");
      out.write("                $(\"#divMostrarRegistro\").html(resultadoHtml);\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <div class=\"columns\">\n");
      out.write("        <div class=\"column is-3\"></div>\n");
      out.write("        <div class=\"column is-5\">\n");
      out.write("            <div id=\"divMostrarRegistro\"> <!-- Se va a cargar con ajax -->\n");
      out.write("                <table id=\"tabla1\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr><td>Nombre</td><td>Rut</td><td>Fecha</td><td>Tipo</td></tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                            HistoryDaoImpl hd = new HistoryDaoImpl();
                            
                            for(DBHistory dbh: hd.getAll()){
                                
      out.write("\n");
      out.write("                            \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <tr><td>");
      out.print( dbh.getUserName() );
      out.write("</td><td>");
      out.print( dbh.getUserRut());
      out.write("</td><td>");
      out.print( dbh.getRegisterDate());
      out.write("</td><td>");
      out.print( dbh.getUserType());
      out.write("</td></tr>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"column is-3\"></div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
