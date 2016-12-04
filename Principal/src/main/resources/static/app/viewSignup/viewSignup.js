'use strict';

angular.module('myApp.viewSignup', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider) {
                $routeProvider.when('/viewSignup', {
                    templateUrl: 'viewSignup/viewSignup.html',
                    controller: 'ViewSignupCtrl'
                });
            }])

        .controller('ViewSignupCtrl', ['$scope', '$http', '$location', 'signupFactory', function ($scope, $http, $location, signupFactory) {
                $scope.username = "";
                $scope.email = "";
                $scope.password = "";

                $scope.register = function () {
                    var newUser = {
                        user: $scope.username,
                        email: $scope.email,
                        password: CryptoJS.SHA1($scope.password),
                        rol: "USER"
                    };
                    signupFactory.save(newUser, function () {
                        // success
                        console.info("Se ha registrado: "
                                + newUser.user + " " + newUser.email + " " + newUser.password + " " + newUser.rol);
                        $location.path("/viewLogin");
                    }, function (response) {
                        // failed
                        console.info("Ha ocurrido un error: " + response);
                        $scope.password = "";
                    });
                };
            }]);