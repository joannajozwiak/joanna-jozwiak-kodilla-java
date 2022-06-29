package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.challenges.*;

public class OrderMain {
    public static void main (String [] args) {
        OrderRequest orderRequest = new OrderRequest(new Producent("HealthyFoodShop", "Wiejska 2"), new Product("Jabłko", 1.5,55.00));
        OrderProcess orderProcess = new OrderProcess(new HealthyFoodShopRepository(), new HealthyFoodShopService());

        OrderDto orderDto = orderProcess.processRequest(orderRequest);

        System.out.println("OrderDto " + orderDto.getProducent().getCompanyName() + " " +orderDto.getProduct().getProductName() + " is ended");


    }
}
