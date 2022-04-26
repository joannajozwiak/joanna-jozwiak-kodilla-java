package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private AvailabiltyService availabiltyService;
    private OrderRepository orderRepository;

    public ProductOrderService (final AvailabiltyService availabiltyService,
                           final OrderRepository orderRepository) {
        this.availabiltyService = availabiltyService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isAvaliable = availabiltyService.isAvailable(orderRequest.getUser(),orderRequest.getTimeOfOrder(), orderRequest.getProduct());

        if (isAvaliable) {
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getTimeOfOrder(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
