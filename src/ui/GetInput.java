/**
 * @Author Jon
 *
 * Notes to self:
 *      - should I even bother with input validation in getString function
 *      if input is validated in the switch case in BugTrackerApp class?
 *
 *      - implement functionality to ensure bug ID's are unique
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
     * getString function prompts user input for menu navigation - input is validated by switch case
     * This function is called by BugTracker class
     * @return user input
     */
    public static String getString(){
        String s = "";
        System.out.print("enter a command: ");
        s = sc.next();
        sc.nextLine();
        return s.toLowerCase();
    }

    /**
     * getDouble function prompts user input for a valid ID - input is validated in the function
     * This function is called by the BugTracker class
     * @return user input used to uniquely identify bugs
     */
    public static double getDouble(){

        return 0;
    }
}
