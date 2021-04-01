package ru.katering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.katering.dto.UserDTO;
import ru.katering.entity.User;
import ru.katering.service.UserService;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    @GetMapping("/all") /*  http://localhost:8080/api/user/all  */
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")/*  http://localhost:8080/api/user/2  */
    public UserDTO findAllUsers(@PathVariable Long id) {
        UserDTO userDTO = userService.findUserById(id);
        return userDTO;
    }

    @PostMapping(value = "/add")    /*  http://localhost:8080/api/user/add  */
    public User addNewUser(@RequestBody User user) {
        boolean isFound = userService.checkUserByLogin(user.getLogin());
        if (isFound) {
            user.setLogin(user.getLogin() + new Random().nextInt(10));
        }
        userService.addNewUser(user);
        return user;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUserById(@PathVariable Long id) {
        UserDTO userDTO = userService.findUserById(id);

        if (userDTO == null) {
            throw new NullPointerException("User with id: " + id + " doesn't exist in data base");
        } else {
            userService.deleteUserById(id);
        }
        return "User with id: " + id + " was deleted";
    }

    @GetMapping(value = "/swagger")
    public String swaggerUi() {
        return "redirect:/swagger-ui.html";
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
