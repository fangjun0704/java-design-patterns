package com.company.project.behavior;

import com.company.project.interfaces.impl.PorkFood;

public class Main {

  public static void main(String[] args) {
    StrategyFood strategyFood = new StrategyFood(new PorkFood());
    strategyFood.nameOrType();
  }
}
