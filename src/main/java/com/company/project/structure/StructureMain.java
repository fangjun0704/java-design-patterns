package com.company.project.structure;

import com.company.project.interfaces.Tea;
import com.company.project.interfaces.impl.AppleFood;
import com.company.project.interfaces.impl.PorkFood;
import com.company.project.structure.adapter.PortFoodAdaptor;
import com.company.project.structure.bridge.Banana;
import com.company.project.structure.decorator.GreenTea;
import com.company.project.structure.decorator.Mango;
import com.company.project.structure.proxy.FoodProxy;

public class StructureMain {

  public static void main(String[] args) {

    //代理模式
    FoodProxy proxy = new FoodProxy();
    proxy.name();

    //适配器模式
    AppleFood appleFood = new AppleFood();
    //这里将 AppleFood 适配成 PorkFood。方便调用PorkFood中特有的 pork()方法
    PorkFood adaptor = new PortFoodAdaptor(appleFood);
    adaptor.pork();

    //桥梁模式
    Banana banana = new Banana(new PorkFood());
    banana.cook();

    //装饰模式
    Tea tea = new GreenTea();
    Mango mango = new Mango(tea);
    System.out.println(mango.name());

  }

}
