package com.example.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public OrderController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public String placeOrder(@RequestBody String order) {
        kafkaTemplate.send("order-topic", order);
        return "Order sent: " + order;
    }
}
