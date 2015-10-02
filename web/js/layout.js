/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//var layout = document.querySelector('link[rel="import"]').import;
//var head = layout.querySelector('#top');
//var prefooter = layout.querySelector('#inPrefooter');
//var footer = layout.querySelector('#inFooter');
//document.getElementById("menu").appendChild(head.cloneNode(true));
//document.getElementById("prefooter").appendChild(prefooter.cloneNode(true));
//document.getElementById("footer").appendChild(footer.cloneNode(true));

//$(function(){
//    $("#menu").load("./Layout/MenuLayoutOut.html");
//    $("#footer").load("./Layout/FooterLayout.html");
//});

appEdupol.run(function ($templateCache) {
    $templateCache.put('MenuOut.html',
        '<section id="top" class="section" data-spacing="none">\n\
            <div class="container">\n\
                <div class="row">\n\
                    <div class="span12">\n\
                        <div class="navbar">\n\
                            <div class="navbar-inner">\n\
                                <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">\n\
                                    <span class="icon-bar"></span>\n\
                                    <span class="icon-bar"></span>\n\
                                    <span class="icon-bar"></span>\n\
                                    <span class="icon-bar"></span>\n\
                                </button>\n\
                                <a href="./" class="brand">\n\
                                    <img class="logo" src="./images/Logos/logo_Edupol.jpg" alt=""/>\n\
                                    Edupol \n\
                                </a>\n\
                                <div class="nav-collapse collapse">\n\
                                    <ul class="nav">\n\
                                        <li class="active">\n\
                                            <a href = "./">Home</a>\n\
                                        </li>\n\
                                        <li class="dropdown" data-ng-repeat="modulo in navega.main.listModuloModel">\n\
                                            <a href="#" data-ng-class="dropdown-toggle" data-toggle = "dropdown">{{modulo.sNombre}}</a>\n\
                                            <ul class="dropdown-menu">\n\
                                                <li class="stack" data-ng-repeat="pagina in modulo.listPaginaModel">\n\
                                                    <a href = ".{{pagina.sRuta}}">{{pagina.sNombre}}</a>\n\
                                                </li>\n\
                                            </ul>\n\
                                        </li>\n\
                                        <li class = "dropdown" data-ng-click="navega.invalidSession()">\n\
                                            <a href="./General/Login.html">Iniciar Sesion</a>\n\
                                        </li>\n\
                                    </ul>\n\
                                </div>\n\
                            </div>\n\
                        </div>\n\
                    </div>\n\
                </div>\n\
            </div>\n\
        </section>'
    );
});

appEdupol.run(function ($templateCache) {
    $templateCache.put('MenuIn.html',
        '<section id="top" class="section" data-spacing="none">\n\
            <div class="container">\n\
                <div class="row">\n\
                    <div class="span12">\n\
                        <div class="navbar">\n\
                            <div class="navbar-inner">\n\
                                <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">\n\
                                    <span class="icon-bar"></span>\n\
                                    <span class="icon-bar"></span>\n\
                                    <span class="icon-bar"></span>\n\
                                    <span class="icon-bar"></span>\n\
                                </button>\n\
                                <a href="../General/MenuIn.html" class="brand">\n\
                                    <img class="logo" src="../images/Logos/logo_Edupol.jpg" alt=""/>\n\
                                    Edupol \n\
                                </a>\n\
                                <div class="nav-collapse collapse">\n\
                                    <ul class="nav">\n\
                                        <li class="active">\n\
                                            <a href = "../General/MenuIn.html">Home</a>\n\
                                        </li>\n\
                                        <li class="dropdown" data-ng-repeat="modulo in navega.main.listModuloModel">\n\
                                            <a href="#" data-ng-class="dropdown-toggle" data-toggle = "dropdown">{{modulo.sNombre}}</a>\n\
                                            <ul class="dropdown-menu">\n\
                                                <li class="stack" data-ng-repeat="pagina in modulo.listPaginaModel">\n\
                                                    <a href = "..{{pagina.sRuta}}">{{pagina.sNombre}}</a>\n\
                                                </li>\n\
                                            </ul>\n\
                                        </li>\n\
                                        <li class = "dropdown" data-ng-click="navega.invalidSession()">\n\
                                            <a href="../">Cerrar Sesion</a>\n\
                                        </li>\n\
                                    </ul>\n\
                                </div>\n\
                            </div>\n\
                        </div>\n\
                    </div>\n\
                </div>\n\
            </div>\n\
        </section>'
    );
});

appEdupol.run(function ($templateCache) {
    $templateCache.put('PreFooter.html',
        '<div id="inPrefooter" class="container">\n\
            <div class="row">\n\
                <div class="span12">\n\
                    <header>\n\
                        <h3>\n\
                            <strong>\n\
                                EDUPOL\n\
                            </strong>\n\
                        </h3>\n\
                    </header>\n\
                    <p>Este sitio ha sido creado para el uso exclusivo de asociados autorizados de EDUPOL.\n\
                        El uso de este sitio está sujeto a los Avisos Legales, las Condiciones de Uso y la Declaración de Privacidad publicados en el sitio.\n\
                        El uso de este sitio por parte de los asociados de EDUPOL también está sujeto a las políticas de la empresa, incluido el Código de Conducta.\n\
                        El acceso no autorizado o el incumplimiento de estas condiciones puede dar lugar a la cancelación de su permiso para utilizar el sitio y/o a las acciones legales pertinentes.\n\
                    </p>\n\
                </div>\n\
            </div>\n\
        </div>'
    );
});


appEdupol.run(function ($templateCache) {
    $templateCache.put('Footer.html',
        '<div class="container" id="inFooter">\n\
            <div class="row">\n\
                <div class="span4 pull-right">\n\
                    <ul class="socials">\n\
                        <li>\n\
                            <a href="#" class="facebook"></a>\n\
                        </li>\n\
                        <li>\n\
                            <a href="#" class="behance"></a>\n\
                        </li>\n\
                        <li>\n\
                            <a href="#" class="twitter"></a>\n\
                        </li>\n\
                        <li>\n\
                            <a href="#top" class="top"></a>\n\
                        </li>\n\
                    </ul>\n\
                </div>\n\
                <div class="span8 pull-left">\n\
                    <p>Copyright 2015 Ethos<span>&nbsp;&nbsp;&nbsp;</span>Designed by \n\
                        <a href="http://www.ethosweb.com" target="_blank">ETHOS SOLUCIONES</a>\n\
                    </p>\n\
                </div>\n\
            </div>\n\
        </div>'
    );
});