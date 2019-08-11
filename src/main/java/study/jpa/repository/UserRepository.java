package study.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.jpa.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByName(String name);
    List<User> findByPhone(String phone);
    // LIKE search
    List<User> findByNameLike(String keyword);
}
