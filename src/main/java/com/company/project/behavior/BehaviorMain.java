package com.company.project.behavior;

import com.company.project.behavior.observer.AObserver;
import com.company.project.behavior.observer.BObserver;
import com.company.project.behavior.observer.SubjectMy;
import com.company.project.behavior.strategy.StrategyFood;
import com.company.project.interfaces.impl.PorkFood;

public class BehaviorMain {

  public static void main(String[] args) {
    //策略模式
    StrategyFood strategyFood = new StrategyFood(new PorkFood());
    strategyFood.nameOrType();

    //观察者模式
    //先定义一个主题
    SubjectMy subject = new SubjectMy();
    //定义两个观察者
    AObserver aObserver = new AObserver(subject);
    BObserver bObserver = new BObserver(subject);

    //更新状态(会立即通知所有的观察者们)
    subject.setState(5);
  }
}
