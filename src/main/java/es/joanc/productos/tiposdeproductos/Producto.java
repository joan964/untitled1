package es.joanc.productos.tiposdeproductos;

public class Producto {

    private String codigo;

    private  String Nombre;

    private String descripcion;

    private float precio_base;

    private float descuento;

    private float IVA;

    public Producto(String codigo, String nombre, String descripcion, float precio_base, float descuento) {
        this.codigo = codigo;
        Nombre = nombre;
        this.descripcion = descripcion;
        this.precio_base = precio_base;
        this.descuento = descuento/100;
        this.IVA = 1.25f;
    }

    public float calcularpvp(float IVA, float precio_base, float descuento){
        return 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio_base() {
        return precio_base;
    }

    public float getDescuento() {
        return descuento;
    }

    public float getIVA() {
        return IVA;
    }

}
