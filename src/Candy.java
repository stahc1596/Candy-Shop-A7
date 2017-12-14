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
    
    private double weight;
    private int price;
    
    public Candy(String name, double weight, int pricePerLbs){
        super(name);
        this.weight = weight;
        price = pricePerLbs;
    }

 
    
    public String toString(){
       int space = 30 - super.getName().length() 
                - DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
        String line = super.getName();
        for(int i = 0; i < space; i++){
            line += " ";
        }
        line += DessertShoppe.cents2dollarsAndCents(this.getCost());
        return line;
    }

    @Override
    public int getCost() {
        double exactCost = (weight*price);
        int cost = 0;
        if(exactCost >= (int)(exactCost) + 0.5){
            cost = (int)(exactCost) + 1;
        }else{
            cost = (int)(exactCost);
        }
        return cost;
    }
}
