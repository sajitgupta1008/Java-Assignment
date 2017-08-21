package com.knoldus;

import org.junit.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StreamPracticeTest {

    private int length = 5;
    private String[] names = {"sajit", "gupta", "sohendra", "himanshu"};
    private int[] numArray = {5, 3, 7, 1, 3};
    private StreamPractice object = new StreamPractice();

    @Test
    public void allMatch() throws Exception {
        assertFalse(object.allMatch(length));
    }

    @Test
    public void anyMatch() throws Exception {
        assertTrue(object.anyMatch(length));
    }

    @Test
    public void noneMatch() throws Exception {
        assertFalse(object.noneMatch(length));
    }

    @Test
    public void collect() throws Exception {
    assertEquals("sajit,gupta,sohendra,himanshu",object.collect(names));
    }

    @Test
    public void count() throws Exception {
        assertEquals(names.length,object.count(names));
    }

    @Test
    public void findAny() throws Exception {
        assertEquals(Optional.of(names[0]),object.findAny(names));
    }

    @Test
    public void findFirst() throws Exception {
        assertEquals(Optional.of(names[0]),object.findFirst(names));
    }

    @Test
    public void min() throws Exception {
        assertEquals(Optional.of("sajit"),object.min(names));
    }

    @Test
    public void max() throws Exception {
        assertEquals(Optional.of("sohendra"),object.max(names));
    }

    @Test
    public void filter() throws Exception {
        assertEquals(Arrays.asList("sohendra","himanshu"),object.filter(names));
    }

    @Test
    public void distinct() throws Exception {
        assertEquals(new HashSet<>(Arrays.asList("himanshu", "sajit", "sohendra", "gupta")),object.distinct(names));
    }

    @Test
    public void limit() throws Exception {
        assertEquals(Arrays.asList(1,2,4),object.limit(3));
    }

    @Test
    public void map() throws Exception {
        assertEquals(Arrays.asList(6,4,8,2,4),object.map(numArray));
    }

    @Test
    public void flatMap() throws Exception {
        assertEquals(Arrays.asList(6,4,8,2,4),object.flatMap(numArray));
    }

    @Test
    public void sorted() throws Exception {
        assertEquals(Arrays.asList(1,3,3,5,7),object.sorted(numArray));
    }
}