package com.company.project.structure.decorator;

import com.company.project.interfaces.Tea;

public class GreenTea implements Tea {

  /**
   * 茶名
   */
  @Override
  public String name() {
    return "GreenTea:::name()";
  }

  /**
   * 价钱
   */
  @Override
  public double price() {
    return 0.0;
  }
}
