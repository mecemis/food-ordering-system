package org.food.ordering.system.order.service.domain.dto.create;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.food.ordering.system.domain.valueobject.OrderStatus;

import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class CreateOrderResponse{
    @NotNull
    private final UUID orderTrackingId;
    @NotNull
    private final OrderStatus orderStatus;
    @NotNull
    private final String message;
}
