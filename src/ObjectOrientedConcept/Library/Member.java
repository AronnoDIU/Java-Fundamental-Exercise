package ObjectOrientedConcept.Library;

public record Member(String name, String memberId) {

    @Override
    public String toString() {
        return "Member [name=" + name + ", memberId=" + memberId + "]";
    }
}
