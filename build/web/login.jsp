
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspf/cmeta.jspf" %>
        <%@include file="WEB-INF/jspf/cstyles.jspf" %>
        <script src="resources/js/validar.js" type="text/javascript"></script>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <link rel="icon" type="image/jpg" href="recursos/img/logoKL.png" />
        <title>Kurt Lewin - Los Olivos</title>

        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Hind:400,700" rel="stylesheet">
        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="recursos/css/bootstrap.min.css" />

        <!-- Slick -->
        <link type="text/css" rel="stylesheet" href="recursos/css/slick.css" />
        <link type="text/css" rel="stylesheet" href="recursos/css/slick-theme.css" />

        <!-- nouislider -->
        <link type="text/css" rel="stylesheet" href="recursos/css/nouislider.min.css" />

        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href="recursos/css/font-awesome.min.css">

        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="recursos/css/style.css" />

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
                  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
                  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
                <![endif]-->
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

                                        <a href="registrar.jsp" class="text-uppercase">Registrarse</a>
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
                                    <span class="category-header">Iniciar Sesion <i class="fas fa-user-friends"></i></span>
                                </div>
                                <!-- /category nav -->

                                <!-- menu nav -->
                                <div class="menu-nav">
                                    <span class="menu-header">Menu <i class="fa fa-bars"></i></span>
                                    <ul class="menu-list">
                                        <li><a href="#">crear una cuenta</a></li>
                                        <li><a href="#">Comprar</a></li>
                                        <li><a href="#">Comprar</a></li>
                                        <li><a href="#">Comprar</a></li>
                                        <li><a href="#">Sales</a></li>
                                        <li><a href="#">Sales</a></li>
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


    </head>
    <body>
        <div class="container-fluid">
            <div class="limpiar"></div>
            <script src="recursos/js/validar.js" type="text/javascript"></script>

            <section>

                <body>
                    <!-- HEADER -->

                    <!-- /top Header -->

                    <!-- header -->
                    <div id="header">
                        <div class="container">
                            <div class="pull-left">
                                <!-- Logo -->


                    <section>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <div class="row">
                            <div class="col-12 col-lg-4"></div>
                            <div class="col-12 col-lg-4">
                                <form class="login" action="controllogin.do" method="post" onsubmit="return validar();">
                                    <div class="form-group">
                                        <label for="txtCorreo">Correo Electrónico</label>
                                        <input type="text" class="form-control" id="txtCorreo" name="txtCorreo" placeholder="Enter email">
                                        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                    </div>
                                    <div class="form-group">
                                        <label for="txtClave">Clave númerica</label>
                                        <input type="password" class="form-control" id="txtClave" name="txtClave" placeholder="Password">
                                    </div>
                                    <div class="form-group form-check">
                                        <input type="checkbox" class="form-check-input" id="chkAceptar">
                                        <label class="form-check-label" for="exampleCheck1">Acepto los términos y condiciones</label>
                                    </div>
                                    <button type="submit" class="btn btn-primary">Iniciar sesión</button>
                                    <div class="form-group">
                                        <a href="recuperar.jsp">Olvido su contraseña</a>
                                    </div>
                                </form>
                            </div>
                            <div class="col-12 col-lg-4"></div>                 
                        </div>
                    </section>


                    <!-- FOOTER -->
                    <footer id="footer" class="section section-grey">
                        <!-- container -->
                        <div class="container">
                            <!-- row -->
                            <div class="row">
                                <!-- footer widget -->
                                <div class="col-md-3 col-sm-6 col-xs-6">
                                    <div class="footer">
                                        <!-- footer logo -->
                                        <div class="footer-logo">
                                            <a class="logo" href="#">
                                                <img src="recursos/img/logoKL.png" alt="">
                                            </a>
                                        </div>
                                        <!-- /footer logo -->

                                        <a href="https://cntada.en.alibaba.com/?spm=a2700.md_es_ES.cordpanyb.1.280d5e45nWPlue">Ningbo Spring Smiles Tada Trade Co., Ltd</a>
                                        <BR><BR>
                                        <a href="https://shjheyewear.en.alibaba.com/?spm=a2700.md_es_ES.cordpanyb.1.286a28ef7isNJB">Shanghai Jheyewear CO.,LTD</a><BR><BR>


                                        <!-- footer social -->
                                        <ul class="footer-social">
                                            <li><a href="https://www.facebook.com/negocia.compra.5"><i class="fa fa-facebook"></i></a></li>
                                            <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                            <li><a href="https://instagram.com/negociay?utm_source=ig_profile_share&igshid=o1az8ugo21tj"><i class="fa fa-instagram"></i></a></li>
                                            <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                                            <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
                                        </ul>
                                        <!-- /footer social -->
                                    </div>
                                </div>
                                <!-- /footer widget -->

                                <!-- footer widget -->
                                <div class="col-md-3 col-sm-6 col-xs-6">
                                    <div class="footer">
                                        <h3 class="footer-header">My Account</h3>
                                        <ul class="list-links">
                                            <li><a href="#">Mi cuenta</a></li>
                                            <li><a href="#">My Wishlist</a></li>
                                            <li><a href="#">Comprar</a></li>
                                            <li><a href="#">Ver</a></li>
                                            <li><a href="Login.jsp">Ingresar</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <!-- /footer widget -->

                                <div class="clearfix visible-sm visible-xs"></div>

                                <!-- footer widget -->
                                <div class="col-md-3 col-sm-6 col-xs-6">
                                    <div class="footer">
                                        <h3 class="footer-header">Customer Service</h3>
                                        <ul class="list-links">
                                            <li><a href="#">About Us</a></li>
                                            <li><a href="#">Shiping & Return</a></li>
                                            <li><a href="#">Shiping Guide</a></li>
                                            <li><a href="#">FAQ</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <!-- /footer widget -->

                                <!-- footer subscribe -->
                                <div class="col-md-3 col-sm-6 col-xs-6">
                                    <div class="footer">
                                        <h3 class="footer-header">Mantente conectado</h3>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>
                                        <form>
                                            <div class="form-group">
                                                <input class="input" placeholder="Escribir...">
                                            </div>
                                            <button class="primary-btn">Enviar comentario</button>
                                        </form>
                                    </div>
                                </div>
                                <!-- /footer subscribe -->
                            </div>
                            <!-- /row -->
                            <hr>
                            <!-- row -->
                            <div class="row">
                                <div class="col-md-8 col-md-offset-2 text-center">
                                    <!-- footer copyright -->

                                    <!-- /footer copyright -->
                                </div>
                            </div>
                            <!-- /row -->
                        </div>
                        <!-- /container -->
                    </footer>
                    <!-- /FOOTER -->



                </body>

                </html>

            </section>
            <%@include file="WEB-INF/jspf/cfooter.jspf" %>
            <%@include file="WEB-INF/jspf/cscripts.jspf" %>
        </div>
    </body>
    <!-- jQuery Plugins -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/slick.min.js"></script>
    <script src="js/nouislider.min.js"></script>
    <script src="js/jquery.zoom.min.js"></script>
    <script src="js/main.js"></script>
</html>
