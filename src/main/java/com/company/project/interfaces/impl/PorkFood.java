package com.company.project.interfaces.impl;

import com.company.project.interfaces.Food;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PorkFood implements Food {

  private String name;

  @Override
  public String name() {
    return "porkName";
  }

  @Override
  public String type() {
    return "porkType";
  }

  /**
   * 肉食专有的方法
   */
  public String pork() {
    return "PorkFood专有的方法 ::: pork()";
  }

  @Override
  public String toString() {
    return "PorkFood{" +
        "name='" + name + '\'' +
        '}';
  }
}
