/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author maxim
 */
public class Producto {
    
    private String nombre;
    private Float precioCosto;
    private Float precioVenta;
    private int cantidad;
    private TipoProducto tipoProducto;
    private int idTipoProducto;

    public Producto() {
    }

    public Producto(String nombre, Float precioCosto, Float precioVenta, int cantidad, TipoProducto tipoProducto) {
        this.nombre = nombre;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.tipoProducto = tipoProducto;
    }

    public Producto(String nombre, Float precioCosto, Float precioVenta, int cantidad, int idTipoProducto) {
        this.nombre = nombre;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.idTipoProducto = idTipoProducto;
    }
       

    public String getNombre() {
        return nombre;
    }

    public Float getPrecioCosto() {
        return precioCosto;
    }

    public Float getPrecioVenta() {
        return precioVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }
    
    public String getTipoProductoDescripcion() {        
        return tipoProducto.getDescripcion();
        
    }
        

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioCosto(Float precioCosto) {
        this.precioCosto = precioCosto;
    }

    public void setPrecioVenta(Float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }
        
    
}
