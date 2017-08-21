package com.knoldus;

import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Optional;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class OptionalPracticeTest {

    private static Student student;
    private static OptionalPractice object;

    @BeforeClass
    public static void setUp() {

        student = new Student("sajit", 100);
        Student student1 = mock(Student.class);
        Student student2 = mock(Student.class);
        Student[] students = {student1, student2};

        CollectorPractice collectorPractice = mock(CollectorPractice.class);
        when(collectorPractice.maxBy(students)).thenReturn(Optional.of(student));
        object = new OptionalPractice(collectorPractice, students);
    }

    @Test
    public void get() throws Exception {
        assertEquals(student, object.get());
    }

    @Test
    public void orElse() throws Exception {
        assertEquals(student, object.orElse());
    }

    @Test
    public void orElseGet() throws Exception {
        assertEquals(student, object.orElseGet());
    }

    @Test
    public void orElseThrow() throws Exception {
        assertEquals(student, object.orElseThrow());
    }

}