package com.eci.cosw.stub;

import com.eci.cosw.model.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juan Sebastian Martinez Serna on 3/10/16.
 */
@Service
public class ProductStubImpl implements ProductStub {

    private List<Producto> productos = new ArrayList<>();

    public ProductStubImpl() {
//        Producto producto = new Producto(0, Producto.ORIGEN, "Nombresito", "No presenta", "Colombia",
//                "Bogota", "USAs", "Los Mayamis", 2.35, false);
//
//        productos.add(producto);
    }

    @Override
    public List<Producto> getProductos() {
        return this.productos;
    }

    @Override
    public Producto getProductoById(Integer idProducto) {
        Producto producto = null;
        boolean ok = false;
        for (int i = 0; i < this.productos.size() && !ok; i++) {
            Producto p = productos.get(i);
            if (p.getIdProducto() == idProducto) {
                producto = p;
            }
        }
        return producto;
    }

    @Override
    public List<Producto> getProductosByName(String nombre) {
        List<Producto> productos = new ArrayList<>();
        for (Producto p : this.productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                productos.add(p);
            }
        }
        return productos;
    }

    @Override
    public List<Producto> getProductosPendientes() {
        List<Producto> productos = new ArrayList<>();
        for (Producto p : this.productos) {
            if (!p.getEntregado()) {
                productos.add(p);
            }
        }
        return productos;
    }

    @Override
    public List<Producto> getProductosPendientesOrigen() {
        List<Producto> productos = new ArrayList<>();
        for (Producto p : this.productos) {
            if (!p.getEntregado() && p.getUbicacion().equalsIgnoreCase(Producto.ORIGEN)) {
                productos.add(p);
            }
        }
        return productos;
    }

    @Override
    public List<Producto> getProductosPendientesDestino() {
        List<Producto> productos = new ArrayList<>();
        for (Producto p : this.productos) {
            if (!p.getEntregado() && p.getUbicacion().equalsIgnoreCase(Producto.DESTINO)) {
                productos.add(p);
            }
        }
        return productos;
    }

    @Override
    public List<Producto> getProductosPendientesPais(String pais) {
        List<Producto> productos = new ArrayList<>();
        for (Producto p : this.productos) {
            if (!p.getEntregado()
                    && (p.getPaisDestino().equalsIgnoreCase(pais) || p.getPaisOrigen().equalsIgnoreCase(pais))) {
                productos.add(p);
            }
        }
        return productos;
    }

    @Override
    public List<Producto> getProductosPendientesPaisOrigen(String pais) {
        List<Producto> productos = new ArrayList<>();
        for (Producto p : this.productos) {
            if (!p.getEntregado() && p.getPaisOrigen().equalsIgnoreCase(pais)) {
                productos.add(p);
            }
        }
        return productos;
    }

    @Override
    public List<Producto> getProductosPendientesPaisDestino(String pais) {
        List<Producto> productos = new ArrayList<>();
        for (Producto p : this.productos) {
            if (!p.getEntregado() && p.getPaisDestino().equalsIgnoreCase(pais)) {
                productos.add(p);
            }
        }
        return productos;
    }

    @Override
    public List<Producto> getProductosEntregados() {
        List<Producto> productos = new ArrayList<>();
        for (Producto p : this.productos) {
            if (p.getEntregado()) {
                productos.add(p);
            }
        }
        return productos;
    }

    @Override
    public List<Producto> getProductosEntregadosPais(String pais) {
        List<Producto> productos = new ArrayList<>();
        for (Producto p : this.productos) {
            if (p.getEntregado()
                    && (p.getPaisDestino().equalsIgnoreCase(pais) || p.getPaisOrigen().equalsIgnoreCase(pais))) {
                productos.add(p);
            }
        }
        return productos;
    }

    @Override
    public List<Producto> getProductosEntregadosPaisOrigen(String pais) {
        List<Producto> productos = new ArrayList<>();
        for (Producto p : this.productos) {
            if (p.getEntregado() && p.getPaisOrigen().equalsIgnoreCase(pais)) {
                productos.add(p);
            }
        }
        return productos;
    }

    @Override
    public List<Producto> getProductosEntregadosPaisDestino(String pais) {
        List<Producto> productos = new ArrayList<>();
        for (Producto p : this.productos) {
            if (p.getEntregado() && p.getPaisDestino().equalsIgnoreCase(pais)) {
                productos.add(p);
            }
        }
        return productos;
    }

    @Override
    public void addProducto(Producto producto) {
        this.productos.add(producto);
    }
}
