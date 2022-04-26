package com.kodilla.good.patterns.challenges;

public class OrderMain {
    public static void main (String [] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new ClothesAvailabiltyService(), new ClothesOrderRepository());
        productOrderService.process(orderRequest);

    }
}
