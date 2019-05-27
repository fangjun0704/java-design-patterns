package com.company.project.creation.factory;

import com.company.project.entity.FoodEnum;
import com.company.project.interfaces.FoodFactory;

public class Main {

  public static void main(String[] args) {
    //简单工厂模式
    //    System.out.println(SimpleFactory.makeFood(FoodEnum.MEAT.getName()));

    //工厂模式
    FoodFactory foodFactory = new FruitFoodFactory();
    System.out.println(foodFactory.makeFood(FoodEnum.FRUIT));
  }
}
