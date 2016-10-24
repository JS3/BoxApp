'use strict';

angular.module('myApp.viewRegistroSolicitante', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider) {
                $routeProvider.when('/viewRegistroSolicitante', {
                    templateUrl: 'viewRegistroSolicitante/viewRegistroSolicitante.html',
                    controller: 'ViewRegistroSolicitanteCtrl'
                });
            }])

        .controller('ViewRegistroSolicitanteCtrl', ['$scope', 'solicitante', function ($scope, solicitante) {

                $scope.nombre = "";
                $scope.primerApellido = "";
                $scope.segundoApellido = "";
                $scope.cedula;
                $scope.genero;
                $scope.email = "";
                $scope.edad;
                $scope.fechaNacimiento;
                $scope.telefono;
                $scope.direccion = "";
                $scope.pais = "";
                $scope.municipio = "";
                $scope.codigoPostal;



            }]);
