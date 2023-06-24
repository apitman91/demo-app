/*
Copyright 2023-present © Care.com, Inc. All rights reserved.
This software is the confidential and proprietary information of Care.com, Inc.
*/
package com.workout.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.workout.model.Workout;
import com.workout.service.WorkoutService;

@RestController
public class WorkoutController {

  private WorkoutService workoutService;

  public WorkoutController(WorkoutService workoutService) {
    this.workoutService = workoutService;
  }

  @PostMapping("/workout")
  public ResponseEntity<Void> createWorkout(@RequestBody Workout workout) {
    workoutService.createWorkout(workout);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
