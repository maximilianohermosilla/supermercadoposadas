<%-- 
    Document   : AltaProducto.jsp
    Created on : 3 mar. 2022, 12:52:30
    Author     : maxim
--%>

<%@page import="java.util.List"%>
<%@page import="Class.TipoProducto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script> 
            function test() { 
                let listVal = document.getElementById("cboTipoProducto"); 
                var value = listVal.options[listVal.selectedIndex].value;
                var text = listVal.options[listVal.selectedIndex].text;
                if (! listVal) { 
                    listVal = "1"; 
                } 
                document.getElementById("resultId").innerHTML = value; 
                } 
        </script> 
        <link rel="stylesheet" href="css/style.css" type="text/css"><link>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Supermercado Posadas</title>
    </head>
    <body>
        <div class="container">   
            <div class="titulo">
                <h1>NUEVO PRODUCTO</h1>                
            </div>                      
        </div>
        <br>  
        <div>   
             <form class="form" action="SvProducto" method="POST" name="formProd">   
                <!--<div class="form" action="SvProducto" method="GET">                 -->
                    <p><label>TIPO PRODUCTO: </label>
                    <span class="select">
                        <select name="cboTipoProducto" id="cboTipoProducto" onchange="test()">
                            <option value="0">Seleccione el tipo de producto</option>
                            <%
                                //List<TipoProducto> listaTipos = (List) request.getSession().getAttribute("listaTipos");
                                List<TipoProducto> listaTipos =(List<TipoProducto>)request.getAttribute("listaTipos");
                                if(listaTipos!=null)
                                for (TipoProducto tipo: listaTipos)
                            {%>                            
                            <option value=<%= tipo.getId() %> ><%= tipo.getDescripcion() %></option>
                            
                            <%}%>
                        </select>
                                                
                        <a style="text-decoration:none" href="AltaTipoProducto.jsp" class="btn-green" type="text">Agregar</a>
                    </span>
                <!--</div>-->
                <br>        
                        
                    </p>
                    <p><label>NOMBRE: </label> <input type="text" name="nombre"> </p>
                    <p><label>PRECIO COSTO: </label> <input type="number" name="precioCosto"> </p>
                    <p><label>PRECIO VENTA: </label> <input type="number" name="precioVenta"> </p>
                    <p><label>CANTIDAD:  </label> <input type="number" name="cantidad"> </p>
                    
                    <button class="btn" type="submit">Guardar</button>
                </form>
        </div>
        <br> 
        <div class="container">            
            <button class="btn">
                    <a style="text-decoration:none" href="index.jsp" class="text" role="button">Volver</a>  
            </button>
        </div>
    </body>
</html>
