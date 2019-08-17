package study.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.jpa.model.Board;
import study.jpa.model.User;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}
