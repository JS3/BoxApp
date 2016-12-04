'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [
    'ngRoute',
    'myApp.view1',
    'myApp.view2',
    'myApp.view3',
    'myApp.viaje',
    'myApp.misviajes',
    'myApp.viewLogin',
    'myApp.viewRegistroSolicitante',
    'myApp.viewSignup',
    'myApp.productos',
    'services.module1',
    'myApp.version'
]).
        config(['$routeProvider', '$httpProvider', function ($routeProvider, $httpProvider) {
                $routeProvider.otherwise({redirectTo: '/view1'});
                $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';

            }])

        .controller('myApp.principal', ['$scope', '$rootScope', '$http', '$location', function ($scope, $rootScope, $http, $location) {

                $scope.logout = function () {
                    $http.post('/logout', {}).success(function () {
                        $rootScope.authenticated = false;
                        $location.path("/view1");
                    }).error(function (data) {
                        $rootScope.authenticated = false;
                    });
                };

            }]);




