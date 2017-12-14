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
    
    private String toppingName;
    private int toppingCost;
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost){
       super(icName, icCost);
       this.toppingName = toppingName;
       this.toppingCost = toppingCost;
    }
    

    @Override
    public String toString(){
        int space = 30 - toppingName.length() - super.getName().length()
                - DessertShoppe.cents2dollarsAndCents(this.getCost()).length() - 6;
        String line = super.getName();
        if(space < 0){
            line += "\n";
            space = 30 - DessertShoppe.cents2dollarsAndCents(this.getCost()).length() 
                    - toppingName.length() - 5;
        }else{
            line += " ";
        }
        line += "With " + toppingName;
        for(int i = 0; i < space; i ++){
            line += " ";
        }
        line += DessertShoppe.cents2dollarsAndCents(this.getCost());
        return line;
    }

    @Override
    public int getCost() {
        int cost = super.getCost() + toppingCost;
        return cost;
    }    
}
