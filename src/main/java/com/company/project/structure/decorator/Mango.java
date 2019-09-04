package com.company.project.structure.decorator;

import com.company.project.interfaces.Tea;

public class Mango extends AbsCondiment {


  public Mango(Tea tea) {
    super(tea);
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
