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

    @Override
    public Bug get(String name) throws Exception{
        for (Bug b : bugs){
            if(b.getName().equals(name)){
                return b;
            }
        }
        return null;
    }

    @Override
    public boolean delete(Bug b) throws Exception{
        bugs.remove(b);
        return this.saveAll();
    }

    @Override
    public boolean add(Bug b) throws Exception{
        bugs.add(b);
        return this.saveAll();
    }

    @Override
    public boolean update(Bug newBug) throws Exception{
        Bug oldBug = this.get(newBug.getName());
        int i = bugs.indexOf(oldBug);
        bugs.remove(i);

        bugs.add(i, newBug);

        return this.saveAll();
    }

    private boolean saveAll() throws Exception{
        try (PrintWriter out = new PrintWriter(new BufferedWriter( new FileWriter(bugFile)))){
            for(Bug b: bugs){
                out.print(b.getId() + TAB_SEP);
                out.print(b.getName() + TAB_SEP);
                out.print(b.getDescription() + TAB_SEP);
                out.print(b.getStatus());
            }
            return true;
        } catch (IOException e){
            throw new Exception(e);
        }
    }
}
