package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tambah_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Tambah Data User Member</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center><h1>Tambah Data User Member</h1></center>\n");
      out.write("        <form action=\"UserController?data=user&proses=input-user\" method=\"post\">\n");
      out.write("            <table style=\"margin:20px auto;\">\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td>Username</td>\n");
      out.write("                    <td><input type=\"text\" name=\"username\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td>Password</td>\n");
      out.write("                    <td><input type=\"text\" name=\"password\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nama</td>\n");
      out.write("                    <td><input type=\"text\" name=\"nama\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td>Alamat</td>\n");
      out.write("                    <td><input type=\"text\" name=\"alamat\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                    <form name=“tes” action=“?page=siswa” method=“post”><tr><td>Tgl Lahirtd><td><input type=“text” size=“20″ name=“tgl” title=“dd-mm-yyyy” /><a href=“javascript:void(0)”onClick=“if(self.gfPop)gfPop.fPopCalendar(document.tes.tgl);return false;” ><imgname=“popcal” align=“absmiddle” src=“calender/calbtn.gif” width=“34″height=“22″ border=“0″ alt=“” />a>td>tr>form><iframe width=174 height=189 name=“gToday:normal:calender/normal.js”id=“gToday:normal:calender/normal.js” src=“calender/ipopeng.htm” scrolling=“no”frameborder=“0″ style=“visibility:visible; z-index:999; position:absolute; top:-500px; left:-500px;”>iframe>\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td>Tanggal Lahir</td>\n");
      out.write("                    <td><input type=\"text\" name=\"alamat\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td>Email</td>\n");
      out.write("                    <td><input type=\"text\" name=\"email\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Telp</td>\n");
      out.write("                    <td><input type=\"text\" name=\"telp\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"Tambah\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("            </table>\n");
      out.write("\t</form>\t\n");
      out.write("    \n");
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
