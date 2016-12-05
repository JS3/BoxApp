'use strict';

angular.module('myApp.misviajes', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/misviajes', {
    templateUrl: 'misviajes/misviajes.html',
    controller: 'misviajesCtrl'
  });
}])

.controller('misviajesCtrl', ['$scope', 'Get', function ($scope, Get) {
        $scope.listado = Get.query();  
}]);
//.controller('View3Ctrl', ['$scope', 'Get', function ($scope, fabricService) {
//        $scope.listado = fabricService.getListado();  
//}]);