'use strict';

angular.module('myApp.productos', ['ngRoute'])

    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/productos', {
            templateUrl: 'productos/productos.html',
            controller: 'ProductosCtrl'
        });
    }])

    .controller('ProductosCtrl', ['$scope', 'productoPOST', function ($scope, productoPOST) {

        $scope.nombreProducto        = "";
        $scope.descripcionProducto   = "";
        $scope.pesoLibrasProducto    = 0.0;
        $scope.delicadoProducto      = false;
        $scope.paisOrigenProducto    = "";
        $scope.paisDestinoProducto   = "";
        $scope.ciudadOrigenProducto  = "";
        $scope.ciudadDestinoProducto = "";

        $scope.addProducto = function () {

            var newProducto =
                {   nombre        : $scope.nombreProducto,
                    ubicacion     : "ORIGEN",
                    descripcion   : $scope.descripcionProducto,
                    delicado      : $scope.delicadoProducto,
                    paisOrigen    : $scope.paisOrigenProducto,
                    paisDestino   : $scope.paisDestinoProducto,
                    ciudadOrigen  : $scope.ciudadOrigenProducto,
                    ciudadDestino : $scope.ciudadDestinoProducto,
                    peso          : $scope.pesoLibrasProducto
                };
//                {"idProducto":0,"ubicacion":"ORIGEN","nombre":"Nombresito","descripcion":"No presenta"
//                  paisOrigen":"Colombia","ciudadOrigen":"Bogota","paisDestino":"USAs",
//                  "ciudadDestino":"Los Mayamis","peso":2.35,"delicado":false,"entregado":false}

            console.log(newProducto);

            productoPOST.save(newProducto, function(){
                                    console.info("Se ha registrado: "+ newProducto);
                                });

            alert("Producto registrado: \n"
                + "Nombre      -> " + newProducto.nombre + "\n"
                + "Descripcion -> " + newProducto.descripcion + "\n");

            $scope.nombreProducto        = "";
            $scope.descripcionProducto   = "";
            $scope.pesoLibrasProducto    = 0.0;
            $scope.delicadoProducto      = false;
            $scope.paisOrigenProducto    = "";
            $scope.paisDestinoProducto   = "";
            $scope.ciudadOrigenProducto  = "";
            $scope.ciudadDestinoProducto = "";

        }

    }]);
