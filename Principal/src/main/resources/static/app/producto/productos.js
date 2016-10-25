'use strict';

angular.module('myApp.viweProductos', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider) {
                $routeProvider.when('/poductos', {
                    templateUrl: 'poducto/poductos.html',
                    controller: 'PoductosCtrl'
                });
            }])

        .controller('PoductosCtrl', ['$scope', function ($scope) {

            }]);
