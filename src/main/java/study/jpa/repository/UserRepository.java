package study.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.jpa.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
