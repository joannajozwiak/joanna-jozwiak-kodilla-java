package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {
    public OrderRequest retrieve () {
        User user = new User ("Jan", "Johny");
        LocalDate timeOfOrder = LocalDate.of (2022, 03, 11);
        String product = "Jeansy oversize";

        return new OrderRequest (user, timeOfOrder, product);
    }
}
