package com.example.app_2;

import com.example.app_2.model.FoodItem;
import com.example.app_2.model.IFooditems;

import java.util.ArrayList;
import java.util.List;

public class ItemData implements IFooditems {

    private List<FoodItem> items;

    public ItemData(){
        items = new ArrayList<>();
        items.add(new FoodItem("Cheese Burger", "Burgers", 30));
        items.add(new FoodItem("Double Cheese Burger", "Burgers", 40));
        items.add(new FoodItem("BBQ Burger", "Burgers", 35));
        items.add(new FoodItem("Royal Burger", "Burgers", 50));
        items.add(new FoodItem(" Double BBQ Burger", "Burgers", 35));
        items.add(new FoodItem("Crispy Burger", "Burgers", 60));
        items.add(new FoodItem("Mexican Burger", "Burgers", 35));
        items.add(new FoodItem("pepsi", "Drinks", 5));
        items.add(new FoodItem("Margarita", "Pizzas", 30));
        items.add(new FoodItem("Fanta", "Drinks", 5));
        items.add(new FoodItem("cocacola", "Drinks", 5));
        items.add(new FoodItem("Sprite", "Drinks", 5));
        items.add(new FoodItem("peproni", "Pizzas", 5));


    }

    @Override
    public List<String> getCategories() {
        List<String> cats = new ArrayList<>();
        cats.add("Burgers");
        cats.add("Pizzas");
        cats.add("Drinks");
        return cats;
    }

    @Override
    public List<FoodItem> getItemsByaCategory(String cat) {
        List<FoodItem> result = new ArrayList<>();

        for (FoodItem it: items){
            if (it.getCategory().equals(cat)){
                result.add(it);
            }
        }
        return result;
    }
}
