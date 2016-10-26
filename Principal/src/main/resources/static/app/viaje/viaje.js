'use strict';

angular.module('myApp.viaje', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/viaje', {
    templateUrl: 'viaje/viaje.html',
    controller: 'ViajeCtrl'
  });
}])


.controller(
    'ViajeCtrl', [
        '$scope','mensajeros',
        function($scope, mensajeros) {
            
            $scope.mensajeroAprobado = function(){  
//                console.log("S");
//                mensajeros.get(
//                    function(data){
//                        console.info("get/1"); //Aquí se debe incluir el numero de identificación del Login
//                        if(data == null){
//                            console.log("e");
//                        }
//                        console.log("e");
//                    }
//                );
                return true;
            };
        }
    ]    
);
