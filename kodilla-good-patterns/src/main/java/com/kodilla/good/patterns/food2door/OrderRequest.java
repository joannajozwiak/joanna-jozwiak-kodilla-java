package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    private Producent producent;
    private Product product;

    public OrderRequest(Producent producent, Product product) {
        this.producent = producent;
        this.product = product;
    }

    public Producent getProducent() {
        return producent;
    }

    public Product getProduct() {
        return product;
    }
}
