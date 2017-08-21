package com.knoldus;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class CollectorPracticeTest {

    private Student student1 = new Student("sajit", 100);
    private Student student2 = new Student("ajay", 99);
    private Student student3 = new Student("amit", 100);
    private Student[] students = {student1, student2, student3};
    private CollectorPractice object = new CollectorPractice();

    @Test
    public void averagingDouble() throws Exception {
        assertEquals(99.66666,object.averagingDouble(students),0.001);
    }

    @Test
    public void averagingLong() throws Exception {
        assertEquals(99.66666,object.averagingLong(students),0.001);
    }

    @Test
    public void groupingBy() throws Exception {
        Map<Integer,List<Student>> expectedMap = new HashMap<>();
        expectedMap.put(student2.getMarks(), Collections.singletonList(student2));
        expectedMap.put(student3.getMarks(),Arrays.asList(student1,student3));
        assertEquals(expectedMap,object.groupingBy(students));
    }

    @Test
    public void joining() throws Exception {
        assertEquals("sajit,ajay,amit",object.joining(students));
    }

    @Test
    public void maxBy() throws Exception {
    assertEquals(Optional.of(student1), object.maxBy(students));
    }

    @Test
    public void partitioningBy() throws Exception {
        Map<Boolean,List<Student>> expectedMap = new HashMap<>();
        expectedMap.put(false, Collections.singletonList(student2));
        expectedMap.put(true,Arrays.asList(student1,student3));
        assertEquals(expectedMap,object.partitioningBy(students));
    }

    @Test
    public void summingInt() throws Exception {
        assertEquals(299, object.summingInt(students));
    }

    @Test
    public void toList() throws Exception {
        assertEquals(Arrays.asList(student1,student2,student3),object.toList(students));
    }

    @Test
    public void toCollection() throws Exception {
        assertEquals(Arrays.asList(student1,student2,student3),object.toCollection(students));
    }

    @Test
    public void toMap() throws Exception {
        Map<String,Integer> expectedMap = new HashMap<>();
        expectedMap.put(student1.getName(),student1.getMarks());
        expectedMap.put(student2.getName(),student2.getMarks());
        expectedMap.put(student3.getName(),student3.getMarks());
        assertEquals(expectedMap,object.toMap(students));

    }

}