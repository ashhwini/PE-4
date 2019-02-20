package com.stackroute.unittest;

import static org.junit.Assert.*;

public class OccurrenceOfCharacterTest {

    OccurrenceOfCharacter obj = new OccurrenceOfCharacter();

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void occurrenceOfCharacterSuccess() {

        assertEquals(10,obj.occurrenceOfCharacter("Java is java again java again",'a'));

    }

    @org.junit.Test
    public void occurrenceOfCharacterFailure() {

        assertNotEquals(5,obj.occurrenceOfCharacter("Java is java again java again",'a'));

    }

}