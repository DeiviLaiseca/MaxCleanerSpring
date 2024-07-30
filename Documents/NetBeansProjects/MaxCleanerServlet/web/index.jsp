<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body class="container well p-2">
        
                <div class="card p-3 mt-5" id="login">
                <h1><strong>Login</strong></h1>
                <div class="p-3">
                    <center><img src="Img/no-image.png" alt=""/></center>
                </div>
                
        <form action="myservlet" method="get">

                <div class="form-floating mb-3">
                    <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com" name="email">
                    <label for="floatingInput">Email address</label>
                </div>
                <div class="form-floating">
                    <input type="password" class="form-control" id="floatingPassword" placeholder="Password" name="password">
                    <label for="floatingPassword">Password</label>
                </div>
                <div class="d-grid gap-2 col-6 mx-auto p-3">
                    <button type="submit"><strong>Iniciar sesión</strong> </button>
                    <p>¿No tienes una cuenta? <a href="./Register.jsp">Regístrate</a> </p> 
                </div>
            
        </form>

        <footer><h6><strong>Max Cleaner</strong></h6></footer> 

    </div>
        
    </body>
</html>
