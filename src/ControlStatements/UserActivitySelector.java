package ControlStatements;

import java.util.Scanner;

public class UserActivitySelector {

    public static void main(String[] args) {

        System.out.print("Please, enter action name: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        switch (userInput) {  // Using Enhance Switch Statements.
            case "login" -> System.out.println("Please, enter your username");
            case "sign_up" -> System.out.println("Welcome!");
            case "terminate_program" -> System.out.println("Thank you! Good bye!");
            case "main_menu" -> System.out.println("Main menu");
            case "about_app" -> System.out.println("This app is created by me with " + "support of ®IT-Bulls.com");
            default -> System.out.println(
                    "Please, enter one of these values: login, " + "sign_up, terminate_program, main_menu, about_app");
        }
        sc.close();

    }

}

/*Expected Output::

Please, enter action name: about_app
This app is created by me with support of ®IT-Bulls.com

* */