package ObjectOrientedConcept.SOLIDprinciple.LiskovSubstitutionPrinciple.Solution;

public class Crow implements FlyingBird {

	@Override
	public void fly() {
		System.out.println("Crow flies");
	}

	@Override
	public void eat() {
		System.out.println("Crow eats");
	}

}