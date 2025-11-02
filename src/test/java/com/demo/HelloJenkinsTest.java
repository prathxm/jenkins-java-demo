package com.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloJenkinsTest {

    @Test
    public void testGetMessage() {
        HelloJenkins app = new HelloJenkins();
        String message = app.getMessage();
        assertEquals("Hello from Jenkins!", message);
    }
}
