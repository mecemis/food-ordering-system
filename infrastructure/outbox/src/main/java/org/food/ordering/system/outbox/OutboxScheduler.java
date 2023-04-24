package org.food.ordering.system.outbox;

public interface OutboxScheduler {
    void processOutboxMessage();
}
