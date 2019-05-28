package com.company.project.structure.adapter;

import com.company.project.interfaces.impl.AppleFood;
import com.company.project.interfaces.impl.PorkFood;

/**
 * 这个类是适配 PorkFood。目的是使得 AppleFood 中也可以调用 PorkFood 类中的特有的pork()方法
 * (实际上内部还是 AppleFood 调用自己特有的方法 apple())
 */
public class PortFoodAdaptor extends PorkFood {

  private AppleFood appleFood;

  public  PortFoodAdaptor(AppleFood appleFood){
    this.appleFood = appleFood;
  }

  /**
   * 肉食专有的方法
   */
  @Override
  public String pork() {
    System.out.println(appleFood.apple());
    return "PortFoodAdaptor ::: pork";
  }

}
