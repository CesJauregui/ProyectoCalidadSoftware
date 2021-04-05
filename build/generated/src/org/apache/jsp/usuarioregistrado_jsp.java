package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usuarioregistrado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/WEB-INF/jspf/cmeta.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/cstyles.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/cheader.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/cfooter.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/cscripts.jspf");
  }

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

 String error = (String) request.getSession().getAttribute("error");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
      out.write("\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" href=\"recursos/css/estilos.css\" >\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" href=\"//cdn.jsdelivr.net/npm/alertifyjs@1.11.2/build/css/alertify.min.css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"resources/js/validar.js\" type=\"text/javascript\"></script>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("        <link rel=\"icon\" type=\"image/jpg\" href=\"recursos/img/logoKL.png\" />\n");
      out.write("        <title>Kurt Lewin - Los Olivos</title>\n");
      out.write("\n");
      out.write("        <!-- Google font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Hind:400,700\" rel=\"stylesheet\">\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"recursos/css/bootstrap.min.css\" />\n");
      out.write("\n");
      out.write("        <!-- Slick -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"recursos/css/slick.css\" />\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"recursos/css/slick-theme.css\" />\n");
      out.write("\n");
      out.write("        <!-- nouislider -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"recursos/css/nouislider.min.css\" />\n");
      out.write("\n");
      out.write("        <!-- Font Awesome Icon -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"recursos/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Custom stlylesheet -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"recursos/css/style.css\" />\n");
      out.write("\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("                  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("                  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("                <![endif]-->\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <section>\n");
      out.write("\n");
      out.write("                <body>\n");
      out.write("                    <!-- HEADER -->\n");
      out.write("\n");
      out.write("                    <!-- /top Header -->\n");
      out.write("\n");
      out.write("                    <!-- header -->\n");
      out.write("                    <div id=\"header\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"pull-left\">\n");
      out.write("                                <!-- Logo -->\n");
      out.write("                                <center><h1>Sistema de Gestion de Examenes</h1></center>\n");
      out.write("                                <div class=\"header-logo\">\n");
      out.write("                                    <a class=\"logo\" href=\"#\">\n");
      out.write("                                        <img src=\"recursos/img/logoKL.png\" alt=\"\">\n");
      out.write("\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /Logo -->\n");
      out.write("\n");
      out.write("                                <!-- Search -->\n");
      out.write("                                <div class=\"header-search\">\n");
      out.write("                                    <form>\n");
      out.write("                                        <input class=\"input search-input\" type=\"text\" placeholder=\"¿Qué estás buscando?\">\n");
      out.write("                                        <select class=\"input search-categories\">\n");
      out.write("                                            <option value=\"0\">Ingresar</option>\n");
      out.write("                                            <a href=\"login.jsp\"><option  value=\"1\">Soy un Profesor</option> </a>\n");
      out.write("                                            <option value=\"1\">Soy un Padre</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <button class=\"search-btn\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /Search -->\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"pull-right\">\n");
      out.write("                                <ul class=\"header-btns\">\n");
      out.write("                                    <!-- Account -->\n");
      out.write("                                    <li class=\"header-account dropdown default-dropdown\">\n");
      out.write("                                        <div class=\"dropdown-toggle\" role=\"button\" data-toggle=\"dropdown\" aria-expanded=\"true\">\n");
      out.write("                                            <div class=\"header-btns-icon\">\n");
      out.write("                                                <i class=\"fa fa-user-o\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <strong class=\"text-uppercase\">Mi cuenta <i class=\"far fa-file-spreadsheet\"></i></strong>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <a href=\"registrar.jsp\" class=\"text-uppercase\">Registrarse</a>\n");
      out.write("                                    <!-- /Account -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <!-- Mobile nav toggle-->\n");
      out.write("                                    <li class=\"nav-toggle\">\n");
      out.write("                                        <button class=\"nav-toggle-btn main-btn icon-btn\"><i class=\"fa fa-bars\"></i></button>\n");
      out.write("                                    </li>\n");
      out.write("                                    <!-- / Mobile nav toggle -->\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- header -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- container -->\n");
      out.write("                    </header>\n");
      out.write("                    <!-- /HEADER -->\n");
      out.write("\n");
      out.write("                    <!-- NAVIGATION -->\n");
      out.write("                    <div id=\"navigation\">\n");
      out.write("                        <!-- container -->\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div id=\"responsive-nav\">\n");
      out.write("                                <!-- category nav -->\n");
      out.write("                                <div class=\"category-nav\">\n");
      out.write("                                    <span class=\"category-header\">Iniciar Sesion <i class=\"fas fa-user-friends\"></i></span>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /category nav -->\n");
      out.write("\n");
      out.write("                                <!-- menu nav -->\n");
      out.write("                                <div class=\"menu-nav\">\n");
      out.write("                                    <span class=\"menu-header\">Menu <i class=\"fa fa-bars\"></i></span>\n");
      out.write("                                    <ul class=\"menu-list\">\n");
      out.write("                                        <li><a href=\"#\">Inicio</a></li>\n");
      out.write("                                        <li><a href=\"#\">Comprar</a></li>\n");
      out.write("                                        <li><a href=\"#\">Comprar</a></li>\n");
      out.write("                                        <li><a href=\"#\">Comprar</a></li>\n");
      out.write("                                        <li><a href=\"#\">Sales</a></li>\n");
      out.write("                                        <li><a href=\"#\">Sales</a></li>\n");
      out.write("                                        <ul class=\"custom-menu\">\n");
      out.write("                                        </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- menu nav -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /container -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /NAVIGATION --> \n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("            ");
      out.write("<header class=\"cabecera\">\n");
      out.write("    <h1>Sistema de Ventas</h1>\n");
      out.write("    <div class=\"boton\">\n");
      out.write("        <a href=\"registrar.jsp\"><button type=\"button\" class=\"btn btn-primary\">Registrar</button></a>\n");
      out.write("        <a href=\"login.jsp\"><button type=\"button\" class=\"btn btn-warning\">Iniciar Sesion</button></a>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</header>");
      out.write("\n");
      out.write("            <div class=\"limpiar\"></div>\n");
      out.write("           \n");
      out.write("            <section>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12 col-lg-4\"></div>\n");
      out.write("                    <div class=\"col-12 col-lg-4\">\n");
      out.write("                       <div class=\"alert alert-primary\" role=\"alert\">\n");
      out.write("                                USUARIO REGISTRADO CORRECTAMENTE\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"boton\">\n");
      out.write("        <a href=\"login.jsp\"><button type=\"button\" class=\"btn btn-warning\">Iniciar Sesión</button></a>\n");
      out.write("    </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-lg-4\"></div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            ");
      out.write("<footer>\n");
      out.write("    <small>&COPY; Todos los derechos reservados; Grupon de Velarde</small>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("            ");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"//cdn.jsdelivr.net/npm/alertifyjs@1.11.2/build/alertify.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
