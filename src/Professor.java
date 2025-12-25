import java.util.Objects;

public class Professor extends Person {

    public Professor(String name, String lastname) {
        super(name, lastname);
    }

    @Override
    public String getRole() {
        return "Professor";
    }

    @Override
    public String toString() {
        return "Professor {name='" + name + "', lastname='" + lastname + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        Professor that = (Professor) o;
        return name.equals(that.name) && lastname.equals(that.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }
}
