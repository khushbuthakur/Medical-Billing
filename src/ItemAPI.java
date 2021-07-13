/**
 * ItemAPI class to model a consumer item that is bought and sold.
 * 
 * @author dpeters
 *
 */

public class ItemAPI {
	private int id;
    private double price;
    private String name;
    private String description;

    public ItemAPI() {
        super();
    }
    
    /**
     * (TO BE COMPLETED BY STUDENT)
     */
 
    /**
     * return a String representation of the object state
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("# ").append(id);
        sb.append(" $ ").append(price);
        sb.append(" ").append(name);
        sb.append(" '").append(description).append("'");
        
        return sb.toString();
    } 
}
