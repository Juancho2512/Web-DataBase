package com.example.proyectprog.Persistence;

public class StudentDAOFactory {
    public StudentDAO createStudentDAO(){

        return new StudentDAOImplement();
    }
}
