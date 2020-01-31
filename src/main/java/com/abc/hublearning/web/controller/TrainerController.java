package com.abc.hublearning.web.controller;

import com.abc.hublearning.web.dto.TrainerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController("/trainers")
public class TrainerController {

    @GetMapping
    public ResponseEntity<List<TrainerDto>> getTrainers(){
        return null;
    }

    @GetMapping("{/id}")
    public ResponseEntity<TrainerDto> getTrainerById(@PathVariable long id){
        return null;
    }

    @PostMapping
    public ResponseEntity<TrainerDto> createTrainer(@RequestBody TrainerDto traienrDto){
        return null;
    }

    @PutMapping("{/id}")
    public ResponseEntity<Object> updateTrainer(@RequestBody TrainerDto trainerDto, @PathVariable Long id){
        return null;
    }



}
