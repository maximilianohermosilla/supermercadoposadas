<%-- 
    Document   : MainScreen.jsp
    Created on : 3 mar. 2022, 23:54:40
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
    <body>
        
        <div class="container">
            <div class="titulo">
                <h1>BIENVENIDO A SUPERMERCADO POSADAS</h1>                
            </div>            
        </div>
        <br>
        <div class="form">            
            
            <form action="SvProducto" method="GET" class="container">            
                <button type="submit" class="btn">
                        <span class="text">Nuevo Producto</button>  
                </button>
            </form>
            <br>
            <form action="SvVerProductos" method="GET" class="container">            
                <button type="submit" class="btn">
                        <span class="text">Consulta Productos</button>  
                </button>
            </form>
            <br>
            <br>
            <form action="SvTipoProducto" method="GET" class="container">            
                <button type="submit" class="btn">
                        <span class="text">Nuevo Tipo de Producto</button>  
                </button>
            </form>
            <br>            
            <form action="SvVerTipoProducto" method="GET" class="container">            
                <button type="submit" class="btn">
                        <span class="text">Consulta Tipos de Producto</button>  
                </button>
            </form>
            <br>
        </div>
    </body>
</html>