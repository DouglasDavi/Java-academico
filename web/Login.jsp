<%-- 
    Document   : Login
    Created on : 03/09/2018, 21:01:18
    Author     : alunoces
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        
    </head>
    <body>
        <div class="container">
            <div class="row d-flex justify-content-center">
                <div class="col-md-4">
        <h3>Login</h3>
        <c:if test="${not empty requestScope.erro}">
            <div class="alert alert-danger">
                ${requestScope.erro}  
            </div>
        </c:if>
        <hr>
            <div class="container" >

                <form class="form-inline" action="/Atividade_6/LoginControler" method="Post">
                   <fieldset>
                    <div class="row">
                      <div class="col">
                        <input type="text"  name="login" class="form-control" placeholder="Usuário...">
                      </div>
                      <div class="col">
                        <input type="password" name="senha" class="form-control" placeholder="Senha...">
                      </div>
                    </div>

                <button type="submit" class="btn btn-primary my-1">Logar</button>
                   </fieldset>
             </form>
            </div>  
         </div>
         </div>
        </div>
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>


    </body>
</html>
