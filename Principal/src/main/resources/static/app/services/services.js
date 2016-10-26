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
            }
        };
    })
    .factory('tasks', function($resource) {
            
        return $resource('/task',{},{ get: { method: 'GET', isArray: true} });
    })
    .factory('solicitantes', function($resource) {
            
        return $resource('/solicitante',{},{ get: { method: 'GET', isArray: true} });
    })
    .factory('mensajeros', function($resource) {
            
        return $resource('/mensajero',{},{ get: { method: 'GET', isArray: true} });
    });