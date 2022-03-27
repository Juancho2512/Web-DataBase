package com.example.proyectprog.Persistence;
import com.example.proyectprog.Logic.Student;


import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImplement implements StudentDAO{
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/student/students";
    //private static final String USER = "student";
    //private static final String PASSWD = "calleFalsa123";


    @Override
    public void addStudent(Student student) {
        try {
            Class.forName( DRIVER );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try(Connection connection =
                    DriverManager.getConnection( URL );//,USER,PASSWD
        ){
            Statement statement = connection.createStatement();

            String code = student.getCode();
            String name = student.getName();
            String sport = student.getSport();
            String activity = student.getActivity();



            final String query = "INSERT INTO student VALUES(" + "'" + code + "','" + name + "','" + sport + "','"  + activity + "')";

            System.out.println( query );

            statement.execute( query );

        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void delete(String code) {

    }

    @Override
    public Student findByCode(String code) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        try(Connection connection =
                    DriverManager.getConnection(URL);//,USER,PASSWD)
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("select * from student");
        ){
            while( result.next()){
                String code = result.getString( "code" );
                String name = result.getString( "name" );
                String sport = result.getString("sport");
                String activity = result.getString("activity");

                students.add( new Student(code, name,sport,activity));
            }

            return students;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    @Override
    public void close() throws Exception {

    }
}
