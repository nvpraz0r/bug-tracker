/**
 * @Author Jon
 * @Version 0.1
 *
 * Notes to self:
 *
 */

package ui;

public class BugTrackerApp {
    public static void main(String args[]){

        // check for existence of text file
        // better to fail early than later
        // add try block to create text file

        // print command menu
        System.out.println("Bug Tracker");
        printMenu();

        String userChoice = "";

        // main functionality loop
        do {
            userChoice = GetInput.getString();

            switch (userChoice) {
                case "l" -> System.out.println("List");
                case "a" -> System.out.println("Active");
                case "u" -> System.out.println("Update");
                case "c" -> System.out.println("Create");
                case "d" -> System.out.println("Delete");
                case "h" -> System.out.println("Help");
                case "e" -> System.out.println("Exiting");
                default -> System.out.println("Something went wrong");
            }

        } while(!userChoice.equals("e"));

    }

    // this function is meant to be called as many times as the user needs
    private static void printMenu(){
        System.out.println("List of commands:");
        System.out.println("L - List all bugs");
        //add functionality to this
        System.out.println("A - List active bugs");
        System.out.println("U - Update status of a bug");
        System.out.println("C - Create a new entry:");
        System.out.println("D - Delete an entry:");
        System.out.println("H - Help:");
        System.out.println("E - Exit");
    }
}
