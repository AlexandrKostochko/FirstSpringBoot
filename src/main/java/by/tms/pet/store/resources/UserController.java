package by.tms.pet.store.resources;

import by.tms.pet.store.model.User;
import by.tms.pet.store.storage.InMemoryUserStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    InMemoryUserStorage inMemoryUserStorage;

    @GetMapping
    public ResponseEntity<User> authorization() {

    }

    @GetMapping(path = "/login")
    public ResponseEntity<User> login() {
        inMemoryUserStorage.save();
    }

}
