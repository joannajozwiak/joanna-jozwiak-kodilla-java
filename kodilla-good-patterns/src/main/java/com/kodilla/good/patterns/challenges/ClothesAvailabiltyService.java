package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ClothesAvailabiltyService implements AvailabiltyService {
    private User user;
    private LocalDate timeOfOrder;
    private String product;

    @Override
    public boolean isAvailable (User user, LocalDate timeOfOrder, String product) {
        this.user = user;
        this.timeOfOrder = timeOfOrder;
        this.product = product;
        return true;
    }

}
