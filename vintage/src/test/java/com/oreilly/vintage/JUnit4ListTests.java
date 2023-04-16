package com.oreilly.vintage;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JUnit4ListTests {
    private static final List<String> strings =
            Arrays.asList("this", "is", "a", "list", "of", "strings");

    private final List<Integer> modifiable = new ArrayList<>();

    @BeforeClass
    public static void runBefore() {
        System.out.println("BeforeClass: " + strings);
    }

    @Before
    public void setUp() {
        System.out.println("Before: " + modifiable);
        modifiable.add(3);
        modifiable.add(1);
        modifiable.add(4);
        modifiable.add(1);
        modifiable.add(5);
    }

    @After
    public void finish() {
        System.out.println("After: " + modifiable);
    }

    @Test
    public void addElementsToList() {
        modifiable.add(9);
        modifiable.add(2);
        modifiable.add(6);
        modifiable.add(5);
        assertEquals(9, modifiable.size());
    }

    @Test
    public void size() {
        System.out.println("Testing size");
        assertEquals(6, strings.size());
        assertEquals(5, modifiable.size());
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void accessBeyondEndThrowsException() {
        System.out.println("Testing out of bounds exception");
        strings.get(99);
        assertEquals(6, strings.size());
    }

    @AfterClass
    public static void runAfter() {
        System.out.println("AfterClass: " + strings);
    }
}
