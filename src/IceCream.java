/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class IceCream extends DessertItem{

    //Instance variables store the price of the ice cream
    private int price;
    
    /**
     * Constructor for the ice cream
     * @param name name of the ice cream bought
     * @param cost price of the ice cream
     */
    public IceCream(String name, int cost){
        //Name of the ice cream is stored in the super class
        super(name);
        //Price of the ice cream is stored in the corresponding instance variable
        price = cost;
    }

    /**
     * Method creates the line of text for the item on the receipt
     * @return the line of text
     */
    @Override
    public String toString(){
        //Determine how many spaces the line on the receipt is going to need
        int space = 30 - DessertShoppe.cents2dollarsAndCents(this.getCost()).length()
                - super.getName().length();
        //Start the line with the name
        String line = super.getName();
        //Add in all the necessary spaces
        for(int i = 0; i < space; i++){
            line += " ";
        }
        //Add the total cost of the item(s) and convert the price into dollars
        line += DessertShoppe.cents2dollarsAndCents(this.getCost());
        //Return the line to be printed on the receipt
        return line;
    }

    /**
     * Method is used to help the sundae subclass get the name of the ice cream
     * @return the name of the ice cream
     */
    public String Name(){
        return super.getName();
    }   
    
    /**
     * Method calculates the cost of the order
     * @return the total cost of the group of item
     */
    @Override
    public int getCost(){
        return price;
    }
}
