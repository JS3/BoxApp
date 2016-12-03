//MstrJL
'use strict';

angular.module('myApp.productosEntregados', ['ngRoute'])

    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/productosEntregados', {
            templateUrl: 'productosEntregados/productosEntregados.html',
            controller: 'ProductosCtrl'
        });
    }])

    .controller('ProductosCtrl', ['$scope', 'GetPE', function ($scope, GetPE) {
        $scope.Lista = GetPE.query();  
    }]);
