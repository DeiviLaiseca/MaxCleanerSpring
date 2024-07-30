<%-- 
    Document   : Register
    Created on : 27 jul. 2024, 18:05:53
    Author     : TATO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body class="container well p-2">
        <div class="card p-3 mt-5" id="login">
            <h1><strong>Registro</strong></h1>
            <div class="p-3">
                <center><img src="Img/no-image.png" alt=""/></center>
            </div>
            
            <form action="myservlet" method="post">
                
                <div class="form-floating mb-3">
                <input type="text" class="form-control" id="floatingInput" placeholder="Ingresa tu nombre" name="name">
                <label for="floatingPassword">Nombre</label>
                </div>
            
                <div class="form-floating mb-3">
                <input type="text" class="form-control" id="floatingInput" placeholder="Ingresa tu ID" name="id">
                <label for="floatingPassword">ID</label>
                </div>
                      
                 <div class="form-floating mb-3">
                <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com" name="email">
                <label for="floatingInput">Email address</label>
                 </div>
            
                <div class="form-floating">
                <input type="password" class="form-control" id="floatingPassword" placeholder="Password" name="password">
                <label for="floatingPassword">Password</label>
                </div>
            
                <div class="d-grid gap-2 col-6 mx-auto p-3">
                    <button type="submit"><strong>Registrar</strong> </button>
                    <p>¿Ya tienes una cuenta? <a href="./index.jsp">Inicia sesión</a> </p> 
                </div>
                
                
            </form>
            
            
            
            <footer><h6><strong>Max Cleaner</strong></h6></footer>                    
            
        </div>
        
    </body>
</html>
