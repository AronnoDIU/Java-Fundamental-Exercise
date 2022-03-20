package ObjectOrientedConcept.SOLIDprinciple.LiskovSubstitutionPrinciple.Problem;

public class Crow implements Bird {

	@Override
	public void fly() {
		System.out.println("Crow flies");
	}

	@Override
	public void eat() {
		System.out.println("Crow eats");
	}

}