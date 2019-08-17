//package study.jpa;
//
//import org.junit.After;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import study.jpa.model.User;
//import study.jpa.repository.UserRepository;
//import static org.junit.Assert.assertThat;
//import static org.hamcrest.CoreMatchers.is;
//
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class JpaStudyApplicationTests {
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Test
//    public void testUserRepository() {
//        User user = User.builder().name("tester").phone("010-4567-4567").build();
//        userRepository.save(user);
//
//        List<User> userList = userRepository.findAll();
//
//        User tester = userList.get(0); // index를 통한 조회 get()
//        assertThat(tester.getName(), is("tester"));
//        assertThat(tester.getPhone(), is("010-4567-4567"));
//    }
//
//    @After
//    public void deleteAll(){
//        userRepository.deleteAll();
//    }
//}
