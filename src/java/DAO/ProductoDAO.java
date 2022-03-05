/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Class.Conexion;
import Class.Producto;
import Class.TipoProducto;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class ProductoDAO {
    
    Conexion conn = new Conexion();
    TipoProductoDAO tipoDAO = new TipoProductoDAO();
    
    public List<Producto> consulta(){
        Connection con = conn.conectar();
        Statement stmt;
        ResultSet rs;
        String query = "select * from productos";
        List<Producto> listaProd = new ArrayList<Producto>();
        TipoProducto tipo;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            rs.next();
            do {
                tipo = tipoDAO.getTipoById(rs.getInt("idTipoProducto"));
                System.out.println("Debugging message");
                listaProd.add(new Producto(rs.getString("nombre"), rs.getFloat("precioCosto"), rs.getFloat("precioVenta"), rs.getInt("cantidad"), tipo));
                //listaProd.add(new Producto(rs.getString("nombre"), rs.getFloat("precioCosto"), rs.getFloat("precioVenta"), rs.getInt("cantidad"), rs.getInt("idTipoProducto")));
            } while (rs.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }   
        finally{
            conn.desconectar();
        }
        return listaProd;
    }
    
    public void insertar(Producto producto){
        System.out.println(producto);
        Connection con;
        Statement stmt;
        String SQL;
        try{            
            con = conn.conectar();
            stmt = con.createStatement();
            
            SQL = "INSERT INTO productos (nombre,precioCosto,precioVenta,cantidad, idTipoProducto)"+
                  "VALUES('" + producto.getNombre() + "', " + producto.getPrecioCosto() + ", " + producto.getPrecioVenta() + ", " + producto.getCantidad() + ", " + producto.getIdTipoProducto() + ")";
            stmt.executeUpdate(SQL);            
            
            System.out.println("insertar ok");
        }catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            conn.desconectar();
        }
    }
    
}
