package com.yubraj.criteria;

public class OrCriteria<T> implements Criteria<T> {
  private Criteria<T> left;
  private Criteria<T> right;

  public OrCriteria(Criteria<T> left, Criteria<T> right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public boolean matches(T candidate) {
    return left.matches(candidate) || right.matches(candidate);
  }
}
