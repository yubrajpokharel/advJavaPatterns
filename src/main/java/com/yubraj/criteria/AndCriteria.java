package com.yubraj.criteria;

public class AndCriteria<T> implements Criteria<T> {
  private Criteria<T> left;
  private Criteria<T> right;

  public AndCriteria(Criteria<T> left, Criteria<T> right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public boolean matches(T candidate) {
    return left.matches(candidate) && right.matches(candidate);
  }
}
