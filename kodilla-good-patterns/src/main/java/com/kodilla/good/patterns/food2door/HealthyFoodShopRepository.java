package com.kodilla.good.patterns.food2door;

public class HealthyFoodShopRepository implements OrderRepository{
    @Override
    public void createOrder(IProducent producent, Product product) {
        System.out.println("Creating new order");

        producent.process();
    }
}
