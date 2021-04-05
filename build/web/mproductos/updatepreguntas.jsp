
<%@page import="com.miempresa.dtos.PreguntaDto"%>
<% PreguntaDto preguntaoDto = (PreguntaDto) request.getSession().getAttribute("preguntas");%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
        <%@include file="../WEB-INF/jspf/cmeta.jspf" %>
        <%@include file="../WEB-INF/jspf/cstyles.jspf" %>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <link rel="icon" type="image/jpg" href="recursos/img/logoEditar.png" />
        <title>Kurt Lewin - Los Olivos</title>

        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Hind:400,700" rel="stylesheet">
        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="../recursos/css/bootstrap.min.css" />

        <!-- Slick -->
        <link type="text/css" rel="stylesheet" href="../recursos/css/slick.css" />
        <link type="text/css" rel="stylesheet" href="../recursos/css/slick-theme.css" />

        <!-- nouislider -->
        <link type="text/css" rel="stylesheet" href="../recursos/css/nouislider.min.css" />

        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href="../recursos/css/font-awesome.min.css">

        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="recursos/css/style.css" />

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
                  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
                  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
                <![endif]-->


    </head>
  <section>

                <body>
                    <!-- HEADER -->

                    <!-- /top Header -->

                    <!-- header -->
                    <div id="header">
                        <div class="container">
                            <div class="pull-left">
                                <!-- Logo -->
                                <center><h1>Sistema de Gestion de Examenes</h1></center>
                                <div class="header-logo">
                                    <a class="logo" href="#">
                                        <img src="recursos/img/logoKL.png" alt="">

                                    </a>
                                </div>
                                <!-- /Logo -->

                                <!-- Search -->
                                <div class="header-search">
                                    <form>
                                        <input class="input search-input" type="text" placeholder="¿Qué estás buscando?">
                                        <select class="input search-categories">
                                            <option value="0">Ingresar</option>
                                            <a href="login.jsp"><option  value="1">Soy un Profesor</option> </a>
                                            <option value="1">Soy un Padre</option>
                                        </select>
                                        <button class="search-btn"><i class="fa fa-search"></i></button>
                                    </form>
                                </div>
                                <!-- /Search -->
                            </div>
                            <div class="pull-right">
                                <ul class="header-btns">
                                    <!-- Account -->
                                    <li class="header-account dropdown default-dropdown">
                                        <div class="dropdown-toggle" role="button" data-toggle="dropdown" aria-expanded="true">
                                            <div class="header-btns-icon">
                                                <i class="fa fa-user-o"></i>
                                            </div>
                                            <strong class="text-uppercase">Mi cuenta <i class="far fa-file-spreadsheet"></i></strong>
                                        </div>

                                        <a href="login.jsp" class="text-uppercase">Salir</a>

                                    </li>
                                    <!-- /Account -->

                                    <!-- Mobile nav toggle-->
                                    <li class="nav-toggle">
                                        <button class="nav-toggle-btn main-btn icon-btn"><i class="fa fa-bars"></i></button>
                                    </li>
                                    <!-- / Mobile nav toggle -->
                                </ul>
                            </div>
                        </div>
                        <!-- header -->
                    </div>
                    <!-- container -->
                    </header>
                    <!-- /HEADER -->

                    <!-- NAVIGATION -->
                    <div id="navigation">
                        <!-- container -->
                        <div class="container">
                            <div id="responsive-nav">
                                <!-- category nav -->
                                <div class="category-nav">
                                    <span class="category-header">Gestion <i class="fa fa-list"></i></span>

                                </div>
                                <!-- /category nav -->

                                <!-- menu nav -->
                                <div class="menu-nav">
                                    <span class="menu-header">Menu <i class="fa fa-bars"></i></span>
                                    <ul class="menu-list">
                                        <li><a href="index.jsp">Inicio</a></li>
                                        <li><a href="#"></a></li>
                                        <li><a href="#"></a></li>
                                        <li><a href="#"></a></li>
                                        <li><a href="#"></a></li>
                                        <li><a href="#"></a></li>
                                        <ul class="custom-menu">
                                        </ul>
                                        </li>
                                    </ul>
                                </div>
                                <!-- menu nav -->
                            </div>
                        </div>
                        <!-- /container -->
                    </div>
                    <!-- /NAVIGATION -->
                    <div class="container-fluid">
            
            <section>
                <div class="row justify-content-center cardmodulos"> 
                    <div class="col-5" col-lg-4>
                        <div class="card">
                            <div class="card-header">
                                <h5 align="center">Actualizar Preguntas</h5>
                            </div>
                            <form class="card-body" action="<%=request.getContextPath()%>/preguntacontroller.do?txtAccion=updatep" method="post">
                                <div class="form-group">
                                    <input class="form-control" id="txtId" type="text" name="txtId" placeholder="Nombre" readonly="" value="<%=preguntaoDto.getId()%>">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" id="txtAnio" type="text" name="txtAnio" placeholder="Año" value="<%=preguntaoDto.getAnio()%>">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" id="txtBimestre" type="text" name="txtBimestre" placeholder="Bimestre" value="<%=preguntaoDto.getBimestre()%>">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" id="txtCurso" type="text" name="txtCurso" placeholder="Curso" value="<%=preguntaoDto.getCurso()%>">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" id="txtDificultad" type="text" name="txtDificultad" placeholder="Dificultad" value="<%=preguntaoDto.getDificultad()%>">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" id="txtPregunta" type="text" name="txtPregunta" placeholder="Pregunta" value="<%=preguntaoDto.getPregunta()%>">
                                </div>
                                
                                <a href="#ventana1" class="btn btn-primary btn-block" data-toggle="modal">Guardar Cambios</a>
                                <div class="modal" tabindex="-1" role="dialog" id="ventana1">
                                    <div class="modal-dialog" role="document">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title">ALERTA</h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                </button>
                                            </div>
                                            <div class="modal-body">
                                                <p>¿Seguro que desea modificar esta pregunta?</p>
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                                                <button type="submit" class="btn btn-primary btn-lg">Modificar</button>  
                                            </div>
                                        </div>
                                    </div>
                                </div>  
                            </form>
                        </div>
                    </div>
                </div>

            </section>
            <%@include file="../WEB-INF/jspf/cfooter.jspf" %>
            <%@include file="../WEB-INF/jspf/cscripts.jspf" %>
        </div>
    </body>
</html>