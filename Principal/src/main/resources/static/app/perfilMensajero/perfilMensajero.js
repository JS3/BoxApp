'use strict';

angular.module('myApp.perfilMensajero', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/perfilMensajero', {
    templateUrl: 'perfilMensajero/perfilMensajero.html',
    controller: 'PerfilMensajeroCtrl'
  });
}])


.controller(
    'PerfilMensajeroCtrl', [
        '$scope','solicitantes','mensajeros','$location',
        function($scope, solicitantes, mensajeros, $location) {
//                    var newitem={"idSolicitante":"224", "nombre":"A"};
            
            solicitantes.get(
                function(data){
                    console.info("get/223"); //Aquí se debe incluir el numero de identificación del Login
                    $scope.solicitante = data;   
                }
            );
    
            $scope.agregarSolicitante = function(){                
                if($scope.razon.length > 0){

                    $scope.mensaje = " ahora es un mensajero.";
//                    $location.path("/viaje");
                }
                else
                    alert("Por favor, de una razon.");
            };
            
            
            $scope.agregarMensajero = function(x){     
                
                mensajeros.save(
                    x, function(){
                        console.info("saved   "+ x);
                    }
                );    
            };
        }
    ]
);