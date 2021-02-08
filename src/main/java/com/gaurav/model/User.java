package com.gaurav.model;

public class User {
    private int Id;
    private String Name;
    private int Age;
    private String Course;

    public User() {
    }

    public User(int id, String name, int age, String course) {
        this.Id = id;
        this.Name = name;
        this.Age = age;
        this.Course = course;
    }

    public int getId(){
        return this.Id;
    }

    public String getName() {
        return this.Name;
    }

    public int getAge() {
        return this.Age;
    }

    public String getCourse(){
        return this.Course;
    }

}
