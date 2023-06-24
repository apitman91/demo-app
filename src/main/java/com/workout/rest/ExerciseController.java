/*
Copyright 2023-present © Care.com, Inc. All rights reserved.
This software is the confidential and proprietary information of Care.com, Inc.
*/
package com.workout.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workout.model.Exercise;
import com.workout.model.ExerciseRecord;
import com.workout.service.ExerciseService;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

  private ExerciseService exerciseService;

  public ExerciseController(ExerciseService exerciseService) {
    this.exerciseService = exerciseService;
  }

  @PostMapping
  public ResponseEntity<Void> createExercise(@RequestBody Exercise exercise) {
    exerciseService.createExercise(exercise);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @GetMapping
  public ResponseEntity<List<ExerciseRecord>> getAllExercises() {
    List<ExerciseRecord> exercises = exerciseService.getAllExercises();
    return new ResponseEntity<>(exercises, HttpStatus.OK);
  }
}
