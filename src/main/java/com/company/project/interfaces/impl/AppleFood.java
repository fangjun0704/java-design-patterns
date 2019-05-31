package com.company.project.interfaces.impl;

import com.company.project.interfaces.Food;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AppleFood implements Food {

  private String name;

  @Override
  public String name() {
    return "AppleFood:::name()";
  }

  @Override
  public String type() {
    return "AppleFood:::type()";
  }

  /**
   * 果食专有的方法
   */
  public String apple() {
    return "AppleFood专有的方法 ::: apple()";
  }

  @Override
  public String toString() {
    return "AppleFood{" +
        "name='" + name + '\'' +
        '}';
  }
}
