package com.company.project.creation.factory;

import com.company.project.entity.FoodEnum;
import com.company.project.interfaces.Food;
import com.company.project.interfaces.impl.AppleFood;
import com.company.project.interfaces.impl.PorkFood;

/**
 * 这是简单工厂模式
 */
public class SimpleFactory {

  public static Food makeFood(String foodType) {
    if (FoodEnum.FRUIT.getName().equals(foodType)) {
      Food fruitFood = new AppleFood("苹果");
      return fruitFood;
    } else if (FoodEnum.MEAT.getName().equals(foodType)) {
      Food meatFood = new PorkFood("猪肉");
      return meatFood;
    } else {
      return null;
    }
  }
}
