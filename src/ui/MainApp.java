package ui;

import database.DAO;
import database.DAOException;

public class MainApp {

    private static DAO<Bug> file;

    public static void main(String[] args){

        // introduce the user to the application
        System.out.println("Bug Tracker Project");
        displayOptions();

        try{
            file = new BugTextFile();
        } catch (Exception e){
            System.out.println(e);
        }
    }

    // list the options available to users
    private static void displayOptions() {
        System.out.println("Please select from a number of options:");
        System.out.println("C - Document a new bug");
        System.out.println("R - List documented bugs");
        //fun new function to add
        System.out.println("U - Update the activity status");
        System.out.println("D - Delete a bug from the database");
        System.out.println("H - Help");
        System.out.println("M - Menu");
    }
}
