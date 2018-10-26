package com.yubraj.criteria;

public class Person {
  private String name;
  private String gender;
  private String maritalStatus;
  private int age;

  public Person(String name, String gender, String maritalStatus, int age) {
    this.name = name;
    this.gender = gender;
    this.maritalStatus = maritalStatus;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", gender='" + gender + '\'' +
        ", maritalStatus='" + maritalStatus + '\'' +
        ", age=" + age +
        '}';
  }
}
