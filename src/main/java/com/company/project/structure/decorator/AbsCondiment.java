package com.company.project.structure.decorator;

import com.company.project.interfaces.Tea;

/**
 * 这是一个 抽象类
 */
public abstract class AbsCondiment implements Tea {

  //需要装饰的对象
  protected Tea tea;

  public AbsCondiment(Tea tea) {
    this.tea = tea;
  }

}
