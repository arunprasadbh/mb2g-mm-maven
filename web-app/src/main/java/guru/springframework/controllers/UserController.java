package guru.springframework.controllers;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;

public class UserController {
    User SaveUser(UserCommand userCommand ){
        return new User();
    }
}
