package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import database.model.DBHistory;
import java.util.List;
import config.FPConfig;
import database.Conexion;
import database.dao.impl.HistoryDaoImpl;

public final class allHistoryRecords_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    System.out.println("KIEE1");
    FPConfig cfig1 = new FPConfig(true);
    System.out.println("KIEE2");
    Conexion con = new Conexion(cfig1.getDbName(), cfig1.getDbHost(), cfig1.getDbUser(), cfig1.getDbPasswd());
    System.out.println("KIEE3");
    System.out.println("Conexion: "+cfig1.getDbHost()+ " - Usuario " + cfig1.getDbUser());
    System.out.println("KIEE4");
    HistoryDaoImpl daoImpl = new HistoryDaoImpl(con);
    System.out.println("KIEE5");
    
    System.out.println("KIEE6");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("\n");
      out.write("        <ol>\n");
      out.write("            ");

                System.out.println("KIEE7");
                List<DBHistory> dbhs = daoImpl.getAll();
                for (DBHistory record : dbhs) {
                    System.out.println("KIEE8X");
            
      out.write(" <li>Nombre: ");
 record.getUserName(); 
      out.write("</li> ");

            
      out.write(" <li>Rut: ");
 record.getUserRut(); 
      out.write("</li> ");

            
      out.write(" <li>Fecha Registro: ");
 record.getRegisterDate(); 
      out.write("</li> \n");
      out.write("            <a>--------------------------------------------------</a>\n");
      out.write("\n");
      out.write("            ");
 }
            System.out.println("KIEE9");
            
      out.write("\n");
      out.write("\n");
      out.write("        </ol>\n");
      out.write("        <p class=\"level-item\"><strong> <a href=\"index.jsp\">Volver</a> </strong></p>\n");
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
