package com.company.project.structure.bridge;

import com.company.project.interfaces.Food;

public class Main {

  public static void main(String[] args) {
    Banana banana = new Banana(new FoodImple());
    banana.cook();
  }
}
