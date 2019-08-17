package study.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import study.jpa.model.Board;
import study.jpa.model.User;
import study.jpa.model.enums.BoardType;
import study.jpa.repository.BoardRepository;
import study.jpa.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;
    @Autowired
    BoardRepository boardRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = userRepository.save(User.builder()
        .name("halfdev")
        .password("1234")
        .email("test@gmail.com")
        .modDate(LocalDateTime.now())
        .regDate(LocalDateTime.now())
        .phone("test12345")
        .build());

        // rangeClosed : 범위를 정함
        IntStream.rangeClosed(1, 200).forEach(index ->
                boardRepository.save(Board.builder()
                .title("Content " + index)
                .subTitle("Order " + index)
                .content("content Example " + index)
                .boardType(BoardType.free)
                .regDate(LocalDateTime.now())
                .modDate(LocalDateTime.now())
                .user(user).build()));
    }
}
