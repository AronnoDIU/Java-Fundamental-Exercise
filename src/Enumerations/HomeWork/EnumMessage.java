package Enumerations.HomeWork;

import java.util.Scanner;

/**
 * 
 * @author Yeasir Arafat Aronno
 *
 */

public class EnumMessage {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				System.out.println("Please, enter message type to check it priority: ");
				String userInput = sc.next();

				if (isValidMessageType(userInput)) {
					MessageType messageType = MessageType.valueOf(userInput.toUpperCase());
					System.out.println(messageType.getPriority());
					break;
				} else {
					System.out.println("Please, enter valid " + "message type. Only 'A', 'B', 'C' or 'D' are allowed");
					continue;
				}
			}
		}
		System.out.println("1" + 1);

	}

	private static boolean isValidMessageType(String userInput) {

		return (userInput.equalsIgnoreCase("a") || userInput.equalsIgnoreCase("b") || userInput.equalsIgnoreCase("c")
				|| userInput.equalsIgnoreCase("d"));
	}

}