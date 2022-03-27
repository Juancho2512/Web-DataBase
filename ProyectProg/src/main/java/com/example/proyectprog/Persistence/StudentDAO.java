package com.example.proyectprog.Persistence;
import com.example.proyectprog.Logic.Student;
import java.util.List;

public interface StudentDAO extends java.lang.AutoCloseable{

    void addStudent(Student student);
    void updateStudent(Student student);
    void delete( String code);
    Student findByCode(String code);
    List<Student> getAllStudents();

}
