/**
 * @Author Jon
 */

package database;

import business.Bug;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class BugTextFile implements DAO<Bug>{
    private List<Bug> bugs = null;
    private Path bugPath = null;
    private File bugFile = null;
    private final String TAB_SEP = "\t";

    public BugTextFile() throws Exception{
        bugPath = Paths.get("bugs.txt");
        bugFile = bugPath.toFile();
        bugs = this.getAll();
    }

    @Override
    public List<Bug> getAll() throws Exception{

        if (bugs != null){
            return bugs;
        }

        bugs = new ArrayList<>();

        try(BufferedReader in = new BufferedReader((new FileReader(bugFile)))){

            String line = in.readLine();

            while(line != null){
                String [] fields = line.split(TAB_SEP);
                String id = fields[0];
                String name = fields[1];
                String  description = fields[2];
                String status = fields[3];

                Bug b = new Bug(Double.parseDouble(id), name, description, status);

                line = in.readLine();
            }
        } catch (IOException e){
            throw new Exception(e);
        }
        return bugs;
    }

}
