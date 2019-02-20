package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MultipleOccurencesOfWordTest {

    MultipleOccurencesOfWord obj = new MultipleOccurencesOfWord();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void multipleOccurencesOfWordSuccess() {

        String[] output = {"Found at: 4 - 6","Found at: 10 - 12","Found at: 27 - 29"};
        assertArrayEquals(output,obj.multipleOccurencesOfWord("She sells seashells by the seashore","se"));

    }

    @Test
    public void multipleOccurencesOfWordFailure() {

        String[] output = {"Found at: 3 - 6","Found at: 9 - 12","Found at: 27 - 29"};
        assertNotEquals(output,obj.multipleOccurencesOfWord("She sells seashells by the seashore","se"));

    }

}