package ru.katering.dto;

import org.springframework.stereotype.Component;
import ru.katering.entity.User;

@Component
public abstract class Convert  {

    public UserDTO userToUserDTO(User user){

        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setLogin(user.getLogin());

        return userDTO;
    }
}
