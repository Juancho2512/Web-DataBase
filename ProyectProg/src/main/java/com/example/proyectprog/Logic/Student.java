package com.example.proyectprog.Logic;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class Student {
    private String code;
    private String name;
    private String sport;
    private String activity;

    public Student(String code, String name, String sport, String activity) {
        this.code = code;
        this.name = name;
        this.sport = sport;
        this.activity = activity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", sport='" + sport + '\'' +
                ", activity='" + activity + '\'' +
                '}';
    }
}
