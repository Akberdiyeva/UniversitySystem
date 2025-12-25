import java.util.Objects;

public class Course {

    private String name;
    private int credits;
    private Professor professor;

    public Course(String name, int credits, Professor professor) {
        this.name = name;
        this.credits = credits;
        this.professor = professor;
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

    @Override
    public String toString() {
        return "Course {name='" + name + "', credits=" + credits +
                ", professor=" + professor.getName() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return name.equals(course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
