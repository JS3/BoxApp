'use strict';
angular.module('services.module1', ['ngRoute','ngResource'])

    .factory('service1', function () {
        var data = {
            listado: []
        };
        return {
            getListado: function () {
                return data.listado;
            },
            addTodo: function (todo) {
                data.listado.push(todo);
            }};
    })
     .factory('Post', function($resource) {
        return $resource('/viajes'); 
    })
     .factory('Get', function($resource) {
        return $resource('/viajes', {},
            {get:{method:'GET', isArray:true}}); 
    })//MSTRJL 
     .factory('GetPE', function($resource) { 
        return $resource('/productos/entregados', {},
            {get:{method:'GET', isArray:true}}); 
    })//MSTRJL 
     .factory('GetD', function($resource) { 
        return $resource('/productos/nombre/a', {},
            {get:{method:'GET', isArray:true}}); 
    })
      .factory('Clients', function($resource){
        return $resource('/clients',{},{
            get: {
                method: 'GET',
                isArray: true               
            }
        });
    })
    .factory('tasks', function($resource) {
            
        return $resource('/task',{},{ get: { method: 'GET', isArray: true }
                         });
    })

    .factory('productoPOST', function($resource) {
        return $resource('/productos');
    })

    .factory('productoGET', function($resource) {
        return $resource('/productos', {}, {
                    get: {
                        method: 'GET',
                        isArray: true
                    }
                });
    })

    .factory ('solicitante', function($resource){
        return $resource('/solicitante');
    })

    .factory ('solicitanteGet', function($resource){
      return $resource('/solicitante', {}, {
                get: {
                    method: 'GET',
                    isArray: true
                }
            });
    });