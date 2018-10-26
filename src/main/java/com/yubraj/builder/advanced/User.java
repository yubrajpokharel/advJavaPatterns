package com.yubraj.builder.advanced;

public class User {
  private final String salutation;
  private final String firstName;
  private final String middleName;
  private final String lastName;
  private final String suffix;
  private final boolean isFemale;
  private final boolean isEmployed;
  private final boolean isHomewOwner;


  public User(String salutation, String firstName, String middleName, String lastName, String suffix, boolean isFemale, boolean isEmployed, boolean isHomewOwner) {
    this.salutation = salutation;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.suffix = suffix;
    this.isFemale = isFemale;
    this.isEmployed = isEmployed;
    this.isHomewOwner = isHomewOwner;
  }

  @Override
  public String toString() {
    return "User{" +
        "salutation='" + salutation + '\'' +
        ", firstName='" + firstName + '\'' +
        ", middleName='" + middleName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", suffix='" + suffix + '\'' +
        ", isFemale=" + isFemale +
        ", isEmployed=" + isEmployed +
        ", isHomewOwner=" + isHomewOwner +
        '}';
  }
}
