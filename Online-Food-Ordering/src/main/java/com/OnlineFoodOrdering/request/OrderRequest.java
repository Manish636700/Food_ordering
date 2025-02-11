package com.OnlineFoodOrdering.request;


import com.OnlineFoodOrdering.model.Address;
import lombok.Data;

@Data
public class OrderRequest {

    public Long getRestaurantId() {
        return RestaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        RestaurantId = restaurantId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Long RestaurantId;

    private Address address;


}
