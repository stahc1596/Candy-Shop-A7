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
       
    }

    @Override
    public int getCost() {
        int cost = (int)(weight*price);
        return cost;
    }
}
