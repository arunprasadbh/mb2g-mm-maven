package guru.springframework.controllers;

import guru.springframework.converters.UserMapper;
import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;

public class UserController {
    User SaveUser(UserCommand userCommand ){
        return  UserMapper.INSTANCE.userCommandToUser(userCommand);
    }
}
