package ru.katering.dto;

import org.springframework.stereotype.Component;
import ru.katering.entity.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class Convert  {

    public UserDTO userToUserDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setLogin(user.getLogin());
        userDTO.setId(user.getId());
        return userDTO;
    }

    public List<UserDTO> listUserToListUserDTO(List<User> list){
        List<UserDTO> listUserDTO = new ArrayList<>();
        for (User user:
             list) {
            listUserDTO.add(userToUserDTO(user));
        }
        return listUserDTO;
    }
}
