package IntroducingClasses;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Aronno
 *
 */
public class GenerateRandomArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Array element\n");
		int number = sc.nextInt();
//		var array = generateRandomArray(number);
		System.out.println();

	}
	
	public int generateRandomArray(int number){
		Random random=new Random();
		  int[][] array=new int[number][number];
		  for(int i=0;i<5;i++)
		  {
		      for(int j=0;j<5;j++)
		      {
		         array[i][j]=random.nextInt(99);
		         System.out.print(array[i][j]+"\t");
		      }
		  
		     System.out.print("\n");
		  }
		return number;
	}

}