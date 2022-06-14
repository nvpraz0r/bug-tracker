package database;

public class DAOException extends Exception{
    DAOException(){}

    DAOException(Exception e){
        super(e);
    }
}
