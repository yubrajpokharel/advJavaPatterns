package com.yubraj.criteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<Person> persons = Arrays.asList(
          new Person("john", "male", "married", 29)
        , new Person("jimmy", "male", "married", 26)
        , new Person("julia", "female", "unmarried", 32)
        , new Person("jimmy", "male", "unmarried", 30)
        , new Person("augusta", "female", "married", 24)
    );

    System.out.println("males only .............. ");
    System.out.println(persons.stream()
        .filter(x -> new MaleCriteria().matches(x))
        .collect(Collectors.toList()));

    System.out.println("\nmales and are married .............. ");
    System.out.println(persons.stream()
        .filter(x -> new MaleCriteria().and(new MarreidCriteria()).matches(x))
        .collect(Collectors.toList()));

    System.out.println("\nfemales only .............. ");
    System.out.println(persons.stream()
        .filter(x -> new FemaleCriteria().matches(x))
        .collect(Collectors.toList()));

    System.out.println("\nMale or Female and married only .............. ");
    System.out.println(persons.stream()
        .filter(x -> (
            (new MaleCriteria().or(new FemaleCriteria()))
            .and(new MarreidCriteria()).matches(x)))
        .collect(Collectors.toList()));

    System.out.println("\nMale or Female and married  and age between 20 - 25 only .............. ");
    System.out.println(persons.stream()
        .filter(x -> (
            (new MaleCriteria().or(new FemaleCriteria()))
                .and(new MarreidCriteria())
                .and(new AgeCriteria()).matches(x)))
        .collect(Collectors.toList()));
  }
}
