package practice.schoolportal;

import java.util.Scanner;

public class Message {
    static Scanner scanner = new Scanner(System.in);

    public static void displayWelcomeMessage() {
        System.out.println("Welcome to school portal");
        System.out.println("Please create a new admin or proceed to login");

    }

    public static int selectBaseOperation() {
        return selectOperation("Press 1 to create a new admin\npress 2 to login as an admin\npress -1 to leave " +
                "application");
    }

    public static int selectAdminOperation() {
      return selectOperation("1: create a classroom\n2: Create a teacher \n3: Create a student ");
    }

    private static int selectOperation(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public static String getStringFromUser(String message) {
        System.out.println(message);
        return scanner.next();
    }

    public static String getAdminDetails() {
        System.out.println("Please enter your details in this format:" +
                " (firstname,lastname,age,username,password)");
        return scanner.next();
    }
}
