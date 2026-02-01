package com.university;

public class Main {
    public static void main(String[] args) {

        ProfessorDAO professorDAO = new ProfessorDAO();
        CourseDAO courseDAO = new CourseDAO();

        Professor p1 = new Professor("Aigerim", "Kydyrbekova");
        professorDAO.addProfessor(p1);

        for (Professor p : professorDAO.getAllProfessors()) {
            System.out.println(p.getId() + " " + p.name);
        }

        professorDAO.updateProfessor(1, "Aigerim Updated");

        professorDAO.deleteProfessor(3);

        Professor profFromDb = professorDAO.getAllProfessors().get(0);
        Course c1 = new Course("OOP", 5, profFromDb);
        courseDAO.addCourse(c1);

        for (Course c : courseDAO.getAllCourses()) {
            System.out.println(c.getName() + " - " + c.getProfessor().getRole());
        }
    }
}
