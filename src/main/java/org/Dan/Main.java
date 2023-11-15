package org.Dan;

public class Main{
    public static void main(String[] args){
        RestaurantManagementSystem restaurantManagementSystem = new RestaurantManagementSystem();

        Dish squidword = new Dish("Squidword", 123, FoodType.SEA_FOOD);
        Beverage bob = new Beverage("Bob", 120, true);
        Combo c1 = new Combo("Squidword & Bob");
        c1.addDish(squidword);
        c1.addBeverages(bob);

        restaurantManagementSystem.addCombo(c1);

        System.out.println(restaurantManagementSystem);
    }
}