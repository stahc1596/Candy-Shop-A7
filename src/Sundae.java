/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class Sundae extends IceCream{
    
    //Instance variables store the name of the topping on the sundae and the cost
    //of that topping
    private String toppingName;
    private int toppingCost;
    
    /**
     * Constructor for the sundae
     * @param icName name of the ice cream bought
     * @param icCost cost of the ice cream bought
     * @param toppingName name of the topping bought
     * @param toppingCost cost of the topping bought
     */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost){
       //Name and cost of the ice cream is stored in the super class "IceCream"
       super(icName, icCost);
       //The name of the topping is stored in the corresponding instance variable
       this.toppingName = toppingName;
       //The cost of the topping is stored in the corresponding instance variable
       this.toppingCost = toppingCost;
    }
    

    /**
     * Method creates the line of text for the item on the receipt
     * @return the line of text
     */
    @Override
    public String toString(){
        //Determine how many spaces the line on the receipt is going to need
        int space = 30 - toppingName.length() - super.getName().length()
                - DessertShoppe.cents2dollarsAndCents(this.getCost()).length() - 6;
        //Start the line with the name
        String line = super.getName();
        //If the name of both the ice cream, topping's and the cost take up more
        //than 30 spaces(size of receipt) then two lines are created instead of
        //one
        if(space < 0){
            //Go to the next line
            line += "\n";
            //Determine the new number of spaces needed
            space = 30 - DessertShoppe.cents2dollarsAndCents(this.getCost()).length() 
                    - toppingName.length() - 5;
        }else{
            //If a new line isn't needed, then continue on the current line
            line += " ";
        }
        //Next, add the topping name to the line
        line += "With " + toppingName;
        //Add in all the necessary spaces
        for(int i = 0; i < space; i ++){
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
        //Add the cost of the ice cream plus the cost of the toppings
        int cost = super.getCost() + toppingCost;
        //Return the total cost
        return cost;
    }    
}
