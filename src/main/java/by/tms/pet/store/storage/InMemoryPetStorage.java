package by.tms.pet.store.storage;

import by.tms.pet.store.model.Pet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryPetStorage {

    private static List<Pet> pets = new ArrayList<>();
}
