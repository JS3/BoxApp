'use strict';
angular.module('services.module1', ['ngRoute','ngResource'])

//    .factory('service1', function () {
//        var data = {
//            listado: []
//        };
//        return {
//            getListado: function () {
//                return data.listado;
//            },
//            addTodo: function (todo) {
//                data.listado.push(todo);
//            }};
//    })
    .factory('tasks', function($resource) {
            
        return $resource('/task',{},{ get: { method: 'GET', isArray: true
        
        
        
    }.factory('Post', function($resource) {
        return $resource('/viajes'); 
    })
    .factory('Get', function($resource) {
        return $resource('/viajes', {},
            {get:{method:'GET', isArray:true}}); 
    })
    
     });
        });

