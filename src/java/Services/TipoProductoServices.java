/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Class.Conexion;
import Class.TipoProducto;
import DAO.TipoProductoDAO;
import java.util.List;

/**
 *
 * @author maxim
 */
public class TipoProductoServices {
    
    Conexion conn = new Conexion();
    TipoProductoDAO tipoDAO = new TipoProductoDAO();
    
    
    public void insertar(TipoProducto tipoProd){
        tipoDAO.insertar(tipoProd);        
    }
        
    public List<TipoProducto> consulta(){
        return tipoDAO.consulta();
    }
}
