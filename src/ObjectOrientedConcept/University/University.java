package ObjectOrientedConcept.University;

import java.util.ArrayList;
import java.util.List;

public class University {
    private final List<Student> students = new ArrayList<>();
    private final List<Professor> professors = new ArrayList<>();
    private final List<Course> courses = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public List<Professor> getProfessors() {
        return new ArrayList<>(professors);
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    @Override
    public String toString() {
        return "University [students=" + students + ", professors=" + professors + ", courses=" + courses + "]";
    }
}
