<%-- 
    Document   : index
    Created on : 22 nov 2023, 14:45:31
    Author     : Oscar
--%>

<%@page import="com.mycompany.javaavanzadoclase10dia11ejercicio1.logica.Controladora"%>
<%@page import="java.util.List"%>
<%@page import="com.mycompany.javaavanzadoclase10dia11ejercicio1.logica.Partido"%>
<%@page contentType="text/html charset=UTF-8" pageEncoding="UTF-8"%>
<%-- Se llama a la creación de los partidos en Controladora--%>
<% Controladora control = new Controladora();%>
<% control.crearPartido(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Votacion</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container mt-4">
            <h2>Votación</h2>
            <p>Elija su voto: </p>
            <form action="PartidoSv" method="post">
                <div class="form-group">
                    <input type="radio" id="partidoa" name="partidos" value="Partido A">
                    <label for="partidoa">Partido A</label>
                    <br>
                    <input type="radio" id="partidob" name="partidos" value="Partido B">
                    <label for="partidob">Partido B</label>
                    <br>
                    <input type="radio" id="partidoc" name="partidos" value="Partido C">
                    <label for="partidoc">Partido C</label>
                    <br>
                </div>
                <button type="submit" class="btn btn-primary">Enviar</button>
            </form>
            <br><br>
            <form action="PartidoSv" method="get">
                <button type="submit" class="btn btn-success">Mostrar resultados</button>
            </form>

            <hr>

        <br>
        <br>
        <!-- Se muestra la tabla con los resultados de las votaciones -->
        <div class="results-table">
            <% if (request.getAttribute("resultados") != null) { %>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Nombre Partido</th>
                            <th>Cantidad Votos</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Partido partido : (List<Partido>) request.getAttribute("resultados")) { %>
                            <tr>
                                <td><%= partido.getNombre() %></td>
                                <td><%= partido.getVotos() %></td>
                            </tr>
                        <% } %>
                    </tbody>
                </table>
            <% }%>
        </div>
     </div>
        <!-- Scripts de Bootstrap -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>