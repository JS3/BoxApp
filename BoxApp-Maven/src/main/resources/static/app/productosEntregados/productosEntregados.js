//MstrJL
'use strict';

angular.module('myApp.productosEntregados', ['ngRoute'])

    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/productosEntregados', {
            templateUrl: 'productosEntregados/productosEntregados.html',
            controller: 'ProductosEntregadosCtrl'
        });
    }])

    .controller('ProductosEntregadosCtrl', ['$scope','$rootScope', 'GetPE', 'Detalle', '$location', 
    function ($scope, $rootScope, GetPE, Detalle, $location) {
        $scope.listaProducto = GetPE.query(); 
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
