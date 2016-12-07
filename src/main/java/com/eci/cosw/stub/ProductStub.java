package com.eci.cosw.stub;

import com.eci.cosw.model.Producto;

import java.util.List;

/**
 * Created by Juan Sebastian Martinez Serna on 3/10/16.
 */
public interface ProductStub {

    /**
     * Retorna la una lista con todos los productos existentes
     * @return Lista con todos los productos existentes
     */
    public List<Producto> getProductos();

    /**
     * Busca y retorna un productos seleccionado por el Id
     * @param idProducto id del productos
     * @return Producto que tiene el id especificado
     */
    public Producto getProductoById(Integer idProducto);

    /**
     * Busca y retorna los productos que tengan el nombre especificado
     * @param nombre nombre del/los productos(s)
     * @return Lista de productos que tiene el nombre especificado
     */
    public List<Producto> getProductosByName(String nombre);

    /**
     * Busca y retorna todos los productos pendientes por entregar
     * @return Lista de los productos pendientes por entregar
     */
    public List<Producto> getProductosPendientes();

    /**
     * Busca y retorna todos los productos pendientes por entregar que
     * aun se encuentran en el origen
     * @return Lista de los productos pendientes por entregar que siguen en el origen
     */
    public List<Producto> getProductosPendientesOrigen();

    /**
     * Busca y retorna todos los prodcutos pendientes por entregar que
     * se encuentra en el lugar de destino
     * @return Lista de productos pendientes por entregar que estan en el destino
     */
    public List<Producto> getProductosPendientesDestino();

    /**
     * Busca y retorna todos los productos pendientes por entregar de un pais sin
     * importar si es el pais de origen o de destino
     * @param pais nombre del pais
     * @return Lista de productos que se encuentran en el pais especificado
     */
    public List<Producto> getProductosPendientesPais(String pais);

    /**
     * Busca y retorna todos los productos pendientes por entregar que tienen como pais de
     * origen el pais especificado
     * @param pais nombre del pais
     * @return Lista de productos que tienen como pais de origen el pais especificado
     */
    public List<Producto> getProductosPendientesPaisOrigen(String pais);

    /**
     * Busca y retorna todos los productos pendientes por entregar que tienen como pais de
     * destino al pais especificado
     * @param pais nombre del pais
     * @return Lista de productos que tienen el pais de destino el especificado
     */
    public List<Producto> getProductosPendientesPaisDestino(String pais);

    /**
     * Busca y retorna todos los productos entregados
     * @return Lista de productos entregados
     */
    public List<Producto> getProductosEntregados();

    /**
     * Busca y retorna todos los productos entregados en un pais sin importar si
     * es el pais de origen o de destino
     * @param pais nombre del pais
     * @return Lista de productos que fueron entregados del pais especificado
     */
    public List<Producto> getProductosEntregadosPais(String pais);

    /**
     * Busca y retorna todos los productos entregados que tienen como pais de
     * origen al pais especificado
     * @param pais nombre del pais
     * @return Lsita de productos entregados que tienen como pais de origen el especificado
     */
    public List<Producto> getProductosEntregadosPaisOrigen(String pais);

    /**
     * Busca y retorna todos los productos entregados que tienen como pais de
     * destino al pais especificado
     * @param pais nombre del pais
     * @return Lsita de productos entregados que tienen como pais de destino el especificado
     */
    public List<Producto> getProductosEntregadosPaisDestino(String pais);

    /**
     * Agrega un nuevo productos
     * @param producto productos a agregar
     */
    public void addProducto(Producto producto);
}
