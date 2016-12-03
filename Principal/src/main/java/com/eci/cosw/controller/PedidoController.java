/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.controller;

import com.eci.cosw.model.Pedido;
import com.eci.cosw.model.Producto;
import com.eci.cosw.stub.PedidoStub;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jose
 */
@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {
    @Autowired
    private PedidoStub pedidoStub;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Pedido> getPedidos(){
        return pedidoStub.getPedidos();
    }
    
    @RequestMapping(value = "/{codPedido}", method = RequestMethod.GET)
    public Pedido getPedidoByCodigo(@PathVariable("codPedido") Integer codPedido) {
        return pedidoStub.getPedidoByCod(codPedido);
    }
    
    @RequestMapping(value = "/solicitante/{idSolicitante}", method = RequestMethod.GET)
    public List<Pedido> getPedidosBySolicitante(@PathVariable("idSolicitante") int idSolicitante) {
        return pedidoStub.getPedidosBySolicitante(idSolicitante);
    }
    
    @RequestMapping(value = "/Producto/{idProducto}", method = RequestMethod.GET)
    public List<Pedido> getPedidosByMensajero(@PathVariable("idProducto") int idProducto) {
        return pedidoStub.getPedidosByProducto(idProducto);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> postPedido(@RequestBody Pedido pedido){
        pedidoStub.addPedido(pedido);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
