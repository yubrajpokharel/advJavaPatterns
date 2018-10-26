package com.yubraj.builder.old;

public class Main {
  public static void main(String[] args) {

    User usre = new UserBuilder().setFirstName("yubraj").setLastName("pokharel").createUser();
    User user = new UserBuilder().setFirstName("sudhan").setLastName("pokharel").setIsEmployed(true).createUser();

    System.out.println(usre);
    System.out.println(user);

  }
}
