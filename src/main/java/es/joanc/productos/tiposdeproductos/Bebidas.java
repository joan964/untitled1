package es.joanc.productos.tiposdeproductos;

import es.joanc.productos.Tamañodebebida;

public class Bebidas extends Producto {

    private Tamañodebebida tamañodebebidas;
    private boolean rellenable;

    public Bebidas(String codigo, String nombre, String descripcion, Tamañodebebida tamañodebebidas ,boolean rellenable,float precio_base ,float descuento) {
        super(codigo, nombre, descripcion, precio_base, descuento);
        this.tamañodebebidas = tamañodebebidas;
        this.rellenable = rellenable;
    }

    public Tamañodebebida getTamañodebebidas() {
        return tamañodebebidas;
    }

    public boolean getRellenable() {
        return rellenable;
    }
}

