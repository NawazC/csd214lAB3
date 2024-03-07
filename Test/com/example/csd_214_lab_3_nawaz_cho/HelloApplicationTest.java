package com.example.csd_214_lab_3_nawaz_cho;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {

    @Test
    void yearlysalry() {
        HelloApplication x= new HelloApplication();
        assertEquals(x.yearlysalry(4000),48000);
    }
}