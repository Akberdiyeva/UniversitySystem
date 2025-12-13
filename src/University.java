public class University {

    private String group;
    private int courseyear;

    public University(String group, int courseyear) {
        this.group = group;
        this.courseyear = courseyear;
    }

    public String getGroup() {
        return group;
    }

    public int getCourseyear() {
        return courseyear;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourseyear(int courseyear) {
        this.courseyear = courseyear;
    }

    @Override
    public String toString() {
        return "University {group = '" + group + "', course year = " + courseyear + "}";
    }
}
