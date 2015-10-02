$(function () {
    $("#divFiltroCedula").hide();
    $("#labelFiltroCedula").hide();
    $("#divTipFiltro").addClass("col-sm-5");
//    $("br").hide();


    $("#tipFiltro").change(function () {
        if ($("#tipFiltro").val() == "1") {
            $("#divFiltroCedula").show();
            $("#labelFiltroCedula").show();
//            $("br").show();
        } else {
            $("#divFiltroCedula").hide();
            $("#labelFiltroCedula").hide();
//            $("br").hide();
            $("#divTipFiltro").removeClass("col-sm-9");
            $("#divTipFiltro").addClass("col-sm-5");
        }

    });





});

function DatosComplementariosEstudiantes() {
    $(".error").fadeOut().remove();
    if ($("#pAcademico").val() == "") {
        $("#pAcademico").focus().after('<span class="error">Campo Obligatorio</span>');
        return false;
    }

    if ($("#paisEscuSecundaria").val() == "") {
        $("#paisEscuSecundaria").focus().after('<span class="error">Campo Obligatorio</span>');
        return false;
    }

    if ($("#DepEscusecu").val() == "") {
        $("#DepEscusecu").focus().after('<span class="error">Campo Obligatorio</span>');
        return false;
    }
    if ($("#CiudadEscuSecu").val() == "") {
        $("#CiudadEscuSecu").focus().after('<span class="error">Campo Obligatorio</span>');
        return false;
    }
    if ($("#EntidadPromotoraS").val() == "") {
        $("#EntidadPromotoraS").focus().after('<span class="error">Campo Obligatorio</span>');
        return false;
    }
    if ($("#sFondoPensionesCesantias").val() == "") {
        $("#sFondoPensionesCesantias").focus().after('<span class="error">Campo Obligatorio</span>');
        return false;
    }
    if ($("#sCategoriaSisben").val() == "") {
        $("#sCategoriaSisben").focus().after('<span class="error">Campo Obligatorio</span>');
        return false;
    }
    if ($("#sNombreEscuela").val() == "") {
        $("#sNombreEscuela").focus().after('<span class="error">Campo Obligatorio</span>');
        return false;
    }
    if ($("#fechaGraduacion").val() == "") {
        $("#fechaGraduacion").focus().after('<span class="error">Campo Obligatorio</span>');
        return false;
    }
    return true;

}
