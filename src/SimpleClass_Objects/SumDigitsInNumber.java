package IntroducingClasses;

import java.util.Scanner;

/**
 * 
 * @author Aronno
 *
 */
public class SumDigitsInNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
		int number = sc.nextInt();

		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);

		sc.close();
	}

	public static int sumDigitsInNumber(int number) {
//		int result = 0;
//		while (number != 0) {
//			result += number % 10;
//			number /= 10;
//		}
//		return Math.abs(result);
		
		int result=0;
		while (number!=0) {
			result+=number%10;
			number/=10;
		}
		return Math.abs(result);

	}

}