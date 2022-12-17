package com.example.app_2.model;

import java.util.List;

public interface IFooditems {
    List<String> getCategories();
    List<FoodItem> getItemsByaCategory(String cat);
    }

