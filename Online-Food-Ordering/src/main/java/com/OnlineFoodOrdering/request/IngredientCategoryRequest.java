package com.OnlineFoodOrdering.request;

import lombok.Data;

@Data
public class IngredientCategoryRequest {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    private String name;
    private Long restaurantId;
}
