//MstrJL
'use strict';

angular.module('myApp.detalleProducto', ['ngRoute'])

    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/detalleProducto', {
            templateUrl: 'detalleProducto/detalleProducto.html',
            controller: 'ProductosCtrl'
        });
    }])

    .controller('ProductosCtrl', ['$scope', 'GetD', function ($scope, Get) {
        $scope.Lista = Get.query();  
    }]);
