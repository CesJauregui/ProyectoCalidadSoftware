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
        <div class="container-fluid">
            <%@include file="WEB-INF/jspf/cheader.jspf" %>
                   
            <section>
                <div class="row cardmodulos">

                    <div class="col-12 col-lg-3">
                        <div class="card ">
                            <h5 class="card-header"><i class="fab fa-product-hunt"></i>&nbsp;Preguntas</h5>
                            <div class="card-body">
                                <h5 class="card-title">Mantenimiento de Productos</h5>
                                <p class="card-text">En este módulo usted podrá editar,registrar,actualizar y eliminar preguntas de 
                                la base de datos</p>
                                <a href="<%=request.getContextPath()%>/preguntacontroller.do?txtAccionp=listp" class="btn btn-primary">Acceder al módulo</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-lg-3">
                        <div class="card">
                            <h5 class="card-header">Featured</h5>
                            <div class="card-body">
                                <h5 class="card-title">Special title treatment</h5>
                                <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                                <a href="#" class="btn btn-primary">Go somewhere</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-lg-3">
                        <div class="card">
                            <h5 class="card-header">Featured</h5>
                            <div class="card-body">
                                <h5 class="card-title">Special title treatment</h5>
                                <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                                <a href="#" class="btn btn-primary">Go somewhere</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-lg-3">
                        <div class="card">
                            <h5 class="card-header">Featured</h5>
                            <div class="card-body">
                                <h5 class="card-title">Special title treatment</h5>
                                <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                                <a href="#" class="btn btn-primary">Go somewhere</a>
                            </div>
                        </div>
                    </div>

                </div>
            </section>
            <%@include file="WEB-INF/jspf/cfooter.jspf" %>
            <%@include file="WEB-INF/jspf/cscripts.jspf" %>
        </div>
    </body>
</html>