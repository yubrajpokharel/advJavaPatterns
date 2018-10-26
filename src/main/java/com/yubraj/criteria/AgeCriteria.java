package com.yubraj.criteria;

public class AgeCriteria implements Criteria<Person> {
  @Override
  public boolean matches(Person candidate) {
    return candidate.getAge() > 20 && candidate.getAge() < 25;
  }
}
