package com.example.mybatistutorial.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mybatistutorial.bean.Sample;

@SpringBootTest
public class DemoMapperTest {
    
    @Autowired
    DemoMapper mapper;

    @Test
    public void selectTest() {

        var result = mapper.findSample("testkey");

        assertEquals(result.key(), "testkey");
        assertEquals(result.memo(), "testmemo");

    }

    @Test
    public void registTest() {

        Sample regist = new Sample("registTest", "TestDone");
        boolean result = mapper.registSample(regist);

        assertEquals(result, true);

    }


}
