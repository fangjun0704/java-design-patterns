package com.company.project.creation.factory;

import com.company.project.interfaces.PhoneCpu;
import com.company.project.interfaces.PhoneFactory;
import com.company.project.interfaces.PhoneSystem;
import com.company.project.interfaces.impl.AndroidCpu;
import com.company.project.interfaces.impl.AndroidSystem;

public class AndroidPhoneFactory implements PhoneFactory {

  /**
   * 生成安卓手机cpu
   */
  @Override
  public PhoneCpu makeCpu() {
    return new AndroidCpu("android cpu");
  }

  /**
   * 设置安卓手机系统
   */
  @Override
  public PhoneSystem makeSystem() {
    return new AndroidSystem("android system");
  }
}
