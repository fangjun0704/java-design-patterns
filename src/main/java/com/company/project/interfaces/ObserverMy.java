package com.company.project.interfaces;

import com.company.project.behavior.observer.SubjectMy;

/**
 * 这是一个 观察者
 */
public abstract class ObserverMy {

  /**
   * 主题
   */
  protected SubjectMy subjectMy;

  /**
   * 更新状态
   */
  public abstract void update();
}