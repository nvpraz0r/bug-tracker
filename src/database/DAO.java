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
    T get(String id);
    List <T> getAll();
    boolean add (T t);
    boolean update (T t);
    boolean delete(T t);
}
