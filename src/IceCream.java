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

    private int price;
    
    public IceCream(String name, int cost){
        super(name);
        price = cost;
    }

    @Override
    public String toString(){
        int space = 30 - DessertShoppe.cents2dollarsAndCents(this.getCost()).length()
                - super.getName().length();
        String line = super.getName();
        for(int i = 0; i < space; i++){
            line += " ";
        }
        line += DessertShoppe.cents2dollarsAndCents(this.getCost());
        return line;
    }

    
    public String Name(){
        return super.getName();
    }   
    
    @Override
    public int getCost(){
        return price;
    }
}
