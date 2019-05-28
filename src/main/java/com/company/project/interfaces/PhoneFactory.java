package com.company.project.interfaces;

/**
 * 这是一个手机工厂
 */
public interface PhoneFactory {

  /**
   * 生成指定类型手机cpu
   */
  PhoneCpu makeCpu();

  /**
   * 设置手机系统
   */
  PhoneSystem makeSystem();
}
