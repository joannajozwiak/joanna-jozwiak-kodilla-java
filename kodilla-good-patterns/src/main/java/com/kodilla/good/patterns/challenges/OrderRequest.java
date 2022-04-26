package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {
    private User user;
    private LocalDate timeOfOrder;
    private String product;

    public OrderRequest(User user, LocalDate timeOfOrder, String product) {
        this.user = user;
        this.timeOfOrder = timeOfOrder;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getTimeOfOrder() {
        return timeOfOrder;
    }

    public String getProduct() {
        return product;
    }
}
