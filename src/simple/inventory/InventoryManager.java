
package simple.inventory;
import java.util.ArrayList;
/**
 *
 * @author Student
 */
public class InventoryManager {
    

//The ArrayList that acts as the database in memory
private ArrayList<InventoryItem>items = new ArrayList<>();

//Add a new item
public void addItem(InventoryItem item){
    items.add(item);
   
}
//Remoove an item by its row index 
public void removeItem(int index){
    //Check if the index is valid to prevent crashing
    if (index>=0 && index<items.size()){
        items.remove(index);
    }
}
//Get the whole list 
public ArrayList<InventoryItem>getAllItems(){
    return items;
}

public void updateItem(String oldName, InventoryItem updated) {
    for (int i = 0; i < items.size(); i++) {
        if (items.get(i).getName().equalsIgnoreCase(oldName)) {
            items.set(i, updated);
            return;
        }
    
    }
}
}