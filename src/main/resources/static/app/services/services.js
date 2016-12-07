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
    })//MSTRJL Productos Entregados
    .factory('GetPE', function($resource) { 
        return $resource('/productos/entregados', {},
            {get:{method:'GET', isArray:true}}); 
    })//MSTRJL Detalle de Producto
    .factory('Detalle', function($resource) { 
        return $resource('/productos/:n', {},
            {get:{method:'GET', isArray:false}}); 
    })//MSTRJL Productos Pendientes
    .factory('GetPP', function($resource) { 
        return $resource('/productos/pendientes', {},
            {get:{method:'GET', isArray:true}}); 
    })//MSTRJL Solicitante para convertirse en Mensajero
    .factory('GetSM', function($resource) { 
        return $resource('/solicitante/:n', {},
            {get:{method:'GET', isArray:false}}); 
    })//MSTRJL Se llama para crear un mensajero
    .factory('mensajeros', function($resource) {            
        return $resource('/mensajero',{},
            {get:{ method:'GET', isArray: true}});
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
    })

    .factory('signupFactory', function($resource) {
        return $resource('/users', {}, { 
            get: { 
                method: 'GET', 
                isArray: true
            }
        });
    })
        
    .factory('signupUsernameValidation', function($resource) {
        return $resource('/users/username/:username');
        })
        
    .factory('signupEmailValidation', function($resource) {
        return $resource('/users/email/:email');
        });
