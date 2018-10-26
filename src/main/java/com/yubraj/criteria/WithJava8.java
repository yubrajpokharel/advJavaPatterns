package com.yubraj.criteria;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WithJava8 {
  public static void main(String[] args) {
    Predicate<Person> isMale = x -> x.getGender().equals("male");
    Predicate<Person> isFemale = x -> x.getGender().equals("female");
    Predicate<Person> isMarried = x -> x.getMaritalStatus().equals("married");
    Predicate<Person> ageFilter = x -> x.getAge() > 20 && x.getAge() < 25;

    List<Person> persons = Arrays.asList(
        new Person("john", "male", "married", 29)
        , new Person("jimmy", "male", "married", 26)
        , new Person("julia", "female", "unmarried", 32)
        , new Person("jimmy", "male", "unmarried", 30)
        , new Person("augusta", "female", "married", 24)
    );

    System.out.println("males only .............. ");
    System.out.println(persons.stream()
        .filter(isMale)
        .collect(Collectors.toList()));

    System.out.println("\nmales and are married .............. ");
    System.out.println(persons.stream()
        .filter(isMale.and(isMarried))
        .collect(Collectors.toList()));

    System.out.println("\nfemales only .............. ");
    System.out.println(persons.stream()
        .filter(isFemale)
        .collect(Collectors.toList()));

    System.out.println("\nMale or Female and married only .............. ");
    System.out.println(persons.stream()
        .filter(
                (isMale.or(isFemale))
                .and(isMarried)
        )
        .collect(Collectors.toList()));

    System.out.println("\nMale or Female and married  and age between 20 - 25 only .............. ");
    System.out.println(persons.stream()
        .filter((isMale.or(isFemale)).and(isMarried).and(ageFilter))
        .collect(Collectors.toList()));

  }
}
