package com.company.project.creation.builder;

public class Main {

  public static void main(String[] args) {
    User user = User.builder().name("name").age(2).build();
    System.out.println(user);
  }

}
