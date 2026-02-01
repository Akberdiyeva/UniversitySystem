package com.university;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class University {

    private String name;
    private List<Course> courses = new ArrayList<>();
    private List<Professor> professors = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course findCourseByName(String name) {
        for (Course c : courses) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public List<Course> filterCoursesByCredits(int minCredits) {
        List<Course> result = new ArrayList<>();
        for (Course c : courses) {
            if (c.getCredits() >= minCredits) {
                result.add(c);
            }
        }
        return result;
    }

    public void sortCoursesByName() {
        courses.sort(Comparator.comparing(Course::getName));
    }
}
