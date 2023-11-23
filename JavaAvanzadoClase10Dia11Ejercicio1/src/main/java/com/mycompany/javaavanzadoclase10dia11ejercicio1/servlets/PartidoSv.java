package com.mycompany.javaavanzadoclase10dia11ejercicio1.servlets;

import com.mycompany.javaavanzadoclase10dia11ejercicio1.logica.Controladora;
import com.mycompany.javaavanzadoclase10dia11ejercicio1.logica.Partido;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PartidoSv</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PartidoSv at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    //Almacena en una lista los objetos Partido que se encuentran en la BD y la devuelve al index
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Partido> listaPartidos = control.traerPartidos();
        
        request.setAttribute("resultados", listaPartidos);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    //Se almacena en voto la opción seleccionada y dependiendo de la opción, se modifica el partido correspondiente, aumentando los votos en 1, y recargando el index
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String voto = request.getParameter("partidos");
        
        switch (voto){
            case ("Partido A"):
                Partido partidoA = control.buscarPartido(Long.valueOf("1"));
                Integer votosA = partidoA.getVotos();
                votosA += 1 ;
                partidoA.setVotos(votosA);
                control.modificarPartido(partidoA);
                System.out.println("VotosA: " + partidoA.getVotos());
                break;
            case ("Partido B"):
                Partido partidoB = control.buscarPartido(Long.valueOf("2"));
                Integer votosB = partidoB.getVotos();
                votosB += 1 ;
                partidoB.setVotos(votosB);
                control.modificarPartido(partidoB);
                System.out.println("VotosB: " + partidoB.getVotos());
                break;
            case ("Partido C"):
                Partido partidoC = control.buscarPartido(Long.valueOf("3"));
                Integer votosC = partidoC.getVotos();
                votosC += 1 ;
                partidoC.setVotos(votosC);
                control.modificarPartido(partidoC);
                System.out.println("VotosC: " + partidoC.getVotos());
                break;
        }

        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
