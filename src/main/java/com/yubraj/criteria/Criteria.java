package com.yubraj.criteria;

public interface Criteria<T> {
  public boolean matches(T candidate);

  public default Criteria<T> and(Criteria<T> other){
    return new AndCriteria<T>(this, other);
  }

  public default Criteria<T> or(Criteria<T> other){
    return new OrCriteria<T>(this, other);
  }
}
