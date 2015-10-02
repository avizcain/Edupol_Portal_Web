appEdupol.controller('PreRegistroController', ['$http', getDataFromServer]);
function getDataFromServer($http) {
    var actualiza = this;
    $http({
        method: 'GET',
        url: "../PreRegistroControl",
        headers: {'Content-Type': 'application/json'}
    }).success(function (data, status, headers, config) {
        actualiza.person = data;

    }).error(function (data, status, headers, config) {
        // called asynchronously if an error occurs
        // or server returns response with an error status.
    });

    $(document).ready(function () {
        $('#example').DataTable();
    });

    actualiza.esMenor = false;
    actualiza.obtenerEdad = function () {
        var edad = calcular();
        var mayorEdad = (edad >= 18) ? true : false;
        actualiza.esMenor = mayorEdad;
    };

    actualiza.save = function () {
        var edad = calcular();
        var mayorEdad = (edad >= 18) ? true : false;
        var validacion = actualiza.validaCampos();
        if (validacion) {

            if (!mayorEdad) {
                actualiza.person.PreRegistro.acudiente.fechExp = document.getElementById("sFechaExpedicionAcu").value;
            }
            actualiza.person.PreRegistro.estudiante.fechaExp = document.getElementById("sFechaExpedicionEst").value;
            actualiza.person.PreRegistro.estudiante.FechaNac = document.getElementById("sFechaNacimiento").value;
            actualiza.person.PreRegistro.estudiante.mayorEdad = mayorEdad;
            actualiza.person.PreRegistro.condicion = 0;
            actualiza.datos = actualiza.person.PreRegistro;
            alert("Por favor espere un momento");
            $http({
                method: 'POST',
                url: "../PreRegistroControl",
                headers: {'Content-Type': 'application/json;charset=Utf-8'},
                data: actualiza.datos
            }).success(function (data, status, headers, config) {
                if (data == "OK") {
                    alert("se realizo la inscripcion satisfactoriamente");
                    window.location = "http://localhost:8080/Portal_Cygnus_Edupol/General/Login.html";
                } else if (data == "NOK") {
                    alert("Se presento un problema,intente mas tarde o comuniquese con el adminitrador");
                } else if (data == "Existe") {
                    alert("El usuario ya existe");
                }

            }).error(function (data, status, headers, config) {
                // called asynchronously if an error occurs
                // or server returns response with an error status.
            });

        }


    };

    actualiza.actualizaUni = function (indice) {
        if (indice == 1) {
            actualiza.nivelFormacio = null;
        }
        actualiza.person.PreRegistro.estudiante.infoUni.condicion = 1;
        actualiza.person.PreRegistro.estudiante.infoUni.indiceUni = indice;
        actualiza.datos = actualiza.person.PreRegistro.estudiante.infoUni
        $http({
            method: 'POST',
            url: "../PreRegistroControl",
            headers: {'Content-Type': 'application/json;charset=Utf-8'},
            data: actualiza.datos
        }).success(function (data, status, headers, config) {
            switch (indice) {
                case 1:

                    actualiza.nivelEstudio = null;
                    actualiza.grupoPrograma = null;
                    actualiza.programas = null;
                    actualiza.nivelFormacio = data;
                    break;
                case 2:
                    actualiza.nivelEstudio = data;
                    break;
                case 3:
                    actualiza.grupoPrograma = data;
                    break;
                case 4:
                    actualiza.programas = data;
            }


        }).error(function (data, status, headers, config) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };
    actualiza.listasPais = function (indice, indicePersona) {
        switch (indicePersona) {
            case 1:
                switch (indice) {
                    case 1:
                        actualiza.person.PreRegistro.estudiante.paisRes.condicion = 2;
                        actualiza.person.PreRegistro.estudiante.paisRes.indice = indice;
                        actualiza.datos = actualiza.person.PreRegistro.estudiante.paisRes;
                        break;
                    case 2:
                        actualiza.person.PreRegistro.estudiante.depRes.condicion = 2;
                        actualiza.person.PreRegistro.estudiante.depRes.indice = indice;
                        actualiza.datos = actualiza.person.PreRegistro.estudiante.depRes;
                        break;
                }
                break;
            case 2:
                switch (indice) {
                    case 1:
                        actualiza.person.PreRegistro.acudiente.paisRes.condicion = 2;
                        actualiza.person.PreRegistro.acudiente.paisRes.indice = indice
                        actualiza.datos = actualiza.person.PreRegistro.acudiente.paisRes;
                        break;
                    case 2:
                        actualiza.person.PreRegistro.acudiente.depRes.condicion = 2;
                        actualiza.person.PreRegistro.acudiente.depRes.indice = indice
                        actualiza.datos = actualiza.person.PreRegistro.acudiente.depRes;
                        break;
                }

                break;
            case 3:
                switch (indice) {
                    case 1:
                        actualiza.person.PreRegistro.estudiante.paisEstudio.condicion = 2;
                        actualiza.person.PreRegistro.estudiante.paisEstudio.indice = indice;
                        actualiza.datos = actualiza.person.PreRegistro.estudiante.paisEstudio;
                        break;
                    case 2:
                        actualiza.person.PreRegistro.estudiante.depEstudio.condicion = 2;
                        actualiza.person.PreRegistro.estudiante.depEstudio.indice = indice;
                        actualiza.datos = actualiza.person.PreRegistro.estudiante.depEstudio;
                        break;
                    case 3:
                        actualiza.person.PreRegistro.estudiante.ciudadEstudio.condicion = 2;
                        actualiza.person.PreRegistro.estudiante.ciudadEstudio.indice = indice;
                        actualiza.datos = actualiza.person.PreRegistro.estudiante.ciudadEstudio;
                        break;
                }

                break;
        }


        $http({
            method: 'POST',
            url: "../PreRegistroControl",
            headers: {'Content-Type': 'application/json;charset=Utf-8'},
            data: actualiza.datos
        }).success(function (data, status, headers, config) {
            switch (indicePersona) {

                case 1:
                    switch (indice) {
                        case 1:
                            actualiza.Departamento = data;
                            break;
                        case 2:
                            actualiza.ciudad = data;
                            break;
                    }
                    break;
                case 2:
                    switch (indice) {
                        case 1:
                            actualiza.DepartamentoAcudiente = data;
                            break;
                        case 2:
                            actualiza.ciudadAcudiente = data;
                            break;
                    }
                    break;
                case 3:
                case 2:
                    switch (indice) {
                        case 1:
                            actualiza.DepartamentoEstudio = data;
                            break;
                        case 2:
                            actualiza.ciudadEstudio = data;
                            break;
                        case 3:
                            actualiza.centroAsociado = data;
                    }
                    break;
            }

        }).error(function (data, status, headers, config) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };

    actualiza.validaCampos = function () {
        var edad = calcular();
        var mayorEdad = (edad >= 18) ? true : false;
        var emailreg = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;

        $(".error").fadeOut().remove();

        var pass = document.getElementById("sContraseña").value;
        var pass2 = document.getElementById("sconfContraseña").value;
        if (pass2 != pass) {
            $("#sconfContraseña").focus().after('<span class="error">Contraseña No Coincide</span>');
            return false;
        }

        if ($("#TipoSolicitud").val() == "") {
            //$("#TipoSolicitud").focus().after('<span class="error">Campo Obligatorio</span>'); 
            $('#princi').trigger('click');

            return false;
        }

        if ($("#NivelEduc").val() == "") {
            //$("#NivelEduc").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#princi').trigger('click');
            return false;
        }

        if ($("#Nacionalidad").val() == "") {
            //$("#Nacionalidad").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#princi').trigger('click');
            return false;
        }

        if ($("#sCiudadNacimiento").val() == "") {
            //  $("#sCiudadNacimiento").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#princi').trigger('click');
            return false;
        }

        if ($("#sLugarNac").val() == "") {
            //  $("#sLugarNac").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#princi').trigger('click');
            return false;
        }

        if ($("#sFechaNacimiento").val() == "") {
            //  $("#sFechaNacimiento").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#princi').trigger('click');
            return false;
        }

        if ($("#sFechaNacimiento").val().length > 10) {
            //   $("#sFechaNacimiento").focus().after('<span class="error">Excede el Tamaño</span>');
            $('#princi').trigger('click');
            return false;
        }

        if ($("#sFechaNacimiento").val().length < 10) {
            //  $("#sFechaNacimiento").focus().after('<span class="error">Fecha Incorrecta</span>');
            $('#princi').trigger('click');
            return false;
        }

        if (calcular() < 0 || calcular() > 80) {
            //   $("#sFechaNacimiento").focus().after('<span class="error">Fecha Incorrecta</span>');
            $('#princi').trigger('click');
            return false;
        }

        if ($("#TipoIdentificacion").val() == "") {
            //   $("#TipoIdentificacion").focus().after('<span class="error">Campo Obligatorio</span>');  
            $('#princi').trigger('click');
            return false;
        }

        if ($("#sNumeroIdentificacion").val() == "") {
            //   $("#sNumeroIdentificacion").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#princi').trigger('click');
            return false;
        }

        if ($("#sLugarExped").val() == "") {
            //  $("#sLugarExped").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#princi').trigger('click');
            return false;

        }


        if ($("#sFechaExpedicionEst").val() == "") {
            //   $("#sFechaExpedicionEst").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#princi').trigger('click');
            return false;

        }

        if ($("#sFechaExpedicionEst").val().length > 10) {
            //    $("#sFechaExpedicionEst").focus().after('<span class="error">Excede el Tamaño</span>');
            $('#princi').trigger('click');
            return false;

        }

        if ($("#sFechaExpedicionEst").val().length < 10) {
            //   $("#sFechaExpedicionEst").focus().after('<span class="error">Fecha Incorrecta</span>');
            $('#princi').trigger('click');
            return false;

        }

        if (calcular() < 0 || calcular() > 80) {
            //   $("#sFechaExpedicionEst").focus().after('<span class="error">Fecha Incorrecta</span>');
            $('#princi').trigger('click');
            return false;

        }

        if ($("#sPrimerNombre").val() == "") {
            //  $("#sPrimerNombre").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#princi').trigger('click');
            return false;

        }

        if ($("#sPrimerApellido").val() == "") {
            //  $("#sPrimerApellido").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#princi').trigger('click');
            return false;

        }

        if ($("#sSegundoApellido").val() == "") {
            //    $("#sSegundoApellido").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#princi').trigger('click');
            return false;

        }

        if ($("#Genero").val() == "") {
            //  $("#Genero").focus().after('<span class="error">Campo Obligatorio</span>');   
            $('#princi').trigger('click');
            return false;
        }

        if ($("#CategoriaSisben").val() == "") {
            //  $("#CategoriaSisben").focus().after('<span class="error">Campo Obligatorio</span>');  
            $('#princi').trigger('click');
            return false;
        }

        if ($("#paisRes").val() == "") {
            //   $("#paisRes").focus().after('<span class="error">Campo Obligatorio</span>');   
            $('#princi').trigger('click');
            return false;
        }

        if ($("#DepartamentoRes").val() == "") {
            //  $("#DepartamentoRes").focus().after('<span class="error">Campo Obligatorio</span>');   
            $('#princi').trigger('click');
            return false;
        }

        if ($("#CiudadRes").val() == "") {
            //   $("#CiudadRes").focus().after('<span class="error">Campo Obligatorio</span>'); 
            $('#princi').trigger('click');
            return false;
        }

        if ($("#sDireccionResidencia").val() == "") {
            //  $("#sDireccionResidencia").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#princi').trigger('click');
            return false;
        }

        if ($("#EstadoCivil").val() == "") {
            //  $("#EstadoCivil").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#princi').trigger('click');
            return false;
        }

        if ($("#sTelefonoFijo").val() == "") {
            //   $("#sTelefonoFijo").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#princi').trigger('click');
            return false;
        }

        if ($("#sTelefonoMovil").val() == "") {
            //   $("#sTelefonoMovil").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#princi').trigger('click');
            return false;
        }

        if ($("#sTelefonoMovil").val().length > 15) {
            //   $("#sTelefonoMovil").focus().after('<span class="error">Excede el Tamaño</span>');
            $('#princi').trigger('click');
            return false;
        }


        if ($("#sEmail").val() == "" || !emailreg.test($("#sEmail").val())) {
            //  $("#sEmail").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#princi').trigger('click');
            return false;
        }

        if ($("#GrupoSanguineo").val() == "") {
            //  $("#GrupoSanguineo").focus().after('<span class="error">Campo Obligatorio</span>');   
            $('#princi').trigger('click');
            return false;
        }

        if (!mayorEdad) {
            if ($("#TipoIdAcu").val() == "") {
                // $("#TipoIdAcu").focus().after('<span class="error">Campo Obligatorio</span>');  
                $('#ValidEstu').trigger('click');
                return false;
            }

            if ($("#sNumeroIdentificacionA").val() == "") {
                //   $("#sNumeroIdentificacionA").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;
            }

            if ($("#sFechaExpedicionAcu").val() == "") {
                // $("#sFechaExpedicionAcu").focus().after('<span class="error">Campo Obligatorio</span>'); 
                $('#ValidEstu').trigger('click');
                return false;
            }

            if ($("#generoA").val() == "") {
                //$("#generoA").focus().after('<span class="error">Campo Obligatorio</span>');  
                $('#ValidEstu').trigger('click');
                return false;
            }

            if ($("#sPrimerNombreA").val() == "") {
                //      $("#sPrimerNombreA").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;
            }

            if ($("#sPrimerApellidoA").val() == "") {
                //    $("#sPrimerApellidoA").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;
            }

            if ($("#sSegundoApellidoA").val() == "") {
                // $("#sSegundoApellidoA").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;
            }

            if ($("#PaisResidenciaA").val() == "") {
                //$("#PaisResidenciaA").focus().after('<span class="error">Campo Obligatorio</span>');  
                $('#ValidEstu').trigger('click');
                return false;
            }

            if ($("#DepartamentoResiAc").val() == "") {
                //$("#DepartamentoResiAc").focus().after('<span class="error">Campo Obligatorio</span>'); 
                $('#ValidEstu').trigger('click');
                return false;
            }

            if ($("#CiudadA").val() == "") {
                //$("#CiudadA").focus().after('<span class="error">Campo Obligatorio</span>'); 
                $('#ValidEstu').trigger('click');
                return false;
            }

            if ($("#sDireccionResidenciaA").val() == "") {
                //  $("#sDireccionResidenciaA").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;
            }

            if ($("#sTelefonoFijoA").val() == "") {
                // $("#sTelefonoFijoA").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;
            }

            if ($("#sTelefonoMovilA").val() == "") {
                // $("#sTelefonoMovilA").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;
            }


            if ($("#sEmailA").val() == "") {
                // $("#sEmailA").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;
            }

            if (!emailreg.test($("#sEmailA").val())) {
                //  $("#sEmailA").focus().after('<span class="error">Utiliza un formato que coincida con el solicitado</span>');
                $('#ValidEstu').trigger('click');
                return false;
            }

            if (!$("input[name='sTrabajaActual']").is(':checked')) {
                // $("#sTrabajaActual").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;
            }

            if (!$("input[name='sEmpleado']").is(':checked')) {
                // $("#sEmpleado").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;

            }

            if ($("#sTiempoContrato").val() == "") {
                // $("#sTiempoContrato").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;
            }

            if ($("#sNombreEmp").val() == "") {
                $("#sNombreEmp").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;
            }


            if ($("#sTipoContrato").val() == "") {
                //  $("#sTipoContrato").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;
            }

            if ($("#sOcupacion").val() == "") {
                //   $("#sOcupacion").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;
            }

            if ($("#TipoVivienda").val() == "") {
                //$("#TipoVivienda").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;
            }


            if ($("#sSalario").val() == "") {
                // $("#sSalario").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;
            }

            if (!$("input[name='sVehiculo']").is(':checked')) {
                //$("#sVehiculo").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;

            }

            if (!$("input[name='sIngresoArrendamiento']").is(':checked')) {
                // $("#sIngresoArrendamiento").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;

            }

            if ($("input[name='sOtrosIngresos']:checked").val() == "S" && $("sPensioSalario").val() == "") {
                //  $("#sIngresoPension").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;

            }

            if (!$("input[name='sOtrosIngresos']").is(':checked')) {
                // $("#sOtrosIngresos").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;

            }

            if (!$("input[name='sTargetaCredito']").is(':checked')) {
                //  $("#sTargetaCredito").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;

            }

            if (!$("input[name='sCreditoActual']").is(':checked')) {
                // $("#sCreditoActual").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;

            }

            if ($("#sObligacionesFinan").val() == "") {
                //   $("#sObligacionesFinan").focus().after('<span class="error">Campo Obligatorio</span>');
                $('#ValidEstu').trigger('click');
                return false;
            }

            if ($("#ConocimientoEdupol").val() == "") {
                // $("#ConocimientoEdupol").focus().after('<span class="error">Campo Obligatorio</span>');  
                $('#ValidEstu').trigger('click');
                return false;
            }


        }

        if ($("#PaisEStudiar").val() == "") {
            //  $("#PaisEStudiar").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#ValidAcu').trigger('click');
            return false;
        }
        if ($("#DepEstudio").val() == "") {
            //  $("#DepEstudio").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#ValidAcu').trigger('click');
            return false;
        }
        if ($("#CiudadEStudiar").val() == "") {
            //  $("#CiudadEStudiar").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#ValidAcu').trigger('click');
            return false;
        }

        if ($("#CentrosAsociados").val() == "") {
            //  $("#CentrosAsociados").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#ValidAcu').trigger('click');
            return false;
        }

        if ($("#Universidad").val() == "") {
            //  $("#Universidad").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#ValidAcu').trigger('click');
            return false;
        }

        if ($("#NivelFormacion").val() == "") {
            //  $("#NivelFormacion").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#ValidAcu').trigger('click');
            return false;
        }

        if ($("#TipoEStudio").val() == "") {
            //   $("#TipoEStudio").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#ValidAcu').trigger('click');
            return false;
        }

        if ($("#GrupoProgramaAcademico").val() == "") {
            //  $("#GrupoProgramaAcademico").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#ValidAcu').trigger('click');
            return false;
        }

        if ($("#ProgramaAcademico").val() == "") {
            //  $("#ProgramaAcademico").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#ValidAcu').trigger('click');
            return false;
        }

        if ($("#EstratoAc").val() == "") {
            // $("#EstratoAc").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#ValidAcu').trigger('click');
            return false;
        }

        if ($("#sContraseña").val() == "") {
            //  $("#sContraseña").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#ValidAcu').trigger('click');
            return false;
        }

        if ($("#sconfContraseña").val() == "") {
            // $("#sconfContraseña").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#ValidAcu').trigger('click');
            return false;
        }

        if ($("#ConocimientoEdupol").val() == "") {
            //  $("#ConocimientoEdupol").focus().after('<span class="error">Campo Obligatorio</span>');
            $('#ValidAcu').trigger('click');
            return false;
        }

        /*if ($("#sNumeroLibretaMilitar").val() == "") {
         $("#sNumeroLibretaMilitar").focus().after('<span class="error">Campo Obligatorio</span>');
         return false;
         
         }*/

        /*if ($("#sSegundoNombre").val() == "") {
         $("#sSegundoNombre").focus().after('<span class="error">Campo Obligatorio</span>');
         return false;
         
         }*/

        /* if ($("#sSegundoNombreA").val() == "") {
         $("#sSegundoNombreA").focus().after('<span class="error">Campo Obligatorio</span>');
         return false;
         }*/
        return true;
    };

    actualiza.validaBotones = function () {


        $(".calendario").datepicker({dateFormat: 'dd/mm/yy', changeMonth: true, changeYear: true, yearRange: '-60:+30'});

        $("#sCualVehiculo1").hide();
        $("#sCuantoSalario1").hide();
        $("#sPensioSalario1").hide();
        $("#sOtroIngresoCu1").hide();
        $("#sCuantoIngreso1").hide();
        $("#sCualTargeta1").hide();
        $("#sCualCredito1").hide();
        // $("#ValidAcu").hide();

        $("input[name='sVehiculo']").click(function () {
            if ($("input[name='sVehiculo']:checked").val() == "S") {
                $("#sCualVehiculo1").show();
            }
            else {
                $("#sCualVehiculo1").hide();
            }
        });

        $("input[name='sIngresoArrendamiento']").click(function () {
            if ($("input[name='sIngresoArrendamiento']:checked").val() == "S") {
                $("#sCuantoSalario1").show();
            }
            else {
                $("#sCuantoSalario1").hide();
            }
        });

        $("input[name='sIngresoPension']").click(function () {
            if ($("input[name='sIngresoPension']:checked").val() == "S") {
                $("#sPensioSalario1").show();
                $("#sPensioSalario").validate();
            }
            else {
                $("#sPensioSalario1").hide();
            }
        });

        $("input[name='sOtrosIngresos']").click(function () {
            if ($("input[name='sOtrosIngresos']:checked").val() == "S") {
                $("#sOtroIngresoCu1").show();
                $("#sCuantoIngreso1").show();
            }
            else {
                $("#sOtroIngresoCu1").hide();
                $("#sCuantoIngreso1").hide();
            }
        });

        $("input[name='sTargetaCredito']").click(function () {
            if ($("input[name='sTargetaCredito']:checked").val() == "S") {
                $("#sCualTargeta1").show();
            }
            else {
                $("#sCualTargeta1").hide();
            }
        });

        $("input[name='sCreditoActual']").click(function () {
            if ($("input[name='sCreditoActual']:checked").val() == "S") {
                $("#sCualCredito1").show();
            }
            else {
                $("#sCualCredito1").hide();
                $("#sCualCredito").hide();
            }
        });

    };
}
;
