/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author maxim
 */
public class Conexion {
    String usuario = "root";
    String clave = "ade@D47@3a53";
    String url = "jdbc:mysql://localhost:3306/supermercado";
    String driver="com.mysql.cj.jdbc.Driver";        
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public Conexion(){
        
    }
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Se conecto a base de datos " + url);
        } catch (ClassNotFoundException |SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al conectar a la base de datos");
        }
        return con;
    }
    
    public void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<TipoProducto> consulta(String query){
        List<TipoProducto> listaTipos = new ArrayList<TipoProducto>();
        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            rs.next();
            do {
                listaTipos.add(new TipoProducto(rs.getString("descripcion"), rs.getBoolean("perecedero")));
                //System.out.println(rs.getString("idTipoProducto") + " Nombre: " + rs.getString("descripcion") + " Perecedero: " + rs.getString("perecedero"));
            } while (rs.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return listaTipos;
    }
    
    public List<Producto> consultaProd(String query){
        List<Producto> listaProd = new ArrayList<Producto>();
        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            rs.next();
            do {
                //listaTipos.add(new TipoProducto(rs.getString("descripcion"), rs.getBoolean("perecedero")));
                listaProd.add(new Producto(rs.getString("nombre"), rs.getFloat("precioCosto"), rs.getFloat("precioVenta"), rs.getInt("cantidad"), rs.getInt("idTipoProducto")));
                //System.out.println(rs.getString("idTipoProducto") + " Nombre: " + rs.getString("descripcion") + " Perecedero: " + rs.getString("perecedero"));
            } while (rs.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return listaProd;
    }
    
    public void insertar(String query){
        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    
    
}
