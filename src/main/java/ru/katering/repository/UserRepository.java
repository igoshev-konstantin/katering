package ru.katering.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.katering.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
