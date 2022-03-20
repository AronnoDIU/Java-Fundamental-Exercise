package ObjectOrientedConcept.SOLIDprinciple.LiskovSubstitutionPrinciple.Solution;

public class Sparrow implements FlyingBird {

	@Override
	public void fly() {
		System.out.println("Sparrow flies");
	}

	@Override
	public void eat() {
		System.out.println("Sparrow eats");
	}

}