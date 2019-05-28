package com.company.project.creation.factory;

import com.company.project.entity.FoodEnum;
import com.company.project.interfaces.Food;
import com.company.project.interfaces.impl.AppleFood;
import com.company.project.interfaces.impl.PorkFood;

/**
 * 这是简单工厂模式
 */
public class SimpleFactory {

  public static Food makeFood(FoodEnum foodEnum) {
    if (FoodEnum.FRUIT.getName().equals(foodEnum.getName())) {
      return new AppleFood(foodEnum.getNameCH());
    } else if (FoodEnum.MEAT.getName().equals(foodEnum.getName())) {
      return new PorkFood(foodEnum.getNameCH());
    } else {
      return null;
    }
  }
}
