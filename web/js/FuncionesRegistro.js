/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function() {
   

    $(".calendario").datepicker({dateFormat: 'dd/mm/yy', changeMonth: true, changeYear: true, yearRange: '-60:+30'});
    $(".col").hide();
    $(".chi").hide();
    $("#paisEscuSecundaria").change(function() {
        if ($("#paisEscuSecundaria").val() == "colombia") {
            $(".col").show();
            $(".chi").hide();
        }

        if ($("#paisEscuSecundaria").val() == "chile") {
            $(".col").hide();
            $(".chi").show();
        }

    });
    $("#DepEscusecu").change(function() {
        if ($("#DepEscusecu").val() == "cundinamarca") {
            $(".meta").hide();
            $(".cun").show();
        }

        if ($("#DepEscusecu").val() == "meta") {

            $(".meta").show();
            $(".cun").hide();
        }
    });

    $("#divdatosSocioEconomicos").hide();
    $("#divDatosIcfes").hide();
    $("#divDatosUniversidad").hide();
    $("#divDatosCodeudor").hide();
    $("#divDatosHomologacion").hide();
    $("#divDatosPagos").hide();
    $("#divSimulador").hide();
    $("#divDocumentosRespaldo").hide();
    $("#divFinalizacionSolicitud").hide();
    $("#divCredito").hide();
    $("#divCualAtenPsiqui").hide();
    $("#divCuantoArriendo").hide();
    $("#divCuantoPension").hide();
    $("#divCualesOtros").hide();
    $("#divCuantoGastosFamiliares").hide();
    $("#divCuantoOtrosGastos").hide();


    $(".materias").change(function() {
     var consecutivo = 0;
    var promedio = 0;
        if ($("#icLenguaje").val() != "") {
            consecutivo += 1;
            promedio += parseInt($("#icLenguaje").val())
        }
        if ($("#icCienciasSoc").val() != "") {
            consecutivo += 1;
             promedio += parseInt($("#icCienciasSoc").val())
        }
        if ($("#icBiologia").val() != "") {
            consecutivo += 1;
            promedio += parseInt($("#icBiologia").val())
        }
        if ($("#icFisica").val() != "") {
            consecutivo += 1;
            promedio += parseInt($("#icFisica").val())
        }
        if ($("#icMatematicas").val() != "") {
            consecutivo += 1;
            promedio += parseInt($("#icMatematicas").val())
        }
        if ($("#icFilosofia").val() != "") {
            consecutivo += 1;
            promedio += parseInt($("#icFilosofia").val())
        }
        if ($("#icQuimica").val() != "") {
            consecutivo += 1;
            promedio += parseInt($("#icQuimica").val())
        }
        
        
        alert(promedio);
        var respuesta = promedio / consecutivo;
        alert(consecutivo);
        $("#icPromedio").val(respuesta);
    });

    $("#formaPago").change(function() {
        if ($("#formaPago").val() != "credito") {
            $("#divCredito").hide();
        }
        if ($("#formaPago").val() == "credito") {
            $("#divCredito").show();
        }

    });
    $("input[name='atencPsiquia']").click(function() {
        if ($("input[name='atencPsiquia']:checked").val() == "S") {
            $("#divCualAtenPsiqui").show();
        }
        else {
            $("#divCualAtenPsiqui").hide();
        }

    });
    $("input[name='IngresoArredamien']").click(function() {
        if ($("input[name='IngresoArredamien']:checked").val() == "S") {
            $("#divCuantoArriendo").show();
        }
        else {
            $("#divCuantoArriendo").hide();
        }

    });
    $("input[name='IngresoPension']").click(function() {
        if ($("input[name='IngresoPension']:checked").val() == "S") {
            $("#divCuantoPension").show();
        }
        else {
            $("#divCuantoPension").hide();
        }

    });
    $("input[name='IngresoOtros']").click(function() {
        if ($("input[name='IngresoOtros']:checked").val() == "S") {
            $("#divCualesOtros").show();
        }
        else {
            $("#divCualesOtros").hide();
        }

    });
    $("input[name='GastosFamiliares']").click(function() {
        if ($("input[name='GastosFamiliares']:checked").val() == "S") {
            $("#divCuantoGastosFamiliares").show();
        }
        else {
            $("#divCuantoGastosFamiliares").hide();
        }

    });
    $("input[name='otrosGastos']").click(function() {
        if ($("input[name='otrosGastos']:checked").val() == "S") {
            $("#divCuantoOtrosGastos").show();
        }
        else {
            $("#divCuantoOtrosGastos").hide();
        }

    });


});
