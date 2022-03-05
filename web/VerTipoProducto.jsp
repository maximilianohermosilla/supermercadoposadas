<%-- 
    Document   : VertTipoProducto.jsp
    Created on : 3 mar. 2022, 22:57:01
    Author     : maxim
--%>


<%@page import="java.util.List"%>
<%@page import="Class.TipoProducto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/style.css" type="text/css"><link>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tipos De Producto</title>
    </head>
    <body>
        <div class="container">   
            <div class="titulo">
                <h1>TIPOS DE PRODUCTO</h1>                
            </div>                      
        </div>
        <br>
        <table class="grid" border="2">
            <tr>
                <th   width="30%">TipoProducto</th>
                <th   width="80%">Nombre</th>
                <th   width="20%">Perecedero</th>
            </tr>
        <%
            List<TipoProducto> listaTipos = (List) request.getSession().getAttribute("listaTipos");
            int cont=1;
            String perec;
            for (TipoProducto tipo: listaTipos){%>
            <% if (tipo.getPerecedero()==true){perec="SI";}else{perec="NO";}   %>
            <tr>
                <td align="center"><%=cont%></p>
                <td align="center"><%=tipo.getDescripcion()%></td>
                <td align="center"><%=perec%></td> 
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
