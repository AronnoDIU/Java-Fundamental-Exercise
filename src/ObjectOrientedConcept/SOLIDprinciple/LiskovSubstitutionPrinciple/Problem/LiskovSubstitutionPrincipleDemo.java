package ObjectOrientedConcept.SOLIDprinciple.LiskovSubstitutionPrinciple.Problem;

/**
 * 
 * @author Aronno
 *
 */
public class LiskovSubstitutionPrincipleDemo {

	public static void main(String[] args) {

		Bird[] birds = new Bird[] { new Crow(), new Sparrow(), new Ostrich() };
		for (Bird bird : birds) {
			bird.fly();
		}

	}

}