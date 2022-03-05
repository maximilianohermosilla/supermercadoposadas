/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Class.Conexion;
import Class.TipoProducto;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "SvVerTipoProducto", urlPatterns = {"/SvVerTipoProducto"})
public class SvVerTipoProducto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        response.sendRedirect("index.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Conexion conexion = new Conexion();
        conexion.conectar();
        String query = "select * from tipoproducto";
        //conexion.consulta(query);        
        List<TipoProducto> listaTipos = conexion.consulta(query); 
        HttpSession miSession = request.getSession();
        miSession.setAttribute("listaTipos", listaTipos);
        
        //response.sendRedirect("VerTipoProducto.jsp");
        PrintWriter out = response.getWriter(); 
        out.println("<script type=\"text/javascript\">"); 
        out.println("alert('Pop-up alert...');"); 
        out.println("location='index.jsp';"); 
        out.println("</script>"); 
        response.sendRedirect("VerTipoProducto.jsp");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("AltaProducto.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    

}
