package es.joanc.productos.tiposdeproductos;

import es.joanc.productos.Postresalergias;

public class Postres extends Producto {

    private Postresalergias postresalergias;

    public Postres(String codigo, String nombre, String descripcion, float precio_base, float descuento, Postresalergias postresalergias) {
        super(codigo, nombre, descripcion, precio_base, descuento);
        this.postresalergias = postresalergias;
    }
}
