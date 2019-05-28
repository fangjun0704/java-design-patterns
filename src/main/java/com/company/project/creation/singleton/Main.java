package com.company.project.creation.singleton;

public class Main {

  public static void main(String[] args) {
    System.out.println(Singleton.getInstance().hashCode());
    System.out.println(Singleton.getInstance().hashCode());
  }

}
