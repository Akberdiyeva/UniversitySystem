public class Main {
    public static void main(String[] args) {


        Course course = new Course("OOP", 5);


        Professor professor = new Professor("Aigerim", "Kydyrbekova");


        University u1 = new University("SE-2511", 1);
        University u2 = new University("SE-2524", 1);


        System.out.println(course);
        System.out.println(professor);
        System.out.println(u1);
        System.out.println(u2);


        System.out.println("u1 == u2 : " + (u1 == u2));
    }
}
