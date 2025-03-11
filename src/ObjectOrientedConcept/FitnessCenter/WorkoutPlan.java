package ObjectOrientedConcept.FitnessCenter;

public record WorkoutPlan(String planId, String description) {

    @Override
    public String toString() {
        return "WorkoutPlan [planId=" + planId + ", description=" + description + "]";
    }
}
