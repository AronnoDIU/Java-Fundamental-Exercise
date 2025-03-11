package ObjectOrientedConcept.FitnessCenter;

public class Member extends Person {
    private final String membershipType;

    public Member(String name, String id, String membershipType) {
        super(name, id);
        this.membershipType = membershipType;
    }

    public String getMembershipType() {
        return membershipType;
    }

    @Override
    public String toString() {
        return "Member [membershipType=" + membershipType + ", " + super.toString() + "]";
    }
}
