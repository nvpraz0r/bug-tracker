/**
 * @Author Jon
 * @Version 0.1
 */

package ui;

public class BugTrackerApp {
    public static void main(String args[]){

        // check for existence of text file
        // better to fail early than later
        // add try block to create text file

        // print command menu
        System.out.println("Bug Tracker");


    }

    private static void printMenu(){
        System.out.println("List of commands:");
        System.out.println("L - List all bugs");
        //add functionality to this
        System.out.println("A - List active bugs");
        System.out.println("I - Change bug to inactive");
        System.out.println("C - Create a new entry:");
        System.out.println("D - Delete an entry:");
        System.out.println("H - Help:");
        System.out.println("E - Exit");
    }
}
