package by.tms.pet.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

    private int id;
    private Category category;
    private String name;
    private List<Tag> tags;
    private PetStatus petStatus;
}
