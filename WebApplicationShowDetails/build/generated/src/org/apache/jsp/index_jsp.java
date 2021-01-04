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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body onload = \"loadOnStart('divNombres', 'Nombres')\">\n");
      out.write("        <script>\n");
      out.write("            function loadOnStart(id, target) {//Yo le puse el nombre, no es reservado\n");
      out.write("                var ajaxRequest;\n");
      out.write("                if (window.XMLHttpRequest){\n");
      out.write("                    ajaxRequest=new XMLHttpRequest();\n");
      out.write("                } else {\n");
      out.write("                    ajaxRequest=new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                }\n");
      out.write("                ajaxRequest.onreadystatechange = function(){\n");
      out.write("                    if (ajaxRequest.readyState==4 && ajaxRequest.status==200){\n");
      out.write("                        var JSONObject = JSON.parse(ajaxRequest.responseText);\n");
      out.write("                        var txt = \"<select name='clientes' onchange='getDetails(this.value)'><option>Select a customer</option>\";\n");
      out.write("                        for(var i = 0; i<JSONObject.nombres.length; i++){\n");
      out.write("                            txt = txt + \"<option>\" + JSONObject.nombres[i].nombre + \"</option>\";\n");
      out.write("                        }\n");
      out.write("                        document.getElementById(id).innerHTML=txt;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                ajaxRequest.open(\"GET\", target, true /*async*/);\n");
      out.write("                ajaxRequest.send();\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function getDetails(param) {\n");
      out.write("                var ajaxRequest;\n");
      out.write("                if (window.XMLHttpRequest){\n");
      out.write("                    ajaxRequest=new XMLHttpRequest();\n");
      out.write("                } else {\n");
      out.write("                    ajaxRequest=new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                }\n");
      out.write("                ajaxRequest.onreadystatechange = function(){\n");
      out.write("                    if (ajaxRequest.readyState==4 && ajaxRequest.status==200){\n");
      out.write("                        var JSONObject = JSON.parse(ajaxRequest.responseText);\n");
      out.write("                        var txt = \"ID: \" + JSONObject.id+ \" Nombre: \"+ JSONObject.nombre+ \" Balance: \"+ JSONObject.balance+ \"<br />\";\n");
      out.write("                        document.getElementById(\"divDetalles\").innerHTML=txt;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                ajaxRequest.open(\"GET\", \"Datos?parametro=\"+param, true /*async*/);\n");
      out.write("                ajaxRequest.send();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <div id = divNombres></div>\n");
      out.write("        <div id = divDetalles>No details</div>\n");
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
