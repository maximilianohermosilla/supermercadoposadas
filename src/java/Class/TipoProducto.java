/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author maxim
 */
public class TipoProducto {
    private String descripcion;
    private Boolean perecedero;
    private Integer id;

    public TipoProducto() {
    }

    public TipoProducto(String descripcion, Boolean perecedero) {
        this.descripcion = descripcion;
        this.perecedero = perecedero;
    }

    public TipoProducto(String descripcion, Boolean perecedero, Integer id) {
        this.descripcion = descripcion;
        this.perecedero = perecedero;
        this.id = id;
    }        

    public String getDescripcion() {
        return descripcion;
    }

    public Boolean getPerecedero() {        
        return perecedero;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPerecedero(Boolean perecedero) {
        this.perecedero = perecedero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    /*@Override    
    public String toString(){
        return this.descripcion;
    }*/
    
    
    
}
