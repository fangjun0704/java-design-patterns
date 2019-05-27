package com.company.project.entity;

import lombok.Getter;

@Getter
public enum FoodEnum {
  /**
   *
   */
  FRUIT("fruit", "水果"),
  MEAT("meat", "肉");

  String name;
  String nameCH;

  FoodEnum(String name, String nameEn) {
    this.name = name;
    this.nameCH = nameEn;
  }
}
