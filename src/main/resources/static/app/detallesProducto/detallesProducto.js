//MstrJL
'use strict';

angular.module('myApp.detallesProducto', ['ngRoute'])

    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/detallesProducto', {
            templateUrl: 'detallesProducto/detallesProducto.html',
            controller: 'DetallesProductoCtrl'
        });
    }])

    .controller('DetallesProductoCtrl', ['$scope','$rootScope', 'Detalle', '$location', function ($scope, $rootScope, Detalle, $location) {
//            console.info("Hola "+$rootScope.n);
//        Detalle.get({n:$rootScope.n},function(data){
            if($rootScope.n !== undefined){
                Detalle.get({n:$rootScope.n},function(data){
                        $scope.idProducto = data.idProducto;
                        $scope.nombre = data.nombre;
                        $scope.ubicacion = data.ubicacion;
                        $scope.descripcion = data.descripcion;
                        $scope.paisOrigen = data.paisOrigen;
                        $scope.ciudadOrigen = data.ciudadOrigen;
                        $scope.paisDestino = data.paisDestino;
                        $scope.ciudadDestino = data.ciudadDestino;
                        $scope.peso = data.peso;
                        $scope.delicado = data.delicado;
                        $scope.entregado = data.entregado;
                });
                console.info("Es "+$rootScope.n);
            }
    }]);