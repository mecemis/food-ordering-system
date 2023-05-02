package org.food.ordering.system.customer.service.domain.ports.output.message.publisher;

import org.food.ordering.system.customer.service.domain.event.CustomerCreatedEvent;

public interface CustomerMessagePublisher {

    void publish(CustomerCreatedEvent customerCreatedEvent);

}