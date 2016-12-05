'use strict';

angular.module('myApp.viaje', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/viaje', {
    templateUrl: 'viaje/viaje.html',
    controller: 'viajeCtrl'
  });
}])


.controller('viajeCtrl', ['$scope', 'Post', function ($scope,Post) {
        $scope.Origen;
        $scope.Destino;
        $scope.Ida;
        $scope.Llegada;
        
        $scope.agregarViaje = function() {
            
        var r = confirm("Seguro quieres ingresar el viaje?");
            if (r == true) {
                Post.save({origen:$scope.Origen,destino:$scope.Destino,ida:$scope.Ida,llegada:$scope.Llegada});
            } else {
                alert("Has cancelado");
            }
            
           
                    
           
                  
                    
                
                }
    
                   
}]);

