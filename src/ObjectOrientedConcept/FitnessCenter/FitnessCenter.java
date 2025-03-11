package ObjectOrientedConcept.FitnessCenter;

import java.util.ArrayList;
import java.util.List;

public class FitnessCenter {
    private final List<Member> members = new ArrayList<>();
    private final List<Trainer> trainers = new ArrayList<>();
    private final List<WorkoutPlan> workoutPlans = new ArrayList<>();
    private final List<Session> sessions = new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
    }

    public void addTrainer(Trainer trainer) {
        trainers.add(trainer);
    }

    public void addWorkoutPlan(WorkoutPlan workoutPlan) {
        workoutPlans.add(workoutPlan);
    }

    public void addSession(Session session) {
        sessions.add(session);
    }

    public List<Member> getMembers() {
        return new ArrayList<>(members);
    }

    public List<Trainer> getTrainers() {
        return new ArrayList<>(trainers);
    }

    public List<WorkoutPlan> getWorkoutPlans() {
        return new ArrayList<>(workoutPlans);
    }

    public List<Session> getSessions() {
        return new ArrayList<>(sessions);
    }

    @Override
    public String toString() {
        return "FitnessCenter [members=" + members + ", trainers=" + trainers + ", workoutPlans=" + workoutPlans + ", sessions=" + sessions + "]";
    }
}
