package com.company.project.creation.builder;

/**
 * 建造者模式：也可以使用lombok中的 @Builder 直接实现
 */
public class User {

  private String name;
  private int age;

  /**
   * 禁止外部通过 new User的方式创建实例
   * @param name
   * @param age
   */
  private User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public static UserBuilder builder() {
    return new UserBuilder();
  }

  public static class UserBuilder {

    private String name;
    private int age;

    private UserBuilder() {
    }

    public UserBuilder name(String name) {
      this.name = name;
      return this;
    }

    public UserBuilder age(int age) {
      this.age = age;
      return this;
    }

    public User build() {
      return new User(name, age);
    }
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

}
