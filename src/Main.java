public class Main {
    public static void main(String[] args) {

        University university = new University("AITU");

        Professor p1 = new Professor("Aigerim", "Kydyrbekova");
        Professor p2 = new Professor("Dias", "Nuradilov");

        university.addProfessor(p1);
        university.addProfessor(p2);

        Course c1 = new Course("OOP", 5, p1);
        Course c2 = new Course("Databases", 4, p2);
        Course c3 = new Course("Algorithms", 6, p1);

        university.addCourse(c1);
        university.addCourse(c2);
        university.addCourse(c3);

        System.out.println(university);

        System.out.println("\nSearch course:");
        System.out.println(university.findCourseByName("OOP"));

        System.out.println("\nFilter courses (credits >= 5):");
        for (Course c : university.filterCoursesByCredits(5)) {
            System.out.println(c);
        }

        System.out.println("\nSorted courses:");
        university.sortCoursesByName();
        for (Course c : university.filterCoursesByCredits(0)) {
            System.out.println(c);
        }


        Person person = new Professor("Test", "Professor");
        System.out.println("\nRole: " + person.getRole());
    }
}
