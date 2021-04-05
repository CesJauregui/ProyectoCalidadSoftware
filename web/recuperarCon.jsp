<%-- 
    Document   : index
    Created on : 04/04/2019, 06:59:07 PM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspf/cmeta.jspf" %>
        <%@include file="WEB-INF/jspf/cstyles.jspf" %>

        <title>JSP Page</title>

    </head>
    <body>
        <div class="container-fluid">
            <%@include file="WEB-INF/jspf/cheader.jspf" %>
            <%@include file="WEB-INF/jspf/cnav.jspf" %>

            <section>
                <div class="row justify-content-center"> 
                    <div class="col-5" col-lg-4>
                        <div class="card">
                            <div class="card-header">
                                <h5 align="center">Recuperar Contraseña</h5>
                            </div>
                            <form class="card-body" action="conrecucontra.do" method="post" onsubmit="return validar();">
                                <div class="form-group">
                                    <label></label>
                                    <input class="form-control" id="txtEmail" type="text" name="txtEmail" placeholder="Ingrese Email">
                                </div>
                                <button type="submit" class="btn btn-primary btn-block">Recuperar Contraseña</button>
                            </form>
                        </div>
                        <div style="padding-top: 15px">
                            <a href="login.jsp"><p align="center">Ya se acordo?</p></a>
                        </div>
                    </div>
                </div>
            </section>
            <%@include file="WEB-INF/jspf/cfooter.jspf" %>
            <%@include file="WEB-INF/jspf/cscripts.jspf" %>
        </div>
    </body>
</html>