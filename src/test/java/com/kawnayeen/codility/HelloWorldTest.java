package com.kawnayeen.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kawnayeen on 5/19/17.
 */
public class HelloWorldTest {
    @Test
    public void testSayHello(){
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Codility",helloWorld.sayHello());
    }
}