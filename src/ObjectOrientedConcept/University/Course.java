package ObjectOrientedConcept.University;

public record Course(String courseName, String courseCode) {

    @Override
    public String toString() {
        return "Course [courseName=" + courseName + ", courseCode=" + courseCode + "]";
    }
}
