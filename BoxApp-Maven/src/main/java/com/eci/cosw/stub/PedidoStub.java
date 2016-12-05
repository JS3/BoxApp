/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.stub;

import com.eci.cosw.model.Pedido;
import java.util.List;

/**
 *
 * @author jose
 */
public interface PedidoStub {
    
    public List<Pedido> getPedidos();
    public Pedido getPedidoByCod(Integer codPedido);
    public List<Pedido> getPedidosBySolicitante(int idSolicitante);
    public List<Pedido> getPedidosByProducto(int idProducto);
    public void addPedido(Pedido pedido);
}
