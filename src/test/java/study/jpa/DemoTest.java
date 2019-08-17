package study.jpa;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import study.jpa.model.User;
import study.jpa.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DemoTest {

    @Autowired
    MockMvc mock;
    @Autowired
    UserRepository userRepository;

    @Test
    @Ignore
    public void contextLoads() throws Exception {
        mock.perform(get("/list"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("halfdev")));
    }

    @Test
    @Ignore
    public void findToerror() {
        User user = User.builder()
                .name("halfdev")
                .phone("1234")
                .email("test@gmail.com")
                .regDate(LocalDateTime.now())
                .modDate(LocalDateTime.now())
                .password("passwordis1234")
                .build();
        userRepository.save(user);

        List<User> list = userRepository.findAll();

        User tester = list.get(0);
        assertThat(tester.getName(), is("halfdev"));
        assertThat(tester.getEmail(), is("test@gmail.com"));
        assertThat(tester.getRegDate(), is(LocalDateTime.now()));
    }

    @Test
    public void findAll() {
        List<User> list = userRepository.findAll();
        User test = list.get(0);
        assertThat(test.getName(), is("halfdev"));
        assertThat(test.getEmail(), is("test@gmail.com"));
    }
}
