package com.knoldus;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalPractice {

    private CollectorPractice collectorPractice;
    private Student[] students;
    public OptionalPractice(CollectorPractice collectorPractice,Student[] students){
        this.collectorPractice=collectorPractice;
        this.students=students;
    }

    Student get() {
        Optional<Student> student = collectorPractice.maxBy(students);
        if (student.isPresent())
            return student.get();
        return null;
    }

    void ifPresent() {
        Optional<Student> student = collectorPractice.maxBy(students);
        student.ifPresent(std -> System.out.println(std.getMarks()));
    }

    Student orElse() {
        Optional<Student> student = collectorPractice.maxBy(students);
        return student.orElse(null);
    }

    Student orElseGet() {
        Optional<Student> student = collectorPractice.maxBy(students);
        return student.orElseGet(null);
    }

    Student orElseThrow() {
        Optional<Student> student = collectorPractice.maxBy(students);
        return student.orElseThrow(NoSuchElementException::new);
    }
}

