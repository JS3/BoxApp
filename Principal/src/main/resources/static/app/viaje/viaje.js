'use strict';

angular.module('myApp.viaje', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/viaje', {
    templateUrl: 'viaje/viaje.html',
    controller: 'ViajeCtrl'
  });
}])


.controller('ViajeCtrl', ['$scope','tasks','$location',function($scope, tasks, $location) {

}]);
