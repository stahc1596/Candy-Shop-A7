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
    
    private int num;
    private int price;
    
    public Cookie(String name, int number, int pricePer12){
        super(name);
        num = number;
        price = pricePer12;
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
    public int getCost(){
        double exactCost = price/12;
        exactCost = exactCost*num;
        exactCost = Math.round(exactCost);
        int cost = (int)exactCost;
        return cost;
    }
    
}
