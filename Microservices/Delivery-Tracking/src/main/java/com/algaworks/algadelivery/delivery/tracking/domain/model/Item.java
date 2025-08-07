package com.algaworks.algadelivery.delivery.tracking.domain.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Item {

    @EqualsAndHashCode.Include
    private UUID id;

    private String name;

    private Integer quantity;

    static Item brandNew(String name, Integer quantity) {
        Item item = new Item();
        item.setId(UUID.randomUUID());
        item.setName(name);
        item.setQuantity(quantity);
        return item;
    }

}
