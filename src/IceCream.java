/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public abstract class IceCream extends DessertItem{

    private int price;
    
    public IceCream(String name, int cost){
        super(name);
        price = cost;
    }

    @Override
    public String toString(){
        int space = 30 - DessertShoppe.cents2dollarsAndCents(price).length()
                - super.getName().length();
    }

    public int getPrice(){
        return price;
    }
    
    @Override
    public int getCost(){
        return price;
    }
    
    public abstract int getSundaeCost();
}
