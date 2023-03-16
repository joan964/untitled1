package es.joanc.productos.tiposdeproductos;

public class Entrantes extends Producto {
    private float numraciones;

    public Entrantes(String codigo, String nombre, String descripcion, float numraciones,float precio_base, float descuento) {
        super(codigo, nombre, descripcion, precio_base, descuento);
        this.numraciones = numraciones;
    }

    public float getNumraciones() {
        return numraciones;
    }

    public void setNumraciones(float numraciones) {
        this.numraciones = numraciones;
    }
}
