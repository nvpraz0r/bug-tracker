/**
 * @Author Jon
 *
 * Notes to self:
 *      - should I even bother with input validation in getString function
 *      if input is validated in the switch case in BugTrackerApp class?
 */

package ui;

import java.util.Scanner;


/**
 * GetInput class retrieves user input in some cases validates too
 */
public class GetInput {

    // scanner object
    private static Scanner sc = new Scanner(System.in);

    /**
     * This method is called by BugTracker class the input is validated by the switch case
     * @return user input
     */
    public static String getString(){
        String s = "";
        System.out.println("enter a command");
        s = sc.next();
        sc.nextLine();
        return s.toLowerCase();
    }
}
