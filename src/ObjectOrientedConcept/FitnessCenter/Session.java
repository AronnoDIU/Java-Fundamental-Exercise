package ObjectOrientedConcept.FitnessCenter;

import java.time.LocalDateTime;

public record Session(String sessionId, Member member, Trainer trainer, WorkoutPlan workoutPlan,
                      LocalDateTime dateTime) {

    @Override
    public String toString() {
        return "Session [sessionId=" + sessionId + ", member=" + member + ", trainer=" + trainer + ", workoutPlan=" + workoutPlan + ", dateTime=" + dateTime + "]";
    }
}
