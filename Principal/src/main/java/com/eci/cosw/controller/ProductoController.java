package com.eci.cosw.controller;

import com.eci.cosw.model.Producto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Juan Sebastian Martinez Serna
 */
@RestController
@RequestMapping(value = "/productos")
public class ProductoController {


    public ProductoController() {

    }

    /**
     * Retorna todos los productos que existen en el sistema
     * @return Lista de todos los productos en el sistema
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<Producto> getProductos() {
        List<Producto> productos = null;
        return productos;
    }

    /**
     * Busca un producto especificado por el id y lo retorna
     * @param idProducto id del producto a buscar
     * @return Prodcuto especificado
     */
    @RequestMapping(value = "/{idProducto}", method = RequestMethod.GET)
    public Producto getProductoById(@PathVariable("idProducto") Integer idProducto) {
        return null;
    }

    /**
     * Busca y retorna todos los productos con nombre el nombre especificado
     * @param nombre
     * @return
     */
    @RequestMapping(value = "/{nombre}", method = RequestMethod.GET)
    public List<Producto> getProductosByName(@PathVariable("nombre") String nombre) {
        List<Producto> productos = null;
        return productos;
    }

    /**
     * Busca y retorna todos los productos pendientes por entregar
     * @return
     */
    @RequestMapping(value = "/pendientes", method = RequestMethod.GET)
    public List<Producto> getProductosPendientes() {
        List<Producto> productos = null;
        return productos;
    }

    /**
     * Busca y retorna todos los productos pendientes por entregar que se encuentran en el origen
     * @return
     */
    @RequestMapping(value = "/pendientes/origen", method = RequestMethod.GET)
    public List<Producto> getProductosPendientesOrigen() {
        List<Producto> productos = null;
        return productos;
    }

    /**
     * Busca y retorna todos los productos pendientes por entregar que ya llegaron al destino
     * @return
     */
    @RequestMapping(value = "/pendientes/destino", method = RequestMethod.GET)
    public List<Producto> getProductosPendientesDestino() {
        List<Producto> productos = null;
        return productos;
    }

    /**
     * Busca y retorna todos los productos pendientes por entregar de un pais sin importar si
     * es el pais de origen o de destino
     * @param pais
     * @return
     */
    @RequestMapping(value = "/pendientes/{pais}", method = RequestMethod.GET)
    public List<Producto> getProductosPendientesPais(@PathVariable("pais") String pais) {
        List<Producto> productos = null;
        return productos;
    }

    /**
     * Busca y retorna todos los productos pendientes por entregar que tienen como pais de
     * origen al pais especificado
     * @param pais
     * @return
     */
    @RequestMapping(value = "/pendientes/{pais}/origen", method = RequestMethod.GET)
    public List<Producto> getProductosPendientesPaisOrigen(@PathVariable("pais") String pais) {
        List<Producto> productos = null;
        return productos;
    }

    /**
     * Busca y retorna todos los productos pendientes por entregar que tienen como pais de
     * destino al pais especificado
     * @param pais
     * @return
     */
    @RequestMapping(value = "/pendientes/{pais}/destino", method = RequestMethod.GET)
    public List<Producto> getProductosPendientesPaisDestino(@PathVariable("pais") String pais) {
        List<Producto> productos = null;
        return productos;
    }

    /**
     * Busca y retorna todos los productos entregados por entregar
     * @return
     */
    @RequestMapping(value = "/entregados", method = RequestMethod.GET)
    public List<Producto> getProductosEntregados() {
        List<Producto> productos = null;
        return productos;
    }

    /**
     * Busca y retorna todos los productos entregados por entregar de un pais sin importar si
     * es el pais de origen o de destino
     * @param pais
     * @return
     */
    @RequestMapping(value = "/entregados/{pais}", method = RequestMethod.GET)
    public List<Producto> getProductosEntregadosPais(@PathVariable("pais") String pais) {
        List<Producto> productos = null;
        return productos;
    }

    /**
     * Busca y retorna todos los productos entregados por entregar que tienen como pais de
     * origen al pais especificado
     * @param pais
     * @return
     */
    @RequestMapping(value = "/entregados/{pais}/origen", method = RequestMethod.GET)
    public List<Producto> getProductosEntregadosPaisOrigen(@PathVariable("pais") String pais) {
        List<Producto> productos = null;
        return productos;
    }

    /**
     * Busca y retorna todos los productos entregados por entregar que tienen como pais de
     * destino al pais especificado
     * @param pais
     * @return
     */
    @RequestMapping(value = "/entregados/{pais}/destino", method = RequestMethod.GET)
    public List<Producto> getProductosEntregadosPaisDestino(@PathVariable("pais") String pais) {
        List<Producto> productos = null;
        return productos;
    }
}
