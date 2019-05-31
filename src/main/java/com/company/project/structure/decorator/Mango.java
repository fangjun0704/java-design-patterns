package com.company.project.structure.decorator;

import com.company.project.interfaces.Tea;

public class Mango extends Condiment {


  private Tea tea;

  public Mango(Tea tea) {
    this.tea = tea;
  }

  /**
   * 茶名
   */
  @Override
  public String name() {
    return "Mango:::name() + " + tea.name();
  }

  /**
   * 价钱
   */
  @Override
  public double price() {
    return 0.0 + tea.price();
  }
}
