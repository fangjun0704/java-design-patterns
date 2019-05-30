package com.company.project.structure.decorator;

import com.company.project.interfaces.Tea;

public class Main {

  public static void main(String[] args) {
    Tea tea = new GreenTea();
    Mango mango = new Mango(tea);
    System.out.println(mango.name());
  }
}
