package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import database.model.DBHistory;
import database.dao.impl.HistoryDaoImpl;
import database.Conexion;
import config.FPConfig;

public final class allHistoryRec_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <title>Todos los registros</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            HistoryDaoImpl daoImpl = new HistoryDaoImpl();
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"columns\">\n");
      out.write("            <div class=\"column is-5\"></div>\n");
      out.write("            <div class=\"column is-2\">\n");
      out.write("                <h1 class=\"title is-centered\">Todos los registros</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"column is-5\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"columns\">\n");
      out.write("            <div class=\"column is-2\"></div>\n");
      out.write("            <div class=\"column is-8\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <table class= \"table is-bordered is-striped is-narrow is-hoverable is-fullwidth\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Nombre</th>\n");
      out.write("                        <th>Rut</th>\n");
      out.write("                        <th>Fecha Registro</th>\n");
      out.write("                        <th>Editar</th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");
for (DBHistory record : daoImpl.getAll()) {
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th>");
      out.print( record.getUserName());
      out.write("</th>\n");
      out.write("                        <th>");
      out.print( record.getUserRut());
      out.write("</th>\n");
      out.write("                        <th>");
      out.print( record.getRegisterDate());
      out.write("</th>\n");
      out.write("                        <th><form action=\"editarRegistro.jsp\">\n");
      out.write("                                <input type=\"hidden\" value=\"");
      out.print( record.getUserId());
      out.write("\" name=\"idUser\">\n");
      out.write("\n");
      out.write("                                <button type=\"submit\" class=\"button is-rounded is-warning is-hoverable\">Editar Registro</button></form>\n");
      out.write("                        </th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write(" \n");
      out.write("\n");
      out.write("                    <p class='select-css' id='nombre' name='txtNombre'> </p>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"column is-2\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <p class=\"level-item\"><strong> <a href=\"menuPrincipal.jsp\">Volver</a> </strong></p>\n");
      out.write("\n");
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
