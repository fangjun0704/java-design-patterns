结构型模式总结:

  1.代理模式（这样功能是方法的增强）
  2.适配器模式（接口Food、接口Food的实现PorkFood、适配类PortFoodAdaptor继承PorkFood）；  作用就是：适配某个接口中没有的方法
  3.桥梁模式（类Banana继承AbstractFood([封装了接口Food])）；  作用就是：将抽象与实现分离开来，使它们可以独立变化
  4.装饰器模式（抽象类AbsCondiment继承接口Tea、类Mango继承抽象类AbsCondiment([封装了接口Tea])）;  作用就是：动态的增加某个类的功能
