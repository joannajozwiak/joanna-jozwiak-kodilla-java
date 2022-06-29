package com.kodilla.good.patterns.food2door;

public class OrderDto {
    private Producent producent;
    private Product product;
    private boolean isOrdered;

    public OrderDto(Producent producent, Product product, boolean isOrdered) {
        this.producent = producent;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public Producent getProducent() {
        return producent;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
