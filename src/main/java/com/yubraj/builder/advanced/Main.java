package com.yubraj.builder.advanced;

public class Main {
  public static void main(String[] args) {
    User user = new UserBuilder().with(userBuilder -> {
      userBuilder.firstName = "yubraj";
      userBuilder.lastName = "pokharel";
    }).createUser();

    User user1 = new UserBuilder().with(x -> {
      x.firstName = "sudhan";
      x.lastName = "pokharel";
    }).with( y -> {
      y.isEmployed = true;
      y.isFemale = false;
      y.isHomewOwner = true;
    }).createUser();

    System.out.println(user);
    System.out.println(user1);

  }

}
