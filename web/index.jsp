<%-- 
    Document   : index.jsp
    Created on : 3 mar. 2022, 12:52:13
    Author     : maxim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/style.css" type="text/css"><link>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="scripts/button.js"></script>
        <title>Supermercado Posadas</title>
    </head>
    <%@include file="Header.jsp" %>
    <body>
        
        <div class="container">
            <div class="titulo">
                <h1>BIENVENIDO A SUPERMERCADO POSADAS</h1>                
            </div>            
        </div>
        <br>
        
            <form class="form" action="SvLogin" method="POST">                    
                    <p><label>USUARIO: </label> <input type="text" name="usuario"> </p>
                    <p><label>CLAVE: </label> <input type="password" name="clave"> </p>
                    
                    <button class="btn" type="submit">Ingresar</button>
            </form>        
        
    </body>
</html>
