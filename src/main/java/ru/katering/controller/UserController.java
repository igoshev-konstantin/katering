package ru.katering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.katering.dto.UserDTO;
import ru.katering.entity.User;
import ru.katering.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> findAllUsers(){
        List<User> list = userService.findAllUsers();
        return list;
    }

    @GetMapping("/{id}")
    public UserDTO findAllUsers(@PathVariable Long id){
        UserDTO userDTO = userService.findUserById(id);
        return userDTO;
    }
}
