package com.knoldus;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

 class StreamPractice {

    Boolean allMatch(int length) {
        Stream<String> stream = Stream.of("sajit", "gupta", "lko", "45565", "I am Groot");
        return stream.allMatch(text -> text.length() == length);
    }

    Boolean anyMatch(int length) {
        Stream<String> stream = Stream.of("sajit", "gupta", "lko", "45565", "I am Groot");
        return stream.anyMatch(text -> text.length() == length);
    }

    Boolean noneMatch(int length) {
        Stream<String> stream = Stream.of("sajit", "gupta", "lko", "45565", "I am Groot");
        return stream.noneMatch(text -> text.length() == length);
    }

    String collect(String... array) {
        Stream<String> stream = Arrays.stream(array);
        return stream.collect(Collectors.joining(","));
    }

    long count(String... array) {
        Stream<String> stream = Arrays.stream(array);
        return stream.count();
    }

    Optional<String> findAny(String... array) {
        Stream<String> stream = Arrays.stream(array);
        return stream.findAny();
    }

    Optional<String> findFirst(String... array) {
        Stream<String> stream = Arrays.stream(array);
        return stream.findFirst();
    }

    void forEach(String... array) {
        Stream<String> stream = Arrays.stream(array);
        stream.map(name -> "Mr. " + name).forEach(System.out::println);
    }

    Optional<String> min(String... array) {
        Stream<String> stream = Arrays.stream(array);
        return stream.min(Comparator.comparing(String::length));
    }

    Optional<String> max(String... array) {
        Stream<String> stream = Arrays.stream(array);
        return stream.max(Comparator.comparing(String::length));
    }

    List<String> filter(String... array) {
        Stream<String> stream = Arrays.stream(array);
        return stream.filter(text -> text.length() > 5).collect(Collectors.toList());
    }

    Set<String> distinct(String... array) {
        Stream<String> stream = Arrays.stream(array);
        return stream.distinct().collect(Collectors.toSet());
    }

    List<Integer> limit(int limit) {
        Stream<Integer> stream = Stream.iterate(1, num -> num * 2);
       return stream.limit(limit).collect(Collectors.toList());
    }

    List<Integer> map(int... array) {
        IntStream stream = Arrays.stream(array);
        return stream.map(num->num+1).boxed().collect(Collectors.toList());
    }

    List<Integer> flatMap(int... array) {
        IntStream stream = Arrays.stream(array);
        return stream.flatMap(num->IntStream.of(num+1)).boxed().collect(Collectors.toList());
    }

    List<Integer> sorted(int... array) {
        IntStream stream = Arrays.stream(array);
        return stream.sorted().boxed().collect(Collectors.toList());
    }

}

