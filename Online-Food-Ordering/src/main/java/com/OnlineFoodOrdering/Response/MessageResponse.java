package com.OnlineFoodOrdering.Response;

import lombok.Data;

@Data
public class MessageResponse {

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

}
