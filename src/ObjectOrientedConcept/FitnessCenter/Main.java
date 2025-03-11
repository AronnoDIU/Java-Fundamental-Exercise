package ObjectOrientedConcept.FitnessCenter;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        FitnessCenter fitnessCenter = new FitnessCenter();

        Member member1 = new Member("Alice", "M001", "Gold");
        Member member2 = new Member("Bob", "M002", "Silver");

        Trainer trainer1 = new Trainer("John", "T001", "Strength Training");
        Trainer trainer2 = new Trainer("Jane", "T002", "Cardio");

        WorkoutPlan plan1 = new WorkoutPlan("WP001", "Full Body Workout");
        WorkoutPlan plan2 = new WorkoutPlan("WP002", "Cardio Blast");

        fitnessCenter.addMember(member1);
        fitnessCenter.addMember(member2);
        fitnessCenter.addTrainer(trainer1);
        fitnessCenter.addTrainer(trainer2);
        fitnessCenter.addWorkoutPlan(plan1);
        fitnessCenter.addWorkoutPlan(plan2);

        Session session1 = new Session("S001", member1, trainer1, plan1, LocalDateTime.now().plusDays(1));
        Session session2 = new Session("S002", member2, trainer2, plan2, LocalDateTime.now().plusDays(2));

        fitnessCenter.addSession(session1);
        fitnessCenter.addSession(session2);

        System.out.println(fitnessCenter);
    }
}
