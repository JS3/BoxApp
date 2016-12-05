'use strict';

angular.module('myApp.misproductos', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/misproductos', {
    templateUrl: 'misproductos/misproductos.html',
    controller: 'misproductosCtrl'
  });
}])

.controller('misproductosCtrl', ['$scope', 'productoGET', function ($scope, Get) {
        $scope.listado = Get.query();  
        
       
}]);


//.controller('View3Ctrl', ['$scope', 'Get', function ($scope, fabricService) {
//        $scope.listado = fabricService.getListado();  
//}]);

