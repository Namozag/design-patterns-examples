package patterns.structural.flyweight.connection;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Hany
 */
public class FlyweightConnectionManager implements ConnectionManager {
    
    private Map<String, Connection> map = new HashMap<>();
    
    public Connection getConnection(String datasource) {
        if(map.containsKey(datasource)) {
            return map.get(datasource);
        }
        Connection con = new Connection(datasource);
        map.put(datasource, con);
        return con;
    }
    
}
