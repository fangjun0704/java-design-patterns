package com.company.project.creation.factory;

import com.company.project.interfaces.PhoneCpu;
import com.company.project.interfaces.PhoneFactory;
import com.company.project.interfaces.PhoneSystem;
import com.company.project.interfaces.impl.IosCpu;
import com.company.project.interfaces.impl.IosSystem;

public class IosPhoneFactory implements PhoneFactory {

  /**
   * 生成苹果手机cpu
   */
  @Override
  public PhoneCpu makeCpu() {
    return new IosCpu("ios cpu");
  }

  /**
   * 设置苹果手机系统
   */
  @Override
  public PhoneSystem makeSystem() {
    return new IosSystem("ios system");
  }
}
