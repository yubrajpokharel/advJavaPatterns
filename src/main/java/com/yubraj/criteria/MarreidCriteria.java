package com.yubraj.criteria;

public class MarreidCriteria implements Criteria<Person> {
  @Override
  public boolean matches(Person candidate) {
    return candidate.getMaritalStatus().equals("married");
  }
}
