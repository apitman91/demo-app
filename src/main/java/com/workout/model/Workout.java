/*
Copyright 2023-present © Care.com, Inc. All rights reserved.
This software is the confidential and proprietary information of Care.com, Inc.
*/
package com.workout.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Backend needed to:
 * 1. sync data between devices
 * 2. handle user login
 * 3. good place to figure out sso
 */
@Entity
@Getter @Setter @NoArgsConstructor
public class Workout {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String description;
  private List<Exercise> exercises;
}
