public class Course {

    private int id;
    private String name;
    private int credits;
    private Professor professor;

    public Course(int id, String name, int credits, Professor professor) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.professor = professor;
    }

    public Course(String name, int credits, Professor professor) {
        this.name = name;
        this.credits = credits;
        this.professor = professor;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public Professor getProfessor() {
        return professor;
    }
}
