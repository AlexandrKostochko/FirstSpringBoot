package by.tms.pet.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private int id;
    private int petId;
    private int quantity;
    private String shipDate;
    private PetStatus petStatus;
    private boolean complete;
}
