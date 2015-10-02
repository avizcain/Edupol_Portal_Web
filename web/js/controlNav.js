var appEdupol = angular.module('appEdupol', []);

appEdupol.factory("menuService", function () {
    return {
        data: {}
    };
});

appEdupol.controller('navegaController', ['$http', '$window', getMenu]);

function getMenu($http) {

    var navega = this;

    var main = {};
    var url = "#";
    $http({
        method: 'GET',
        url: "../MenuControl",
        headers: {'Content-Type': 'application/json'}
    }).success(function (data, status, headers, config) {
        navega.main = data;
    }).error(function (data, status, headers, config) {

    });

    navega.invalidSession = function () {
        $http({
            method: 'GET',
            url: "../LogoutControl",
            headers: {'Content-Type': 'application/json'}
        }).success(function (data, status, headers, config) {
            alert(data);
        }).error(function (data, status, headers, config) {

        });
    };
}
;

