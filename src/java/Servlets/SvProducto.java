/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Class.Conexion;
import Class.Producto;
import Class.TipoProducto;
import DAO.ProductoDAO;
import Services.ProductoService;
import Services.TipoProductoServices;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import static javax.xml.bind.JAXBIntrospector.getValue;

/**
 *
 * @author maxim
 */
@WebServlet(name = "SvProducto", urlPatterns = {"/SvProducto"})
@MultipartConfig
public class SvProducto extends HttpServlet {
    ProductoDAO prodDAO = new ProductoDAO();
    TipoProductoServices tipoService = new TipoProductoServices();
    ProductoService prodService = new ProductoService();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        response.sendRedirect("index.jsp");
    }
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        
        List<TipoProducto> listaTipos = tipoService.consulta();
        request.setAttribute("listaTipos", listaTipos);
        request.getRequestDispatcher("AltaProducto.jsp").forward(request,response);
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
        String nombre = request.getParameter("nombre");         
        String precioCosto = request.getParameter("precioCosto");
        String precioVenta = request.getParameter("precioVenta");
        String cantidad = request.getParameter("cantidad");        
        String idTipoProducto = request.getParameter("cboTipoProducto");
                
        Producto prod = new Producto(nombre, Float.parseFloat(precioCosto), Float.parseFloat(precioVenta), Integer.parseInt(cantidad), Integer.parseInt(idTipoProducto));
        
        prodDAO.insertar(prod);
        //response.sendRedirect("AltaProducto.jsp");
        
    }
    
}
