package com.company.project.behavior.strategy;

import com.company.project.interfaces.Food;

/**
 * 与 桥梁模式( AbstractFood ) 很类似
 */
public class StrategyFood {

  private Food food;

  public StrategyFood(Food food) {
    this.food = food;
  }

  public void nameOrType() {
    System.out.println(food.name());
    System.out.println(food.type());
  }

}
