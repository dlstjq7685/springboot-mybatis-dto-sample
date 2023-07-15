package com.example.mybatistutorial.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    public void recordTest(){

        Sample value = new Sample("recordTest", "TestDone");

        assertEquals(value.key(), "recordTest");
        assertEquals(value.memo(), "TestDone");

    }
}
