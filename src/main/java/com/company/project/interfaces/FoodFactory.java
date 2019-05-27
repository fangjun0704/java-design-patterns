package com.company.project.interfaces;

import com.company.project.entity.FoodEnum;

public interface FoodFactory {

  Food makeFood(FoodEnum foodEnum);

}
