package study.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import study.jpa.model.User;
import study.jpa.repository.UserRepository;

import java.util.List;
import java.util.Map;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

//    @Autowired
//    public UserController(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
    @PostMapping("/")
    public @ResponseBody
    List<User> createUser(@RequestBody Map<String,String> paramMap) {
        String name = paramMap.get("name");
        String phone = paramMap.get("phone");
        User user = User.builder().name(name).phone(phone).build();
        userRepository.save(user);

        return userRepository.findAll();
    }
}
