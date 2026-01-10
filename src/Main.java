public class Main {
    public static void main(String[] args) {

        ProfessorDAO professorDAO = new ProfessorDAO();
        CourseDAO courseDAO = new CourseDAO();

        // CREATE
        Professor p1 = new Professor("Aigerim", "Kydyrbekova");
        professorDAO.addProfessor(p1);

        // READ
        for (Professor p : professorDAO.getAllProfessors()) {
            System.out.println(p.getId() + " " + p.name);
        }

        // UPDATE
        professorDAO.updateProfessor(1, "Aigerim Updated");

        // DELETE
        professorDAO.deleteProfessor(3);

        // COURSES
        Professor profFromDb = professorDAO.getAllProfessors().get(0);
        Course c1 = new Course("OOP", 5, profFromDb);
        courseDAO.addCourse(c1);

        for (Course c : courseDAO.getAllCourses()) {
            System.out.println(c.getName() + " - " + c.getProfessor().getRole());
        }
    }
}
