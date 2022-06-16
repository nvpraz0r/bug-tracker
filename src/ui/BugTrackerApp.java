/**
 * @Author Jon
 * @Version 0.1
 *
 */

package ui;

/**
 * BugTrackerApp class is the main application driver
 */
public class BugTrackerApp {
    public static void main(String args[]){

        // check for existence of text file
        // better to fail early than later
        // add try block to create text file

        try{
            // attempt to create a new file object
        } catch (Exception e){
            System.out.println("Error reading text file");
            System.out.println(e);
            System.out.println("Exiting");
            System.exit(0);
        }

        // print command menu
        System.out.println("Bug Tracker");
        printMenu();

        String userChoice = "";

        // main functionality loop
        do {
            userChoice = GetInput.getString();

            switch (userChoice) {
                // replace print statements with function calls
                case "l" -> printMenu();
                case "a" -> System.out.println("Active");
                case "u" -> System.out.println("Update");
                case "c" -> System.out.println("Create");
                case "d" -> System.out.println("Delete");
                case "h" -> System.out.println("Help");
                case "e" -> System.out.println("Exiting");
                default -> System.out.println("Please enter a valid navigation command...");
            }

        } while(!userChoice.equals("e"));

    }

    // this function is meant to be called as many times as the user needs
    private static void printMenu(){
        System.out.println();
        System.out.println("======------======");
        System.out.println("List of commands:");
        System.out.println("L - List all bugs");
        System.out.println("A - List ACTIVE bugs"); // maybe this won't make the cut
        System.out.println("U - Update status of a bug");
        System.out.println("C - Create a new entry:");
        System.out.println("D - Delete an entry:");
        System.out.println("H - Help:");
        System.out.println("E - Exit");
        System.out.println("======------======");
        System.out.println();
    }

    // declaring functions ahead of giving functionality
    // planning what needs to be done

    public static void displayAllBugs(){}

    public static void displayActiveBugs(){}

    public static void updateBugStatus(){}

    public static void createBug(){}

    public static void deleteBug(){}

    public static void helpUse(){}

}
