package by.tms.pet.store.service;

import by.tms.pet.store.storage.InMemoryPetStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    @Autowired
    InMemoryPetStorage inMemoryPetStorage;
}
