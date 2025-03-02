package ObjectOrientedConcept.University;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private final List<Course> courses = new ArrayList<>();

    public Student(String name, String id) {
        super(name, id);
    }

    public void enroll(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    @Override
    public String toString() {
        return "Student [courses=" + courses + ", " + super.toString() + "]";
    }
}
