/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.stub;

import com.eci.cosw.model.Pedido;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Service;

/**
 *
 * @author jose
 */
@Service
public class PedidoStubImpl implements PedidoStub{
    private List<Pedido> pedidoList= new ArrayList<>();

    @Override
    public List<Pedido> getPedidos() {
        return pedidoList;
    }

    @Override
    public Pedido getPedidoByCod(Integer codPedido) {
        Pedido pedido = null;

        for(int i=0; i <= pedidoList.size(); i++) {
            Pedido p = pedidoList.get(i);
            if (Objects.equals(p.getCodigoPedido(), codPedido)) {
                pedido = p;
            }
        }
        return pedido;
    }

    @Override
    public List<Pedido> getPedidosBySolicitante(int idSolicitante) {
        List<Pedido> pedidos = new ArrayList<>();
        this.pedidoList.stream().filter((p) -> (p.getSolicitante().getIdSolicitante() == idSolicitante)).forEach((p) -> {
            pedidos.add(p);
        });
        return pedidos;
    }

    @Override
    public List<Pedido> getPedidosByMensajero(int idMensajero) {
        List<Pedido> pedidos = new ArrayList<>();
        this.pedidoList.stream().filter((p) -> (p.getMensajero().getIdSolicitante() == idMensajero)).forEach((p) -> {
            pedidos.add(p);
        });
        return pedidos;
    }

    @Override
    public void addPedido(Pedido pedido) {
        pedidoList.add(pedido);
    }
}
