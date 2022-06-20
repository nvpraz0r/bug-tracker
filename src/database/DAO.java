/**
 * @Author Jon
 *
 */
package database;

import java.util.List;

/**
 * DAO interface provides blueprints for manipulating data
 */
public interface DAO <T>{
    T get(String name) throws Exception;
    List <T> getAll() throws Exception;
    boolean add (T t) throws Exception;
    boolean update (T t) throws Exception;
    boolean delete(T t) throws Exception;
}
