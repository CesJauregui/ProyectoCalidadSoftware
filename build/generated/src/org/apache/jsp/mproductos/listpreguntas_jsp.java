package org.apache.jsp.mproductos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listpreguntas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/mproductos/../WEB-INF/jspf/cmeta.jspf");
    _jspx_dependants.add("/mproductos/../WEB-INF/jspf/cstyles.jspf");
    _jspx_dependants.add("/mproductos/../WEB-INF/jspf/cheader.jspf");
    _jspx_dependants.add("/mproductos/../WEB-INF/jspf/cfooter.jspf");
    _jspx_dependants.add("/mproductos/../WEB-INF/jspf/cscripts.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write('\n');
      out.write("\n");
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
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
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
      out.write("                \n");
      out.write("            <section>\n");
      out.write("\n");
      out.write("                <div class=\"row cardmodulos\">\n");
      out.write("                    <div class=\"col-12 col-lg-1\"></div>\n");
      out.write("                    <div class=\"col-12 col-lg-10\">\n");
      out.write("                        <div class=\"nuevosproductos\"> \n");
      out.write("                            Agregar nuevas preguntas\n");
      out.write("                            <div class=\"nuevo\">\n");
      out.write("                                <a href=\"mproductos/newpreguntas.jsp\"><button type=\"button\" class=\"btn btn-success\"><i class=\"fas fa-plus\"></i>&nbsp;Agregar preguntas</button></a>\n");
      out.write("                            </div> \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-header\">\n");
      out.write("                               <i class=\"fab fa-product-hunt\"></i>&nbsp;&nbsp; Preguntas\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <table class=\"table table-bordered table-hover\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th> <input type=\"checkbox\" class=\"form-check-input\" id=\"chkAceptar\"></th>\n");
      out.write("                                            <th>Id</th>\n");
      out.write("                                            <th>Anio</th>\n");
      out.write("                                            <th>Bimestre</th>\n");
      out.write("                                            <th>Ver Detalle</th>\n");
      out.write("                                            <th>Actualizar</th>\n");
      out.write("                                            <th>Eliminar</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tfoot>\n");
      out.write("                                        <tr>\n");
      out.write("                                             <th> <input type=\"checkbox\" class=\"form-check-input\" id=\"chkAceptar\"></th>\n");
      out.write("                                            <th>Id</th>\n");
      out.write("                                            <th>Pregunta</th>\n");
      out.write("                                            <th>Bimestre</th>\n");
      out.write("                                            <th>Ver Detalle</th>\n");
      out.write("                                            <th>Actualizar</th>\n");
      out.write("                                            <th>Eliminar</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tfoot> \n");
      out.write("                                    <tbody>\n");
      out.write("                                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("preguntas");
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.preguntas}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("          \n");
            out.write("                                        <tr>\n");
            out.write("                                            <td> <input type=\"checkbox\" class=\"form-check-input\" id=\"chkAceptar\"></td>\n");
            out.write("                                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${preguntas.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${preguntas.pregunta}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${preguntas.dificultad}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                            <td><a class=\"btn btn-warning\" href=\"#\" role=\"button\"><i class=\"fas fa-binoculars\"></i></a></td>\n");
            out.write("                                            <td><a class=\"btn btn-success\" href=\"");
            out.print(request.getContextPath());
            out.write("/preguntacontroller.do?txtAccion=update&id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${preguntas.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" role=\"button\"><i class=\"fas fa-edit\"></i></a></td>\n");
            out.write("                                            <td><a class=\"btn btn-danger\" href=\"#\" role=\"button\"><i class=\"fas fa-edit\"></i></a></td>\n");
            out.write("                                        </tr>\n");
            out.write("                                    \n");
            out.write("                                    ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>   \n");
      out.write("\n");
      out.write("\n");
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
