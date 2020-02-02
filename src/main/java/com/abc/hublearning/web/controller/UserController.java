package com.abc.hublearning.web.controller;

import com.abc.hublearning.persistence.service.UserService;
import com.abc.hublearning.web.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDto>> getActiveUsers(){
        //userService.getActiveUsers();
        return null;
    }

    @GetMapping("/aaa")
    public UserDto getUserByEmail( @RequestParam("email") String email){
        System.out.println("AM INRAT IN CONTROLLER");
            return userService.getUserByEmail(email);
    }


    @PostMapping
    public ResponseEntity<UserDto> save(@RequestBody UserDto userDto){
        return null;
    }

    @PutMapping("{/id}")
    public ResponseEntity<Object> updateStudent(@RequestBody UserDto userDto, @PathVariable long id) {
//        Optional<UserDto> userOptional = userService.getByid(id);
//        if (!userOptional.isPresent()) {
//            return ResponseEntity.notFound().build();
//        }
//        userDto.setId(id);
//        userService.save(userDto);
//        return ResponseEntity.ok().build();
        return null;
    }

    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestBody String email){
        //userService.deactivateUser(email);
        return null;
    }


}
