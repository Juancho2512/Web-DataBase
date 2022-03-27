package com.example.proyectprog;

import com.example.proyectprog.Logic.Student;
import com.example.proyectprog.Persistence.StudentDAOFactory;
import com.example.proyectprog.Persistence.StudentDAOImplement;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "servletTest", value = "/servlet-test")
public class ServletTest extends HttpServlet{
    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/json");
        List<Student> students = Arrays.asList(new Student("2112","Daniela Pinto","Tenis", "Torneo Universitario InterCarreras 4 lugar"));

        Gson gson = new Gson();
        String stAux = gson.toJson( students );
        String code = request.getParameter("code");
        try(
                PrintWriter out = response.getWriter();
        ){
            out.println(stAux);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        String code = request.getParameter("code");
        String name = request.getParameter("name");
        String sport = request.getParameter("sport");
        String activity = request.getParameter("activity");

        try( PrintWriter out = response.getWriter()){
            out.println( code + " " + name + " " + sport+" "+activity+"lol" );
        }
    }
}
