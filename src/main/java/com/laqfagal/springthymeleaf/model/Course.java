package com.laqfagal.springthymeleaf.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="courses")
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int modules;

    private double credits;

    private double fee;

    public Course() {
    }

    public Course(String name, int modules, double credits, double fee) {
        this.name = name;
        this.modules = modules;
        this.credits = credits;
        this.fee = fee;
    }


    @ManyToMany(mappedBy="courses", fetch=FetchType.LAZY)
    private Set<Student> students = new HashSet<>();

    // getters, setters, etc... omitidos por brevedad

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModules() {
        return modules;
    }

    public void setModules(int modules) {
        this.modules = modules;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}