package com.company.project.structure.decorator;

import com.company.project.interfaces.Tea;

public class BlackTea extends Tea {

  /**
   * 茶名
   */
  @Override
  public String name() {
    return "BlackTea:::name()";
  }

  /**
   * 价钱
   */
  @Override
  public double price() {
    return 0.0;
  }
}
