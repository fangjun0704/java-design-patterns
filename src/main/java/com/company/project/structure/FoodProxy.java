package com.company.project.structure;

import com.company.project.interfaces.Food;
import com.company.project.interfaces.impl.PorkFood;

/**
 * 这是一个代理 Food真实类 的代理类
 */
public class FoodProxy extends Food {

  private Food food;

  public FoodProxy() {
    //这里可以选择被代理的真实类
    food = new PorkFood();
  }

  @Override
  public String name() {
    String name = food.name();
    System.out.println(name);

    //这里可以更改 被代理类的逻辑（这一个功能类似spring中的aop功能）
    name = "change name:::FoodProxy name";
    System.out.println(name);
    return name;
  }

  @Override
  public String type() {
    return "FoodProxy type";
  }
}
