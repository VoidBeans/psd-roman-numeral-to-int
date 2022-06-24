package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralToIntConverterTest {

    @Test
    void test_Convert_WhenGiven_XI_Return_11() {
        assertEquals(11, new RomanNumeralToIntConverter().convert("XI"));
    }

    @Test
    void test_Convert_WhenGiven_IV_Return_4() {
        assertEquals(4, new RomanNumeralToIntConverter().convert("IV"));
    }

    @Test
    void test_Convert_WhenGiven_CXIV_Return_114() {
        assertEquals(114, new RomanNumeralToIntConverter().convert("CXIV"));
    }

    @Test
    void test_Convert_WhenGiven_CXVI_Return_116() {
        assertEquals(116, new RomanNumeralToIntConverter().convert("CXVI"));
    }

    @Test
    void test_Convert_WhenGiven_CCXLVIII_Return_248() {
        assertEquals(248, new RomanNumeralToIntConverter().convert("CCXLVIII"));
    }

    @Test
    void test_Convert_WhenGiven_MXXIV_Return_1024() {
        assertEquals(1024, new RomanNumeralToIntConverter().convert("MXXIV"));
    }

    @Test
    void test_Convert_WhenGiven_DXII_Return_512() {
        assertEquals(512, new RomanNumeralToIntConverter().convert("DXII"));
    }

}
