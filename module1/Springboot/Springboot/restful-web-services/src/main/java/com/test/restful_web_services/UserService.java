

package com.test.restful_web_services;

import com.test.restful_web_services.User;
import com.test.restful_web_services.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class UserService {
    private final UserRepository userRepository;
   private final UserDaoService service;
    private final PostRepository postRepository;
    @Autowired
    public UserService(UserRepository userRepository, UserDaoService service, PostRepository postRepository) {
        this.userRepository = userRepository;
        this.service = service;
        this.postRepository = postRepository;
    }


    @GetMapping("/jpa/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();  // Call service method
    }


    public User createUser(User user) {
        return userRepository.save(user);
    }

    @GetMapping("/jpa/users/{id}")
    public EntityModel<User> retrieveUser(@PathVariable("id") int id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new UserNotFoundException("id :" + id);
        }
        return EntityModel.of(user.get());
    }


    @DeleteMapping("/jpa/users/{id}")
    public void deleteUser(@PathVariable("id") int id) {
        userRepository.deleteById(id);


    }
    @PostMapping("/jpa/users")
    public ResponseEntity<User> createdUser(@Valid @RequestBody User user) {
        // Save user using repository
        User savedUser = userRepository.save(user);


        return ResponseEntity.created(URI.create("/jpa/users/" + savedUser.getId())).body(savedUser);
    }

    @GetMapping("/check-connection")
    public String checkDatabaseConnection() {
        try {

            List<User> users = userRepository.findAll();
            System.out.println("-------------------------"+users);

            return "Connection is successful! Retrieved " + users.size() + " users.";
        } catch (Exception e) {
            return "Failed to connect to the database: " + e.getMessage();
        }

    }
    @GetMapping("/jpa/users/{id}/post")
    public List<Post> retrievePost(@PathVariable("id") int id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new UserNotFoundException("id :" + id);
        }
        return user.get().getPosts();



    }
    @PostMapping("/jpa/users/{id}/post")
    public ResponseEntity<Post> createPost(@PathVariable("id") int id,@Valid @RequestBody Post post) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new UserNotFoundException("id :" + id);
        }

        post.setUser(user.get());

        Post savedPost = postRepository.save(post);


        URI location = URI.create("/jpa/users/" + id + "/post/" + savedPost.getId());


        return ResponseEntity.created(location).body(savedPost);
    }
}

//}
