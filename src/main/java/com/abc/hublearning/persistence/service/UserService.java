package com.abc.hublearning.persistence.service;

import com.abc.hublearning.web.dto.UserDto;
import com.abc.hublearning.web.exception_classes.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    public UserDto getUserByEmail(String email) {
        System.out.println("AM intrat in getUserByEmail din " + this.getClass().getSimpleName());
        UserDto userDto = null;
        if(userDto == null){
            System.out.println("TREBUIE SA ARUNCE O EXCEPTIE");
            throw new ResourceNotFoundException("resource doesn't exist", 404L);
        }else{
            return userDto;
        }

    }
}