package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionImplementationTest {

    RegularExpressionImplementation obj = new RegularExpressionImplementation();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void regularexpressionSuccess() {
        assertEquals("Is harry here ? true",obj.regularexpression("this is harry","harry"));
    }

    @Test
    public void regularexpressionFailure() {
        assertNotEquals("false",obj.regularexpression("this is harry","harry"));
    }

}