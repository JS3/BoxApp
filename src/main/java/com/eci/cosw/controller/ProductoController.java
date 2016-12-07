package com.eci.cosw.controller;

import com.eci.cosw.model.Producto;
import com.eci.cosw.stub.ProductStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Juan Sebastian Martinez Serna
 */
@RestController
@RequestMapping(value = "/productos")
public class ProductoController {

    @Autowired
    private ProductStub productStub;

    public ProductoController() {

    }

    /**
     * Retorna todos los productos que existen en el sistema
     * @return Lista de todos los productos en el sistema
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<Producto> getProductos() {
        return productStub.getProductos();
    }

    /**
     * Busca un productos especificado por el id y lo retorna
     * @param idProducto id del productos a buscar
     * @return Prodcuto especificado
     */
    @RequestMapping(value = "/{idProducto}", method = RequestMethod.GET)
    public Producto getProductoById(@PathVariable("idProducto") Integer idProducto) {
        return productStub.getProductoById(idProducto);
    }

    /**
     * Busca y retorna todos los productos con nombre el nombre especificado
     * @param nombre
     * @return
     */
    @RequestMapping(value = "/nombre/{nombre}", method = RequestMethod.GET)
    public List<Producto> getProductosByName(@PathVariable("nombre") String nombre) {
        return productStub.getProductosByName(nombre);
    }

    /**
     * Busca y retorna todos los productos pendientes por entregar
     * @return
     */
    @RequestMapping(value = "/pendientes", method = RequestMethod.GET)
    public List<Producto> getProductosPendientes() {
        return productStub.getProductosPendientes();
    }

    /**
     * Busca y retorna todos los productos pendientes por entregar que se encuentran en el origen
     * @return
     */
    @RequestMapping(value = "/pendientes/origen", method = RequestMethod.GET)
    public List<Producto> getProductosPendientesOrigen() {
        return productStub.getProductosPendientesOrigen();
    }

    /**
     * Busca y retorna todos los productos pendientes por entregar que ya llegaron al destino
     * @return
     */
    @RequestMapping(value = "/pendientes/destino", method = RequestMethod.GET)
    public List<Producto> getProductosPendientesDestino() {
        return productStub.getProductosPendientesDestino();
    }

    /**
     * Busca y retorna todos los productos pendientes por entregar de un pais sin importar si
     * es el pais de origen o de destino
     * @param pais
     * @return
     */
    @RequestMapping(value = "/pendientes/{pais}", method = RequestMethod.GET)
    public List<Producto> getProductosPendientesPais(@PathVariable("pais") String pais) {
        return productStub.getProductosPendientesPais(pais);
    }

    /**
     * Busca y retorna todos los productos pendientes por entregar que tienen como pais de
     * origen el pais especificado
     * @param pais
     * @return
     */
    @RequestMapping(value = "/pendientes/{pais}/origen", method = RequestMethod.GET)
    public List<Producto> getProductosPendientesPaisOrigen(@PathVariable("pais") String pais) {
        return productStub.getProductosPendientesPaisOrigen(pais);
    }

    /**
     * Busca y retorna todos los productos pendientes por entregar que tienen como pais de
     * destino al pais especificado
     * @param pais
     * @return
     */
    @RequestMapping(value = "/pendientes/{pais}/destino", method = RequestMethod.GET)
    public List<Producto> getProductosPendientesPaisDestino(@PathVariable("pais") String pais) {
        return productStub.getProductosPendientesPaisDestino(pais);
    }

    /**
     * Busca y retorna todos los productos entregados
     * @return
     */
    @RequestMapping(value = "/entregados", method = RequestMethod.GET)
    public List<Producto> getProductosEntregados() {
        return productStub.getProductosEntregados();
    }

    /**
     * Busca y retorna todos los productos entregados en un pais sin importar si
     * es el pais de origen o de destino
     * @param pais
     * @return
     */
    @RequestMapping(value = "/entregados/{pais}", method = RequestMethod.GET)
    public List<Producto> getProductosEntregadosPais(@PathVariable("pais") String pais) {
        return productStub.getProductosEntregadosPais(pais);
    }

    /**
     * Busca y retorna todos los productos entregados que tienen como pais de
     * origen al pais especificado
     * @param pais
     * @return
     */
    @RequestMapping(value = "/entregados/{pais}/origen", method = RequestMethod.GET)
    public List<Producto> getProductosEntregadosPaisOrigen(@PathVariable("pais") String pais) {
        return productStub.getProductosEntregadosPaisOrigen(pais);
    }

    /**
     * Busca y retorna todos los productos entregados que tienen como pais de
     * destino al pais especificado
     * @param pais
     * @return
     */
    @RequestMapping(value = "/entregados/{pais}/destino", method = RequestMethod.GET)
    public List<Producto> getProductosEntregadosPaisDestino(@PathVariable("pais") String pais) {
        return productStub.getProductosEntregadosPaisDestino(pais);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> postProducto(@RequestBody Producto producto){
        productStub.addProducto(producto);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
