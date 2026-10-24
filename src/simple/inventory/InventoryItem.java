/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simple.inventory;

/**
 *
 * @author minat
 */
public class InventoryItem {
    
    //private Instance Variable 
    private String name;
    private String category;
    private int quantity;
    private double price;
    
    //Constructor 
    public InventoryItem(String name, String category, int quantity, double price){
        
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }
    //Getters methods
    public String getName(){
        return name;
        
    }
    
    public String getCategory(){
        return category;
    }
    public int getQuantity(){
        return quantity;
        
    }
    public double getPrice(){
        return price;
    }
    
    //Setters methods 
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
