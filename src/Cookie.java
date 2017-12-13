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
        
    }

    @Override
    public int getCost(){
        int cost = price*num;
        return cost;
    }
    
}
