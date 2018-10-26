package com.yubraj.criteria;

public class MaleCriteria implements Criteria<Person> {
  @Override
  public boolean matches(Person candidate) {
    return candidate.getGender().equals("male");
  }
}
