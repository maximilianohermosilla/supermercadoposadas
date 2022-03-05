/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Class.Conexion;
import Class.Producto;
import Class.TipoProducto;
import Services.TipoProductoServices;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author maxim
 */
@WebServlet(name = "SvTipoProducto", urlPatterns = {"/SvTipoProducto"})
public class SvTipoProducto extends HttpServlet {
    List<TipoProducto> listaTipoProducto = new ArrayList<TipoProducto>();
    TipoProductoServices tipoService = new TipoProductoServices();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        response.sendRedirect("index.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("AltaTipoProducto.jsp");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        String descripcion = request.getParameter("descripcion");         
        String perecedero = request.getParameter("perecedero");
        log("Descripcion: " + descripcion);        
        log("Perecedero: " + perecedero);
        Boolean perece = false;
        
        if(perecedero==null){
            perece = false;
        }
        else{
            if(perecedero.equals("pereceOn")){
                perece = true;
            }
        }
        
        log("Perece: " + perece);
        TipoProducto prod = new TipoProducto(descripcion, perece);
        
        tipoService.insertar(prod);
        response.sendRedirect("AltaTipoProducto.jsp");
    }


}

