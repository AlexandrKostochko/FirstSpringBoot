package by.tms.pet.store.storage;

import by.tms.pet.store.model.User;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryUserStorage {

    private static List<User> users = new ArrayList<>();
    private static int idUser = 1;

    public boolean contains(String userName) {
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    public User getByUserName(String userName) {
        for (User user : users) {
            if (user.getUserName().equals(userName)){
                return user;
            }
        }
        return null;
    }

    public void save(User user) {
        user.setId(idUser);
        idUser++;
        users.add(user);
    }
}
