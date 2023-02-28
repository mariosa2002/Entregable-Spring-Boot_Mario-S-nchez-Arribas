package com.example.CRUDSpringBoot;

import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class StudentsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStudent;
    private String nameStudent;
    private String surnameStudent;
    private double markStudent;

    public StudentsModel () {

    }
    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getSurnameStudent() {
        return surnameStudent;
    }

    public void setSurnameStudent(String surnameStudent) {
        this.surnameStudent = surnameStudent;
    }

    public double getMarkStudent() {
        return markStudent;
    }

    public void setMarkStudent(double markStudent) {
        this.markStudent = markStudent;
    }

    public StudentsModel(int idStudent, String nameStudent, String surnameStudent, double markStudent) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.surnameStudent = surnameStudent;
        this.markStudent = markStudent;
    }
}
