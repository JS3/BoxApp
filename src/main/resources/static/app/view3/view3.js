'use strict';

angular.module('myApp.view3', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view3', {
    templateUrl: 'view3/view3.html',
    controller: 'View3Ctrl'
  });
}])

.controller('View3Ctrl', ['$scope', 'tasks','$filter', function($scope, tasks, $filter) {
            
       
          tasks.get(function(data){
                        console.info("get   ");
                        $scope.taskList=data;
                    });
        
        var orderBy = $filter('orderBy');
       
        $scope.order = function(predicate) {
            $scope.predicate = predicate;
            $scope.reverse = ($scope.predicate === predicate) ? !$scope.reverse : false;
            $scope.taskList = orderBy($scope.taskList, predicate, $scope.reverse);
        };
        $scope.order('age', true);

}]);