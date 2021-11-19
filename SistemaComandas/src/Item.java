/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsantosc04
 */
public class Item {
    
    private String nombre;
    private String tipo;
    private int cantidad;
    private String icono;
    private double precio;

    public Item(String nombre, String tipo,int cantidad, String icono, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.icono = icono;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Item{" + "nombre=" + nombre + ", tipo=" + tipo + ", icono=" + icono + ", precio=" + precio + '}';
    }
    
    
    
}
