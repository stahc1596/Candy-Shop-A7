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
        
    }

    @Override
    public int getCost() {
        int cost = super.getPrice() + toppingCost;
        return cost;
    }    
}
