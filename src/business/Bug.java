/**
 * @Author Jon
 */

package business;

/**
 * POJO
 */
public class Bug {

    private double id;
    private String name;
    private String description;
    private String status;

    public Bug() {
        this(0, "", "", "");
    }

    public Bug(double id, String name, String description, String status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
