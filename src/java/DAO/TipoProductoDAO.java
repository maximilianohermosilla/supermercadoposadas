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
public class TipoProductoDAO {
    
    Conexion conn = new Conexion();
    
    public List<TipoProducto> consulta(){
        Connection con = conn.conectar();
        Statement stmt;
        ResultSet rs;
        String query = "select * from tipoproducto";
        List<TipoProducto> listaTipos = new ArrayList<TipoProducto>();
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            rs.next();
            do {
                listaTipos.add(new TipoProducto(rs.getString("descripcion"), rs.getBoolean("perecedero"), rs.getInt("idtipoproducto")));                
            } while (rs.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }   
        finally{
            conn.desconectar();
        }
        return listaTipos;
    }
    
    public TipoProducto getTipoById(Integer idTipoProducto){
        Connection con = conn.conectar();
        Statement stmt;
        ResultSet rs;
        String query = "select * from tipoproducto where idTipoProducto="+ idTipoProducto;
        TipoProducto tipo = new TipoProducto();
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            rs.next();
            System.out.println(rs);
            tipo.setDescripcion(rs.getString("descripcion"));     
            tipo.setPerecedero(rs.getBoolean("perecedero"));
            tipo.setId(rs.getInt("idTipoProducto"));            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }   
        finally{
            conn.desconectar();
        }
        return tipo;
    }
    
    public void insertar(TipoProducto tipoProducto){
        System.out.println(tipoProducto);
        Connection con;
        Statement stmt;
        String SQL;
        try{            
            con = conn.conectar();
            stmt = con.createStatement();
            
            SQL = "INSERT INTO tipoproducto (descripcion, perecedero)"+
                  "VALUES('" + tipoProducto.getDescripcion() + "', " + tipoProducto.getPerecedero() + ")";
            stmt.executeUpdate(SQL);            
            
        }catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            conn.desconectar();
        }
    }
    
    
}
