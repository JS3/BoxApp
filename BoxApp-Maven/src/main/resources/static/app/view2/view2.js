'use strict';

angular.module('myApp.view2', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view2', {
    templateUrl: 'view2/view2.html',
    controller: 'View2Ctrl'
  });
}])


.controller('View2Ctrl', ['$scope','tasks',function($scope, tasks) {
        $scope.description="";
        $scope.priority ="";
        
        $scope.agregarFabrica = function(){
           
            if (!isNaN($scope.priority)){
                if($scope.priority<=10  && $scope.priority>0){
                    
                    
                    var newitem={"description":$scope.description,"priority":$scope.priority};
                    
                    tasks.save(newitem,function(){
                        console.info("saved   "+ newitem);
                    });
                    
                    //service1.addTodo({propiedad1:$scope.propiedad1,propiedad2:$scope.propiedad2});
                 $scope.description="";
                 $scope.priority="";
                // alert("Sent!!");
                }
               
            }else{
                alert("error priority");
            }
 
            
           
            
        }

}]);