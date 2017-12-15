/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class Candy extends DessertItem{
    
    //Instance variables store the weight of candy the customer is buying and
    //the price of the candy per pound
    private double weight;
    private double price;
    
    /**
     * Constructor for the candy
     * @param name name of the candy bought
     * @param weight weight of the candy bought
     * @param pricePerLbs price per pound of the candy bought
     */
    public Candy(String name, double weight, int pricePerLbs){
        //Name is stored in the super class
        super(name);
        //Weight is stored in the corresponding instance variable
        this.weight = weight;
        //Price per pound is stored in the instance variable
        price = pricePerLbs;
    }

 
    /**
     * Method creates the line of text for the item on the receipt
     * @return the line of text
     */
    public String toString(){
        //Determine how many spaces the line on the receipt is going to need
       int space = 30 - super.getName().length() 
                - DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
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
     * Method calculates the cost of the order
     * @return the total cost of the group of item
     */
    @Override
    public int getCost() {
        //Get the exact cost of all the candy by mulitplying the weight and the
        //price
        double exactCost = (weight*price);
        //Round the cost of the candy to a whole number
        int cost = (int)Math.round(exactCost);
        //Return the total cost of the candy
        return cost;
    }
}
