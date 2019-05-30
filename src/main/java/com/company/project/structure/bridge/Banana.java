package com.company.project.structure.bridge;

import com.company.project.interfaces.Food;

public class Banana extends AbstractFood {

  public Banana(Food food) {
    super(food);
  }

  /**
   * 抽象方法 提供给子类实现
   */
  @Override
  public void cook() {
    System.out.println("Banana:::cook()");
  }
}
