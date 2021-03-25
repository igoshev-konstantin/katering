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

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public UserDTO findUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        return convert.userToUserDTO(user);
    }

    @Autowired
    public void setConvert(Convert convert) {
        this.convert = convert;
    }

}
