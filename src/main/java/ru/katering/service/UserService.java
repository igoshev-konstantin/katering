package ru.katering.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.katering.dto.Convert;
import ru.katering.dto.UserDTO;
import ru.katering.entity.User;
import ru.katering.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private Convert convert;
    private UserRepository userRepository;

    /*get all users*/
    public List<UserDTO> getAllUsers() {
        List<User> userList = userRepository.findAll();
        List<UserDTO> userDTOList = convert.listUserToListUserDTO(userList);
        return userDTOList;
    }

    /*get user by id*/
    public UserDTO findUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        return convert.userToUserDTO(user);
    }

    /*add new user*/
    public void addNewUser(User user) {
        userRepository.save(user);
    }

    /*delete user by id*/
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    public boolean checkUserByLogin(String login){
        return userRepository.getUserByLogin(login)!=null;
    }

    @Autowired
    public void setConvert(Convert convert) {
        this.convert = convert;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
