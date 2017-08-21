package com.knoldus;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class PrimitiveStreamsApp {

    OptionalDouble mapToInt(Student... students) {
        Stream<Student> studentStream = Arrays.stream(students);
        IntStream marksStream = studentStream.mapToInt(Student::getMarks);
        return marksStream.average();
    }

    List<Student> mapToObj(int[] marks) {
        IntStream marksStream = Arrays.stream(marks);
        String name = "sajit";
        return marksStream.mapToObj(mark->new Student(name,mark)).collect(Collectors.toList());
    }

    OptionalDouble mapToDouble(Student... students) {
        Stream<Student> studentStream = Arrays.stream(students);
        DoubleStream marksStream = studentStream.mapToDouble(Student::getMarks);
        return marksStream.average();
    }

    List<Integer> iterate(int limit) {
        return IntStream.iterate(1, num -> num * 2).limit(limit).boxed().collect(Collectors.toList());
    }



}
