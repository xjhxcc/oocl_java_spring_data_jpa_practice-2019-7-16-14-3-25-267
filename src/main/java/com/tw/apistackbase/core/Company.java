package com.tw.apistackbase.core;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(cascade =CascadeType.ALL )
    private List<Employee> employees=new ArrayList<>();

    public Company(Long id, String name, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

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

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }
}
