/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public ArrayList<InventoryItem>getALLItems(){
    return items;
}}