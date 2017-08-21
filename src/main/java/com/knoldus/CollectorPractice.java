package com.knoldus;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorPractice {

    double averagingDouble(Student... students) {
        Stream<Student> studentStream = Arrays.stream(students);
        return studentStream.collect(Collectors.averagingDouble(Student::getMarks));
    }

    double averagingLong(Student... students) {
        Stream<Student> studentStream = Arrays.stream(students);
        return studentStream.collect(Collectors.averagingLong(Student::getMarks));
    }

    Map<Integer, List<Student>> groupingBy(Student... students) {
        Stream<Student> studentStream = Arrays.stream(students);
        return studentStream.collect(Collectors.groupingBy(Student::getMarks));
    }

    String joining(Student... students) {
        Stream<Student> studentStream = Arrays.stream(students);
        return studentStream.map(Student::getName).collect(Collectors.joining(","));
    }

    Optional<Student> maxBy(Student... students) {
        Stream<Student> studentStream = Arrays.stream(students);
        return studentStream.collect(Collectors.maxBy(Comparator.comparing(Student::getMarks)));
    }

    Map<Boolean, List<Student>> partitioningBy(Student... students) {
        return Arrays.stream(students).collect(Collectors.partitioningBy(student -> student.getMarks() == 100));
    }

    int summingInt(Student... students) {
        Stream<Student> studentStream = Arrays.stream(students);
        return studentStream.collect(Collectors.summingInt(Student::getMarks));
    }

    List<Student> toList(Student... students) {
        Stream<Student> studentStream = Arrays.stream(students);
        return studentStream.collect(Collectors.toList());
    }

    ArrayList<Student> toCollection(Student... students) {
        Stream<Student> studentStream = Arrays.stream(students);
        return studentStream.collect(Collectors.toCollection(ArrayList::new));
    }

    Map<String,Integer> toMap(Student... students) {
        Stream<Student> studentStream = Arrays.stream(students);
        return studentStream.collect(Collectors.toMap(Student::getName,Student::getMarks));
    }


}
