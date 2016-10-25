'use strict';

angular.module('myApp.productos', ['ngRoute'])

    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/productos', {
            templateUrl: 'productos/productos.html',
            controller: 'ProductosCtrl'
        });
    }])

    .controller('ProductosCtrl', ['$scope', function ($scope) {

        $scope.nombreProducto        = "";
        $scope.descripcionProducto   = "";
        $scope.pesoLibrasProducto    = "";
        $scope.delicadoProducto      = "";
        $scope.paisOrigenProducto    = "";
        $scope.paisDestinoProducto   = "";
        $scope.ciudadOrigenProducto  = "";
        $scope.ciudadDestinoProducto = "";

        

    }]);
