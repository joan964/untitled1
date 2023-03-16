package es.joanc.productos;

import es.joanc.productos.tiposdeproductos.Producto;

import java.util.ArrayList;

public class pedido {

    private int identificador;

    private String listaproductos;

    private int fechapedido;

    private String nombrecliente;

    private boolean servido;

    private ArrayList<Producto> productos;

    public pedido(int identificador, String listaproductos, int fechapedido, String nombrecliente, boolean servido) {
        this.identificador = identificador;
        this.listaproductos = listaproductos;
        this.fechapedido = fechapedido;
        this.nombrecliente = nombrecliente;
        this.servido = servido;
    }
}
