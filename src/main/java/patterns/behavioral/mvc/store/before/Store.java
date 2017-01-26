package patterns.behavioral.mvc.store.before;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hany
 */
public class Store {
    
    private List<Item> items = new ArrayList<>();

    public Store() {
        items.add( new Item("Thinkpad", 9000) );
        items.add( new Item("PlayStation", 3000) );
        items.add( new Item("HP LaserJet", 1200) );
        items.add( new Item("Samsung Note", 4000) );
        items.add( new Item("Toshiba TV", 5400) );
    }

    public List<Item> selectAllItems() {
        return items;
    }
    
    public List<Item> selectTopSellingItems() {
        return items.subList(0, 3);
    }
    
}
