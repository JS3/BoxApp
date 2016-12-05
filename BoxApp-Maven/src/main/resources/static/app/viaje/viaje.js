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
            
         
            
              window.alert("se ha ingresado un viaje");
                    
            Post.save({origen:$scope.Origen,destino:$scope.Destino,ida:$scope.Ida,llegada:$scope.Llegada});
                  
                    
                
                }
    
                   
}]);

