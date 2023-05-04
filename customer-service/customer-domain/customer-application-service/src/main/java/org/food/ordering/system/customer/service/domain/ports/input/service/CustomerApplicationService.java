package org.food.ordering.system.customer.service.domain.ports.input.service;

import org.food.ordering.system.customer.service.domain.create.CreateCustomerCommand;
import org.food.ordering.system.customer.service.domain.create.CreateCustomerResponse;

import jakarta.validation.Valid;

public interface CustomerApplicationService {

    CreateCustomerResponse createCustomer(@Valid CreateCustomerCommand createCustomerCommand);

}
