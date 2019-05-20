package com.company.project.creation.factory;

import com.company.project.interfaces.Food;
import com.company.project.interfaces.impl.FruitFood;
import com.company.project.interfaces.impl.MeatFood;

/**
 * 这是简单工厂模式
 */
public class SimpleFactory {

  private static Food makeFood(String foodType) {
    if ("fruit".equals(foodType)) {
      Food fruitFood = new FruitFood();
      return fruitFood;
    } else if ("meat".equals(foodType)) {
      Food meatFood = new MeatFood();
      return meatFood;
    } else {
      return null;
    }
  }

  public static void main(String[] args) {
    System.out.println(SimpleFactory.makeFood("meat"));
  }


}
