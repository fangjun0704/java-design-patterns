package com.company.project.behavior.observer;

import com.company.project.interfaces.ObserverMy;

public class BObserver extends ObserverMy {

  public BObserver(SubjectMy subjectMy) {
    this.subjectMy = subjectMy;
    //将B观察者加入列表
    this.subjectMy.addObservers(this);
  }

  /**
   * 更新状态
   */
  @Override
  public void update() {
    System.out.println("BObserver:::update(" + subjectMy.getState() + ")");
  }
}
