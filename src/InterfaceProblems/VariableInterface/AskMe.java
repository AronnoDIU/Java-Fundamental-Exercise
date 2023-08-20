package Interface.VariableInterface;

import java.util.Random;

/**
 * 
 * @author Yeasir Arafat Aronno
 *
 */
//  Interface can be extended.
interface ExtendedDemo {

	int NO = 0;
	int YES = 1;
	int MAYBE = 2;
}

interface SharedConstants extends ExtendedDemo {

	int LATER = 3;
	int SOON = 4;
	int NEVER = 5;
}

class Question implements SharedConstants {
	Random random = new Random();

	int Ask() {
		int prob = (int) (100 * random.nextDouble());

		if (prob < 30)
			return NO; // 30%

		else if (prob < 60)
			return YES; // 30%

		else if (prob < 75)
			return LATER; // 15%

		else if (prob < 98)
			return SOON; // 13%

		else
			return NEVER; // 2%

	}
}

public class AskMe implements SharedConstants {
	static void answer(int result) {
		switch (result) {
		case NO:
			System.out.println("No");
			break;
		case YES:
			System.out.println("Yes");
			break;
		case MAYBE:
			System.out.println("Maybe");
			break;
		case LATER:
			System.out.println("Later");
			break;
		case SOON:
			System.out.println("Soon");
			break;
		case NEVER:
			System.out.println("Never");
			break;
		}
	}

	public static void main(String[] args) {

		Question question = new Question();

		answer(question.Ask());
		answer(question.Ask());
		answer(question.Ask());
		answer(question.Ask());

	}

}