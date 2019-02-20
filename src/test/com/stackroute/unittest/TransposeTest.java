package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {

    Transpose obj = new Transpose();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverseSuccess() {
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",obj.reverse("a quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void reverseFailure() {
        assertNotEquals("a kciuq xof spmuj revo eht yzal god",obj.reverse("a quick brown fox jumps over the lazy dog"));
    }

}