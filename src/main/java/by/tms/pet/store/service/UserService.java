package by.tms.pet.store.service;

import by.tms.pet.store.model.User;
import by.tms.pet.store.storage.InMemoryUserStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    InMemoryUserStorage inMemoryUserStorage;

    public User getByUserName(String userName) {
        if(inMemoryUserStorage.contains(userName)) {
            User byName = inMemoryUserStorage.getByUserName(userName);
            return byName;
        }
        return null;
    }

    public boolean add(User user) {
        if (inMemoryUserStorage.contains(user.getUserName())) {
            throw new UserExistsException("User is exists");
        }
        inMemoryUserStorage.save(user);
        return true;
    }
}
