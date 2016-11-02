'use strict';

angular.module('myApp.viewRegistroSolicitante', ['ngRoute'])

.config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/viewRegistroSolicitante', {
            templateUrl: 'viewRegistroSolicitante/viewRegistroSolicitante.html',
            controller: 'ViewRegistroSolicitanteCtrl'
        });
    }])

    .controller('ViewRegistroSolicitanteCtrl', ['$scope', 'solicitante', function ($scope, solicitante) {

            $scope.nombrers = "";
            $scope.primerApellidors = "";
            $scope.segundoApellidors = "";
            $scope.cedulars=0;
            $scope.generors="Femenino";
            $scope.edadrs=18;
            $scope.fechaNacimientors;
            $scope.telefonors=0;
            $scope.direccionrs = "";
            $scope.paisrs = "";
            $scope.municipiors = "";
            $scope.codigoPostalrs=0;

            $scope.addSolicitante = function() {

                 var newSolicitante={"nombre":$scope.nombrers,"primerApellido":$scope.primerApellidors,
                                     "segundoApellido":$scope.segundoApellidors, "genero":$scope.generors,
                                     "cedula":$scope.cedulars, "edad":$scope.edadrs, "fechaNacimiento":$scope.fechaNacimientors,
                                     "telefono":$scope.telefonors, "direccion":$scope.direccionrs, "pais":$scope.paisrs,
                                     "municipio":$scope.municipiors, "codigoPostal": $scope.codigoPostalrs};

                    //solicitante.save(newSolicitante, function(){
                    console.info("Se ha registrado: "+ newSolicitante);
                    //});

                $scope.nombrers = "";
                $scope.primerApellidors = "";
                $scope.segundoApellidors = "";
                $scope.cedulars=0;
                $scope.generors="Femenino";
                $scope.edadrs=0;
                $scope.fechaNacimientors;
                $scope.telefonors=0;
                $scope.direccionrs = "";
                $scope.paisrs = "";
                $scope.municipiors = "";
                $scope.codigoPostalrs=0;
            }
    }]);
