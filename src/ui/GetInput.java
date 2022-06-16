/**
 * @Author Jon
 *
 * Notes to self:
 *      - should I even bother with input validation in getString function
 *      if input is validated in the switch case in BugTrackerApp class?
 */

package ui;

import java.util.Scanner;

public class GetInput {

    private static Scanner sc = new Scanner(System.in);

    /**
     * This method is called by BugTracker class
     *
     * The input is validated by the switch case
     *
     * @return user input
     */
    public static String getString(){
        String s = "";
        System.out.println("enter a command");
        s = sc.next();
        sc.nextLine();
        return s;
    }
}
