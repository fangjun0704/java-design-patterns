package com.company.project.behavior.observer;

import com.company.project.interfaces.ObserverMy;

public class AObserver extends ObserverMy {

  public AObserver(SubjectMy subjectMy) {
    this.subjectMy = subjectMy;
    //将A观察者加入列表
    this.subjectMy.addObservers(this);
  }

  /**
   * 更新状态
   */
  @Override
  public void update() {
    System.out.println("AObserver:::update(" + subjectMy.getState() + ")");
  }
}
