package com.company.project.creation.factory;

import com.company.project.entity.FoodEnum;
import com.company.project.entity.Phone;
import com.company.project.interfaces.FoodFactory;
import com.company.project.interfaces.PhoneCpu;
import com.company.project.interfaces.PhoneFactory;
import com.company.project.interfaces.PhoneSystem;

public class Main {

  public static void main(String[] args) {
    //简单工厂模式
    System.out.println(SimpleFactory.makeFood(FoodEnum.FRUIT));

    //工厂模式
    FoodFactory foodFactory = new FruitFoodFactory();
    System.out.println(foodFactory.makeFood(FoodEnum.FRUIT));

    //抽象工厂模式
    PhoneFactory phoneFactory = new IosPhoneFactory();
    PhoneCpu phoneCpu = phoneFactory.makeCpu();
    PhoneSystem phoneSystem = phoneFactory.makeSystem();
    Phone phone = new Phone(phoneCpu, phoneSystem);
    System.out.println(phone);

    /**
     * 抽象工厂模式 与 工厂模式 的区别：
     *
     * 抽象工厂属于产品系列：意思就是我选择的是 ios工厂，那我生成出来的手机cpu、system就必须是ios的
     * 而不能是android的cpu或者system。不兼容
     *
     * 工厂模式就会出现这种不兼容的问题
     */

  }
}
