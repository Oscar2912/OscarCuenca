package com.mycompany.javaavanzadoejerciciointegrador.servlets;

import com.mycompany.javaavanzadoejerciciointegrador.logica.Controladora;
import com.mycompany.javaavanzadoejerciciointegrador.logica.Partido;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PartidoSv", urlPatterns = {"/PartidoSv"})
public class PartidoSv extends HttpServlet {
    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Partido> listaPartidos = control.traerPartidos();
        listaPartidos.forEach(p -> System.out.println(p.toString()));
        
        request.setAttribute("resultado2", listaPartidos);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fechaStr = request.getParameter("fecha");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fecha = LocalDate.parse(fechaStr, formatter);
        Long idLocal = Long.valueOf(request.getParameter("id-local"));
        Integer puntosLocal = Integer.valueOf(request.getParameter("puntos-local"));
        Long idVisitante = Long.valueOf(request.getParameter("id-visitante"));
        Integer puntosVisitante = Integer.valueOf(request.getParameter("puntos-visitante"));
        
        Partido partido = new Partido();
        partido.setFecha(fecha);
        partido.setPuntosEquipo1(puntosLocal);
        partido.setPuntosEquipo2(puntosVisitante);
        
        control.crearPartido(partido, idLocal, idVisitante);
        
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
