/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Class.Conexion;
import Class.Producto;
import Class.TipoProducto;
import DAO.ProductoDAO;
import DAO.TipoProductoDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maxim
 */
public class ProductoService {   
    
    Conexion conn = new Conexion();
    TipoProductoDAO tipoDAO = new TipoProductoDAO();
    ProductoDAO prodDAO = new ProductoDAO();
    
    public void insertar(Producto prod){
        
    }
        
    public List<Producto> consulta(){
        return prodDAO.consulta();
    }
    
}
