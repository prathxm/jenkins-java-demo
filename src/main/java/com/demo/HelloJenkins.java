package com.demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloJenkinsTest {

    @Test
    public void testGreet() {
        String expected = "Hello from Jenkins Pipeline!";
        String actual = HelloJenkins.greet();
        assertEquals(expected, actual);
    }
}
