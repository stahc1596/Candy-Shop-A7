/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class Cookie extends DessertItem{
    
    //Instance variables for the number of cookies and the price of the cookies
    //for a dozen cookies
    private int num;
    private double price;
    
    /**
     * Constructor for the cookies
     * @param name name of the cookie(s) bought
     * @param number number of cookies bought
     * @param pricePer12 the price for twelve cookies
     */
    public Cookie(String name, int number, int pricePer12){
        //Name is stored in the super class
        super(name);
        //Number of cookies bought
        num = number;
        //Price per 12 cookies is stored in the corresponding instance variable
        price = pricePer12;
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
    public int getCost(){
        //Divide the cookies by 12 to get the cost of one cookie
        double exactCost = price/12;
        //Multiply the cost of one cookie by the amount of cookies bought to get
        //the total cost of the group of cookies
        exactCost = exactCost*num;
        //Round the total cost to a whole number
        int cost = (int)Math.round(exactCost);
        //Return the cost
        return cost;
    }
    
}
