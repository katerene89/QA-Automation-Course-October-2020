package com.lectures.lecture08;

import java.util.List;

public class Teacher extends teacherInfo {
    private String name;
    private int age;
    private String address;
    private String work;
    private List<String> classes;

    public Teacher(String name, int age, String address, String work) {
        super(name, age, address, work);
        this.name = name;
        this.age = age;
        this.address = address;
        this.work = work;
    }
}

