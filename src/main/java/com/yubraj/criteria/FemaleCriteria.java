package com.yubraj.criteria;

public class FemaleCriteria implements Criteria<Person> {
  @Override
  public boolean matches(Person candidate) {
    return candidate.getGender().equals("female");
  }
}
