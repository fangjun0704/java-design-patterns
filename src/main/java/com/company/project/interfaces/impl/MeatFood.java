package com.company.project.interfaces.impl;

import com.company.project.interfaces.Food;

public class MeatFood implements Food {

  @Override
  public String name() {
    return "meat name";
  }

  @Override
  public String type() {
    return "meat type";
  }
}
