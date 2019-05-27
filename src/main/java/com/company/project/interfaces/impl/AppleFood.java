package com.company.project.interfaces.impl;

import com.company.project.interfaces.Food;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class AppleFood extends Food {

  @Override
  public String name() {
    return "appleName";
  }

  @Override
  public String type() {
    return "appleType";
  }
}
