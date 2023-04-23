package org.food.ordering.system.saga;

import org.food.ordering.system.domain.event.DomainEvent;

public interface SagaStep <T, S extends DomainEvent, U extends DomainEvent>{
    S process(T data);
    U rollback(T data);
}
