package com.company.project.structure.bridge;

import com.company.project.interfaces.impl.PorkFood;

public class Main {

  public static void main(String[] args) {
    Banana banana = new Banana(new PorkFood());
    banana.cook();
  }
}
