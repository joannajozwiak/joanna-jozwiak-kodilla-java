package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderRepository {

    void createOrder (User user, LocalDate timeOfOrder, String product);
}
