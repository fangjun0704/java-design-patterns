package com.company.project.creation.singleton;

import java.util.Date;

/**
 * 饿汉模式
 */
public class Singleton {

  /**
   * 禁止在其它地方 new Singleton2()
   */
  private Singleton() {
  }

  // 创建私有【静态实例】，意味着这个类第一次使用的时候就会进行创建
  private static Singleton instance = new Singleton();

  public static Singleton getInstance() {
    return instance;
  }

  // 如果调用 Singleton.getDate()，这里会触发生成 Singleton 实例的
  public static Date getDate() {
    return new Date();
  }
}