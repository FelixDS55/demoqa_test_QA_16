package com.demoqa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUnit {
    @Test
    void firstTest(){
        System.out.println("First");
        assertTrue(3 > 2);
    }
}
