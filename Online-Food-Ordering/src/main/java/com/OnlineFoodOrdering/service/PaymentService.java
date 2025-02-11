package com.OnlineFoodOrdering.service;

import com.OnlineFoodOrdering.Response.PaymentResponse;
import com.OnlineFoodOrdering.model.Order;

public interface PaymentService{

    public PaymentResponse createPaymentLink(Order order);
}
