package com.company.project.interfaces.impl;

import com.company.project.interfaces.Food;

public class FruitFood implements Food {

  @Override
  public String name() {
    return "fruid name";
  }

  @Override
  public String type() {
    return "fruid type";
  }
}
