'use strict';

angular.module('myApp.viewSignup', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider) {
                $routeProvider.when('/viewSignup', {
                    templateUrl: 'viewSignup/viewSignup.html',
                    controller: 'ViewSignupCtrl'
                });
            }])

        .controller('ViewSignupCtrl', ['$scope', '$rootScope', '$location', 'signupFactory', 'signupUsernameValidation', 'signupEmailValidation', function ($scope, $rootScope, $location, signupFactory, signupUsernameValidation, signupEmailValidation) {
                $scope.username = "";
                $scope.email = "";
                $scope.password = "";

                $scope.register = function () {
                    signupUsernameValidation.get({username: $scope.username}, function () {
                        // Validacion correcta: username no existe.
                        var mail = $scope.email.replace(".", "--dot--");
                        signupEmailValidation.get({email: mail}, function () {
                            // Validacion correcta: email no existe.
                            var newUser = {
                                "user": $scope.username,
                                "email": $scope.email,
                                "password": (CryptoJS.SHA1($scope.password)).toString(),
                                "rol": "USER"
                            };
                            signupFactory.save(newUser, function () {
                                // success
                                alert("Usted se ha registrado satisfactoriamente.\n"
                                        + "¡Bienvenido a BoxApp, " + newUser.user + "!");
                                $rootScope.authenticated = true;
                                $location.path("/view1");
                            }, function () {
                                // failed
                                alert("Ha ocurrido un error al intentar registrarse.\n"
                                        + "Inténtelo de nuevo.");
                                $scope.password = "";
                            });
                        }, function () {
                            // Validacion incorrecta: email ya existe.
                            alert("El email ya existe.\n"
                                    + "Intente con otro");
                        });
                    }, function () {
                        // Validacion incorrecta: username ya existe.
                        alert("El username ya existe.\n"
                                + "Intente con otro");
                    });
                };
            }]);