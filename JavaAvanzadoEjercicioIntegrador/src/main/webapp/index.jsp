<%-- 
    Document   : index
    Created on : 22 nov 2023, 16:26:37
    Author     : Oscar
--%>

<%@page import="com.mycompany.javaavanzadoejerciciointegrador.logica.Partido"%>
<%@page import="com.mycompany.javaavanzadoejerciciointegrador.logica.Equipo"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Torneo Baloncesto</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container mt-4">
            <h2>Torneo Baloncesto</h2>
            <form action="EquipoSv" method="post">
                <div class="form-group">
                    <label for="nombre">Nombre del equipo:</label>
                    <input type="text" class="form-control" id="nombre" name="nombre">
                </div>
                <button type="submit" class="btn btn-primary">Enviar</button>
            </form>
            <hr>
            <form action="EquipoSv" method="get">
                <button type="submit" class="btn btn-success">Mostrar Equipos</button>
            </form>
        <br>
        <br>
        <!-- Resultados en tabla -->
        <div class="results-table">
            <% if (request.getAttribute("resultado1") != null) { %>
                <h3>Datos:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Equipo equipo : (List<Equipo>) request.getAttribute("resultado1")) { %>
                            <tr>
                                <td><%= equipo.getId() %></td>
                                <td><%= equipo.getNombre() %></td>
                            </tr>
                        <% } %>
                    </tbody>
                </table>
            <% }%>
        </div>

            <hr>
            <form action="PartidoSv" method="post">
                <div class="form-group">
                    <label for="id-local">Id del equipo local:</label>
                    <input type="text" class="form-control" id="id-local" name="id-local">
                    <label for="puntos-local">Puntos del equipo local:</label>
                    <input type="text" class="form-control" id="puntos-local" name="puntos-local">
                    <label for="id-visitante">Id del equipo visitante:</label>
                    <input type="text" class="form-control" id="id-visitante" name="id-visitante">
                    <label for="puntos-visitante">Puntos del equipo visitante:</label>
                    <input type="text" class="form-control" id="puntos-visitante" name="puntos-visitante">
                    <label for="fecha">Fechadel partido:</label>
                    <input type="date" class="form-control" id="fecha" name="fecha"><br>
                </div>
                <button type="submit" class="btn btn-primary">Enviar</button>
            </form>
            <hr>
            <form action="PartidoSv" method="get">
                <button type="submit" class="btn btn-success">Mostrar Partidos</button>
            </form>
            <br>
            <br>
            <div class="results-table">
            <% if (request.getAttribute("resultado2") != null) { %>
                <h3>Información de partidos:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Equipo Local</th>
                            <th>Puntos marcados</th>
                            <th>Equipo Visitante</th>
                            <th>Puntos marcados</th>
                            <th>Fecha</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Partido partido : (List<Partido>) request.getAttribute("resultado2")) { %>
                            <tr>
                                <td><%= partido.getEquipo1().getNombre() %></td>
                                <td><%= partido.getPuntosEquipo1() %></td>
                                <td><%= partido.getEquipo2().getNombre() %></td>
                                <td><%= partido.getPuntosEquipo2() %></td>
                                <td><%= partido.getFecha() %></td>
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
