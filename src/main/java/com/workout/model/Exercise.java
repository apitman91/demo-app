/*
Copyright 2023-present © Care.com, Inc. All rights reserved.
This software is the confidential and proprietary information of Care.com, Inc.
*/
package com.workout.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Exercise {

  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private String description;
}
