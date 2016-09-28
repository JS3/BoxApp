'use strict';

angular.module('myApp.perfilMensajero', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/perfilMensajero', {
    templateUrl: 'perfilMensajero/perfilMensajero.html',
    controller: 'PerfilMensajeroCtrl'
  });
}])


.controller('PerfilMensajeroCtrl', ['$scope','$rootScope','tasks','$location',function($scope, $rootScope, tasks, $location) {
        $scope.razon="";
        
        $scope.agregarMensajero = function(){
            if($scope.razon.length > 0){
                alert("Usted ahora es un Mensajero.");
                $rootScope.mesajeroAprobado = true;
                $location.path("/viaje");
            }
            else
                alert("Por favor de una razon.");
        };

}]);