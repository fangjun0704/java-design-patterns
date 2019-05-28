package com.company.project.interfaces.impl;

import com.company.project.interfaces.Food;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PorkFood extends Food {

  private String name;

  @Override
  public String name() {
    return "porkName";
  }

  @Override
  public String type() {
    return "porkType";
  }

  @Override
  public String toString() {
    return "PorkFood{" +
        "name='" + name + '\'' +
        '}';
  }
}
