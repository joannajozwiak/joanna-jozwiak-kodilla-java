package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ClothesOrderRepository implements OrderRepository {
    private User user;
    private LocalDate timeOfOrder;
    private String product;

    @Override
    public void createOrder (User user, LocalDate timeOfOrder, String product) {
        this.user = user;
        this.timeOfOrder = timeOfOrder;
        this.product = product;

    }


}
