<%-- 
    Document   : AltaTipoProducto.jsp
    Created on : 3 mar. 2022, 12:52:30
    Author     : maxim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/style.css" type="text/css"><link>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Supermercado Posadas</title>
    </head>
    <body>
        <div class="container">   
            <div class="titulo">
                <h1>NUEVO TIPO DE PRODUCTO</h1>                
            </div>                      
        </div>
        <br>  
        <div>   
                <form class="form" action="SvTipoProducto" method="POST">
                    
                    <p><label>NOMBRE: </label> <input type="text" name="descripcion"> </p>
                    <p><label>PERECEDERO: </label> <input type="checkbox" name="perecedero" value="pereceOn"> </p>
                    
                    <button class="btn" type="submit">Enviar</button>
                </form>
        </div>
        <br> 
        <div class="container">            
            <button class="btn">
                    <a style="text-decoration:none" href="index.jsp" class="text">Volver</a>  
            </button>
        </div>
    </body>
</html>
