<%-- 
    Document   : VerProductos.jsp
    Created on : 3 mar. 2022, 12:52:53
    Author     : maxim
--%>

<%@page import="Class.Producto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/style.css" type="text/css"><link>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta de Productos</title>
    </head>
    <body>
        <div class="container">   
            <div class="titulo">
                <h1>PRODUCTOS</h1>                
            </div>                      
        </div>
        <br>
        <table class="grid" border="2">
            <tr>
                <th   width="10%">Producto</th>
                <th   width="25%">Nombre</th>
                <th   width="20%">Precio Costo</th>
                <th   width="20%">Precio Venta</th>
                <th   width="15%">Cantidad</th>
                <th   width="20%">Tipo de Producto</th>
            </tr>
        <%
            //List<Producto> listaProd = (List) request.getSession().getAttribute("listaProd");
            List<Producto> listaProd =(List<Producto>)request.getAttribute("listaProd");
            int cont=1;
            for (Producto prod: listaProd){%>
            
            <tr>
                <td align="center"><%=cont%></p>
                <td align="center"><%=prod.getNombre()%></td>
                <td align="center"><%=prod.getPrecioCosto()%></td> 
                <td align="center"><%=prod.getPrecioVenta()%></td>
                <td align="center"><%=prod.getCantidad()%></td>
                <td align="center"><%=prod.getTipoProductoDescripcion()%></td>
            </tr>                
                <% cont= cont+1; %>
            <%}%>
        </table>
        <br>
        <div class="container">            
            <button class="btn">
                    <a style="text-decoration:none" href="index.jsp" class="text">Volver</a>  
            </button>
        </div>
    </body>
</html>
