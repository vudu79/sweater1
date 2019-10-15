package ru.sweater.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sweater.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
        User findByUsername(String username);

        User findByActivationCode(String code);
}