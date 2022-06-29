package com.kodilla.good.patterns.food2door;

public class OrderProcess {
    private OrderRepository orderRepository;
    private OrderService orderService;

    public OrderProcess(final OrderRepository orderRepository, final OrderService orderService) {
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

  public OrderDto processRequest(final OrderRequest orderRequest) {
            orderRepository.createOrder(orderRequest.getProducent(), orderRequest.getProduct());
            orderService.isOrdered(orderRequest.getProducent(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getProducent(), orderRequest.getProduct(),  true);

    }
}
