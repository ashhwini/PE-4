package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {

    ReplaceCharacter obj = new ReplaceCharacter();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void replaceCharacterSuccess() {
        assertEquals("faity fry",obj.replaceCharacter("daily dry",'d','f','l','t'));
    }

    @Test
    public void replaceCharacterFailure() {
        assertNotEquals("faity fry",obj.replaceCharacter("daily dry",'d','f','l','i'));
    }
}