//MstrJL
'use strict';

angular.module('myApp.productosPendientes', ['ngRoute'])

    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/productosPendientes', {
            templateUrl: 'productosPendientes/productosPendientes.html',
            controller: 'ProductosPendientesCtrl'
        });
    }])

    .controller('ProductosPendientesCtrl', ['$scope','$rootScope', 'GetPP', 'Detalle', '$location', 
    function ($scope, $rootScope, GetPP, Detalle, $location) {
        $scope.listaProducto = GetPP.query(); 
//        $scope.mensaje = " ahora es un mensajero.";
        
//        Detalle.get({nit:"0"},function(data){
//            console.info("get postre  ");
//            $scope.lp = data;   
//        });
        
        $scope.mover = function(l){
            $rootScope.n = l;        
            $location.path("/detallesProducto");            
        };
    }]);
