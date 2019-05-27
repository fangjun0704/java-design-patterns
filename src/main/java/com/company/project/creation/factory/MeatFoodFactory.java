package com.company.project.creation.factory;

import com.company.project.entity.FoodEnum;
import com.company.project.interfaces.Food;
import com.company.project.interfaces.FoodFactory;
import com.company.project.interfaces.impl.PorkFood;

public class MeatFoodFactory implements FoodFactory {

  @Override
  public Food makeFood(FoodEnum foodEnum) {
    return new PorkFood(foodEnum.getNameCH());
  }
}
