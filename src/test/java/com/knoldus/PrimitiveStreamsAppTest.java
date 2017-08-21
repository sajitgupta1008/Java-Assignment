package com.knoldus;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

import static org.junit.Assert.*;

public class PrimitiveStreamsAppTest {
    private Student student1 = new Student("sajit", 100);
    private Student student2 = new Student("ajay", 99);
    private Student student3 = new Student("amit", 100);
    private Student[] students = {student1, student2, student3};
    private PrimitiveStreamsApp object = new PrimitiveStreamsApp();

    @Test
    public void mapToInt() throws Exception {
        assertEquals(OptionalDouble.of(99.66666666666667), object.mapToInt(students));
    }

    @Test
    public void mapToObj() throws Exception {
        assertEquals(new ArrayList<Student>(Arrays.asList(student1, student2, student3)), object.mapToObj(new int[]{student1.getMarks(), student2.getMarks(),
                student3.getMarks()}));
    }

    @Test
    public void mapToDouble() throws Exception {
        assertEquals(OptionalDouble.of(99.66666666666667), object.mapToDouble(students));
    }

    @Test
    public void iterate() throws Exception {
        int limit = 4;
        assertEquals(Arrays.asList(1, 2, 4, 8), object.iterate(limit));
    }


}