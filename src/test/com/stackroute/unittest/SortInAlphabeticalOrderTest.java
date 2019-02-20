package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortInAlphabeticalOrderTest {

    SortInAlphabeticalOrder obj = new SortInAlphabeticalOrder();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortInAlphabeticalOrderSuccess() {

        assertEquals("aaagjmoprrv",obj.sortInAlphabeticalOrder("java     program"));

    }

    @Test
    public void sortInAlphabeticalOrderFailure() {

        assertNotEquals("aaagjmorv",obj.sortInAlphabeticalOrder("java     program"));

    }

}