package patterns.structural.flyweight.connection;

/**
 *
 * @author Hany
 */
public class Test1 {
    
    public static void main(String[] args) {
        
        ConnectionManager defaultCM = new DefaultConnectionManager();
        DatabaseTask task = new DatabaseTask(defaultCM);
        task.run();
        
    }
    
}
