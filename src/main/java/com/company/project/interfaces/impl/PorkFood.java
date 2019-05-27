package com.company.project.interfaces.impl;

import com.company.project.interfaces.Food;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PorkFood extends Food {

  @Override
  public String name() {
    return "porkName";
  }

  @Override
  public String type() {
    return "porkType";
  }
}
