package com.company.project.structure.bridge;

import com.company.project.interfaces.Food;

/**
 * 桥梁模式：声明一个接口 Food
 */
public class FoodImple implements Food {

  @Override
  public String name() {
    return "Food:::name()";
  }

  @Override
  public String type() {
    return "Food:::type()";
  }
}
