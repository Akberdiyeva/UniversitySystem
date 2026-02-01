package com.university;

public class Professor extends Person {

    private int id;

    public Professor(int id, String name, String lastname) {
        super(name, lastname);
        this.id = id;
    }

    public Professor(String name, String lastname) {
        super(name, lastname);
    }

    public int getId() {
        return id;
    }

    @Override
    public String getRole() {
        return "Professor";
    }
}
