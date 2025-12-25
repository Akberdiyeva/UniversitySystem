public abstract class Person {

    protected String name;
    protected String lastname;

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public abstract String getRole();

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
}
