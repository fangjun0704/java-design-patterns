package com.company.project.creation.factory;

import com.company.project.entity.FoodEnum;
import com.company.project.interfaces.Food;
import com.company.project.interfaces.FoodFactory;
import com.company.project.interfaces.impl.AppleFood;

public class FruitFoodFactory implements FoodFactory {

  @Override
  public Food makeFood(FoodEnum foodEnum) {
    return new AppleFood(foodEnum.getNameCH());
  }
}
