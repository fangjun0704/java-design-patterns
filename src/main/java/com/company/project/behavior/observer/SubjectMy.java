package com.company.project.behavior.observer;

import com.company.project.interfaces.ObserverMy;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 主题需要持有观察者列表的引用，用于在数据变更的时候通知各个观察者
 */
public class SubjectMy {

  /**
   * 观察者们
   */
  private List<ObserverMy> observers = new ArrayList<>();
  /**
   * 状态
   */
  private int state;

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
    //主题有数据变更，通知观察者们
    notifyAllObservers();
  }

  // 添加观察者
  public void addObservers(ObserverMy observerMy) {
    observers.add(observerMy);
  }

  // 通知所有观察者们
  public void notifyAllObservers() {
    for (ObserverMy observerMy : observers) {
      observerMy.update();
    }
  }
}
