package com.kodilla.good.patterns.food2door;

public class HealthyFoodShopService implements OrderService{

    @Override
    public boolean isOrdered(IProducent producent, Product product) {
        System.out.println("HealthyFoodShop process order.");
        return true;
    }


}
