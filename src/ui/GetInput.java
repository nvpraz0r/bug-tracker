package ui;

import java.util.Scanner;

public class GetInput {

    private static Scanner sc = new Scanner(System.in);

    public static String getString(){
        String s = "";
//        boolean isValid = false;

        // checking if BTA class switch case works before creating a new one
        System.out.println("enter a command");
        s = sc.next();
        sc.nextLine();

        return s;
    }
}
