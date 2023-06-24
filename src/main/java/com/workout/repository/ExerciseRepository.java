/*
Copyright 2023-present © Care.com, Inc. All rights reserved.
This software is the confidential and proprietary information of Care.com, Inc.
*/
package com.workout.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workout.model.Exercise;
import com.workout.model.ExerciseRecord;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

  List<ExerciseRecord> findExercisesByName(String name);

  List<ExerciseRecord> findExercises();
}
