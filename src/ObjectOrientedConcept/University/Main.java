package ObjectOrientedConcept.University;

public class Main {
    public static void main(String[] args) {
        University university = new University();

        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        Professor professor1 = new Professor("Dr. Smith", "P001");
        Professor professor2 = new Professor("Dr. Johnson", "P002");

        Course course1 = new Course("Computer Science", "CS101");
        Course course2 = new Course("Mathematics", "MATH101");

        student1.enroll(course1);
        student2.enroll(course2);

        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        university.addStudent(student1);
        university.addStudent(student2);
        university.addProfessor(professor1);
        university.addProfessor(professor2);
        university.addCourse(course1);
        university.addCourse(course2);

        System.out.println(university);
    }
}
