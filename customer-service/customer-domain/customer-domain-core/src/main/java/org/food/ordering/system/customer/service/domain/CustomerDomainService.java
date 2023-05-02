package org.food.ordering.system.customer.service.domain;

import org.food.ordering.system.customer.service.domain.entity.Customer;
import org.food.ordering.system.customer.service.domain.event.CustomerCreatedEvent;

public interface CustomerDomainService {

    CustomerCreatedEvent validateAndInitiateCustomer(Customer customer);

}
