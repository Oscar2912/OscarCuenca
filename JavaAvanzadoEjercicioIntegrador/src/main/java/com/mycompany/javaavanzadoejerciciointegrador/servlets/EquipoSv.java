package com.mycompany.javaavanzadoejerciciointegrador.servlets;

import com.mycompany.javaavanzadoejerciciointegrador.logica.Controladora;
import com.mycompany.javaavanzadoejerciciointegrador.logica.Equipo;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EquipoSv", urlPatterns = {"/EquipoSv"})
public class EquipoSv extends HttpServlet {
    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Equipo> listaEquipos = control.traerEquipos();   
        listaEquipos.forEach(e -> System.out.println(e.toString()));
        
        request.setAttribute("resultado1", listaEquipos);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        
        Equipo equipo = new Equipo();
        equipo.setNombre(nombre);
        
        control.crearEquipo(equipo);
        
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
