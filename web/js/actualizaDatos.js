appEdupol.controller('actualizaController', ['$http', getDataFromServer]);
function getDataFromServer($http) {
    var actualiza = this;
    $http({
        method: 'GET',
        url: "../ActualizarControl",
        headers: {'Content-Type': 'application/json'}
    }).success(function (data, status, headers, config) {
        actualiza.person = data;
    }).error(function (data, status, headers, config) {
        // called asynchronously if an error occurs
        // or server returns response with an error status.
    });
    actualiza.save = function () {
        actualiza.datos = actualiza.person.personaModel;
        alert("Actualiza Datos:" + actualiza.person.personaModel.sNombre);
        $http({
            method: 'POST',
            url: "../ActualizarControl",
            headers: {'Content-Type': 'application/json;charset=Utf-8'},
            data: actualiza.datos
        }).success(function (data, status, headers, config) {
            alert("Actualiza Datos: " + data);
        }).error(function (data, status, headers, config) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    };
}
;
