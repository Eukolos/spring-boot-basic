package com.arcadeserver.restApi.controllers;


import com.arcadeserver.restApi.dto.UserDTO;
import com.arcadeserver.restApi.entitites.User;
import com.arcadeserver.restApi.service.UserService;
import com.arcadeserver.restApi.util.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public List<UserDTO> getAllUsers() {
        return ObjectMapperUtils.mapAll(userService.findAll(), UserDTO.class);
    }
    @GetMapping(value = "/byEmail/{email}")
    public UserDTO getUserByEmail(@PathVariable("email") String email) {
        return ObjectMapperUtils.map(userService.findByEmail(email), UserDTO.class);
    }


    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateUser(@RequestBody UserDTO userDTO) {
        userService.saveOrUpdateUser(ObjectMapperUtils.map(userDTO, User.class));
        return new ResponseEntity("User added successfully", HttpStatus.OK);
    }


}



















//
//    @GetMapping
//    public List<User> getAllUsers(){
//        return userRepository.findAll();
//    }
//
//    @PostMapping
//    public User createUser(@RequestBody User newUser) {
//        return userRepository.save(newUser);
//    }
//
//    @GetMapping("/{userId}")
//    public User getOneUser(@PathVariable Long userId) {
//        //custom exception
//        return userRepository.findById(userId).orElse(null);
//    }
//
//    @PutMapping("/{userId}")
//    public User updateOneUser(@PathVariable Long userId, @RequestBody User newUser) {
//        Optional<User> user = userRepository.findById(userId);
//        if(user.isPresent()){
//            User foundUser = user.get();
//            foundUser.setUserName(newUser.getUserName());
//            foundUser.setPassword(newUser.getPassword());
//            foundUser.setEmail(newUser.getEmail());
//            userRepository.save(foundUser);
//            return  foundUser;
//        } else
//            return null;
//    }
//
//    @DeleteMapping("/{userId}")
//    public void deleteOneUser(@PathVariable Long userId) {
//        userRepository.deleteById(userId);
//    }
