package com.demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testAdd() {
        assertEquals(4, App.add(2, 2));
    }
}
