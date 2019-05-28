package com.company.project.creation.singleton;

/**
 * 饱汉模式
 */
public class Singleton2 {

  private Singleton2() {
  }

  // 和饿汉模式相比，这边不需要先实例化出来，注意 volatile，它是必须的
  private static volatile Singleton2 instance = null;

  public static Singleton2 getInstance() {
    if (instance == null) {
      // 加锁
      synchronized (Singleton2.class) {
        // 这一次判断也是必须的，不然会有并发问题
        if (instance == null) {
          instance = new Singleton2();
        }
      }
    }
    return instance;
  }
}