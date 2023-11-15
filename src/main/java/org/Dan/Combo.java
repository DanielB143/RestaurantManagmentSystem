package org.Dan;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Combo {
    private int nextId = 1;

    private static final int MAX_DISHES = 2;
    private static final int MAX_BEVERAGES = 2;
    private String id;
    private String name;
    private double price;
    private Beverage[] beverages;
    private Dish[] dishes;



    public Combo(String name){
        this.id = String.format("C%03d", nextId++);
        this.name = name;
        this.price = price;
        this.dishes = new Dish[2];
        this. beverages = new Beverage[2];
    }

    public void addDish(Dish dish){
        if(dishes[0] == null){
            dishes[0] = dish;
            calcPrice();
        }else if(dishes[1] == null){
            dishes[1] = dish;
            calcPrice();
        }else{
            System.out.printf("There are already %d dishes. No more allowed", MAX_DISHES);
        }
    }

    public void addBeverages(Beverage beverage){
        if(beverages[0] == null){
            beverages[0] = beverage;
            calcPrice();
        }else if(beverages[1] == null){
            beverages[1] = beverage;
            calcPrice();
        }else{
            System.out.printf("There are already %d beverages. No more allowed", MAX_BEVERAGES);
        }
    }

    public void calcPrice(){
        double price = 0;

        for (Beverage beverage : beverages){
            if(beverage != null) {
                price += beverage.getPrice();
            }
        }
        for (Dish dish : dishes){
            if(dish != null) {
                price += dish.getPrice();
            }
        }
        double discountRatio = 0.8;
        this.price = price * discountRatio;
    }
}
