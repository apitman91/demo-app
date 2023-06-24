/*
Copyright 2023-present © Care.com, Inc. All rights reserved.
This software is the confidential and proprietary information of Care.com, Inc.
*/
package com.workout.service;

import org.springframework.stereotype.Service;

import com.workout.model.Workout;
import com.workout.repository.WorkoutRepository;

@Service
public class WorkoutService {

  private WorkoutRepository workoutRepository;

  public WorkoutService(WorkoutRepository workoutRepository) {
    this.workoutRepository = workoutRepository;
  }

  public void createWorkout(Workout workout) {
    workoutRepository.save(workout);
  }
}
