/*
Copyright 2023-present © Care.com, Inc. All rights reserved.
This software is the confidential and proprietary information of Care.com, Inc.
*/
package com.workout.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.workout.model.Workout;

@Repository
public interface WorkoutRepository extends CrudRepository<Workout, Long> {

  List<Workout> findByName(String name);
}
