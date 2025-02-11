package com.OnlineFoodOrdering.request;

import lombok.Data;

@Data
public class UpdateCartItemRequest {
    public Long getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(Long cartItemId) {
        this.cartItemId = cartItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private Long cartItemId;
    private int quantity;
}
