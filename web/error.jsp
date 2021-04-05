
<% String error = (String) request.getSession().getAttribute("error");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="WEB-INF/jspf/cmeta.jspf" %>
        <title>JSP Page</title>
        <%@include file="WEB-INF/jspf/cstyles.jspf" %>
    </head>
    <body>
        <div class="container-fluid">
            <%@include file="WEB-INF/jspf/cheader.jspf" %>
            <div class="limpiar"></div>
            <%@include file="WEB-INF/jspf/cnav.jspf" %>
            <section>
                <div class="row">
                    <div class="col-12 col-lg-4"></div>
                    <div class="col-12 col-lg-4">
                        <div class="alert alert-danger" role="alert">
                            Ha ocurrido el siguiente error : <%=error%>
                        </div>
                    </div>
                    <div class="col-12 col-lg-4"></div>
                </div>
            </section>
            <%@include file="WEB-INF/jspf/cfooter.jspf" %>
            <%@include file="WEB-INF/jspf/cscripts.jspf" %>
        </div>
    </body>
</html>