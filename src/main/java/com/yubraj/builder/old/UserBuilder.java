package com.yubraj.builder.old;

public class UserBuilder {
  private String salutation;
  private String firstName;
  private String middleName;
  private String lastName;
  private String suffix;
  private boolean isFemale;
  private boolean isEmployed;
  private boolean isHomewOwner;

  public UserBuilder setSalutation(String salutation) {
    this.salutation = salutation;
    return this;
  }

  public UserBuilder setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public UserBuilder setMiddleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  public UserBuilder setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public UserBuilder setSuffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  public UserBuilder setIsFemale(boolean isFemale) {
    this.isFemale = isFemale;
    return this;
  }

  public UserBuilder setIsEmployed(boolean isEmployed) {
    this.isEmployed = isEmployed;
    return this;
  }

  public UserBuilder setIsHomewOwner(boolean isHomewOwner) {
    this.isHomewOwner = isHomewOwner;
    return this;
  }

  public User createUser() {
    return new User(salutation, firstName, middleName, lastName, suffix, isFemale, isEmployed, isHomewOwner);
  }
}