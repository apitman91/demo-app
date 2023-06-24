/*
Copyright 2023-present © Care.com, Inc. All rights reserved.
This software is the confidential and proprietary information of Care.com, Inc.
*/
package com.workout.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.workout.model.Exercise;
import com.workout.model.ExerciseRecord;
import com.workout.repository.ExerciseRepository;

@Service
public class ExerciseService {

  private static final Logger LOGGER = LoggerFactory.getLogger(ExerciseService.class);

  private ExerciseRepository exerciseRepository;

  public ExerciseService(ExerciseRepository exerciseRepository) {
    LOGGER.info("SERVICE CREATED ******");
    this.exerciseRepository = exerciseRepository;
  }

  public void createExercise(Exercise exercise) {
    LOGGER.info("Creating exercise: {}", exercise.getName());
    exerciseRepository.save(exercise);
  }

  public List<ExerciseRecord> getAllExercises() {
    return exerciseRepository.findExercises();
  }
}
