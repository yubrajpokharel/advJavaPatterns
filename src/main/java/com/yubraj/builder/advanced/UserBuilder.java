package com.yubraj.builder.advanced;

import java.util.function.Consumer;

public class UserBuilder {
  public String salutation;
  public String firstName;
  public String middleName;
  public String lastName;
  public String suffix;
  public boolean isFemale;
  public boolean isEmployed;
  public boolean isHomewOwner;

  public UserBuilder with(Consumer<UserBuilder> builderFunction){
    builderFunction.accept(this);
    return this;
  }

  public User createUser() {
    return new User(salutation, firstName, middleName, lastName, suffix, isFemale, isEmployed, isHomewOwner);
  }

}