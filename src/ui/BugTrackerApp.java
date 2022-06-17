/**
 * @Author Jon
 * @Version 0.1
 *
 */

package ui;

import business.Bug;
import database.DAO;

import java.util.List;

/**
 * BugTrackerApp class is the main application driver
 */
public class BugTrackerApp {

    // declare static DAO object
    private static DAO<Bug> file;

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
                case "l" -> System.out.println("List");
                case "a" -> System.out.println("Active");
                case "u" -> System.out.println("Update");
                case "c" -> System.out.println("Create");
                case "d" -> System.out.println("Delete");
                case "h" -> printMenu();
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
        System.out.println("C - Create a new entry");
        System.out.println("D - Delete an entry");
        System.out.println("H - Help");
        System.out.println("E - Exit");
        System.out.println("======------======");
        System.out.println();
    }

    // declaring functions ahead of giving functionality
    // planning what needs to be done

    public static void displayAllBugs(){

        // declare list object
        List<Bug> bugs;

        try{
            // instantiate object to all elements
        } catch (Exception e){
            System.out.println("There was an error retrieving the list");
        }

        // this statement is moved outside of the try block
        bugs = file.getAll();

        // declare bug object
        Bug bugObject;
        StringBuilder sb = new StringBuilder();

        // loop through each element in the object and format the display
        for (Bug i : bugs) {
            bugObject = i;
            // NTS: change getId to the end of append calls if it looks awkward
            sb.append(bugObject.getId());
            sb.append(StringFormat.formatWithSpaces(bugObject.getName(), 8));
            sb.append(StringFormat.formatWithSpaces(bugObject.getDescription(), 44));
            sb.append(StringFormat.formatWithSpaces(bugObject.getStatus(), 8));
        }
        System.out.println(sb.toString());
    }

    public static void displayActiveBugs(){}

    public static void updateBugStatus(){}

    public static void createBug(){}

    public static void deleteBug(){}

    public static void helpUse(){}

}
