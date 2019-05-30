package com.company.project.structure.bridge;

import com.company.project.interfaces.Food;

/**
 * 抽象类
 */
public abstract class AbstractFood{

  private Food food;

  protected AbstractFood(Food food) {
    this.food = food;
  }

  /**
   * 抽象方法 提供给子类实现
   */
  public abstract void cook();

}
