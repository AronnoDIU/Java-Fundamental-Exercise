package ObjectOrientedConcept.University;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Person {
    private final List<Course> courses = new ArrayList<>();

    public Professor(String name, String id) {
        super(name, id);
    }

    public void assignCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    @Override
    public String toString() {
        return "Professor [courses=" + courses + ", " + super.toString() + "]";
    }
}
