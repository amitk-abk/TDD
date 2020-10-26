package com.mycomp.tdd.roman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralConverterTest {

    RomanNumeralConverter converter;

    @BeforeEach
    void setUp() {
        converter = new RomanNumeralConverter();
    }

    @Test
    void convertI() throws Exception {
        assertConverted(1, "I");
    }

    @Test
    void convertII() throws Exception {
        assertConverted(2, "II");
    }

    @Test
    void convertIII() throws Exception {
        assertConverted(3, "III");
    }

    @Test
    void convertV() throws Exception {
        assertConverted(5, "V");
    }

    @Test
    void convertIV() throws Exception {
        assertConverted(4, "IV");
    }

    @Test
    void convertVI() throws Exception {
        assertConverted(6, "VI");
    }

    @Test
    void convertVII() throws Exception {
        assertConverted(7, "VII");
    }

    @Test
    void convertVIII() throws Exception {
        assertConverted(8, "VIII");
    }

    @Test
    void convertX() throws Exception {
        assertConverted(10, "X");
    }

    @Test
    void convertIX() throws Exception {
        assertConverted(9, "IX");
    }

    @Test
    void convertXI() throws Exception {
        assertConverted(11, "XI");
    }

    @Test
    void convertXV() throws Exception {
        assertConverted(15, "XV");
    }

    @Test
    void convertXVIII() throws Exception {
        assertConverted(18, "XVIII");
    }

    @Test
    void convertXIV() throws Exception {
        assertConverted(14, "XIV");
    }

    @Test
    void convertXXIV() throws Exception {
        assertConverted(24, "XXIV");
    }

    @Test
    void convertL() throws Exception {
        assertConverted(50, "L");
    }

    @Test
    void convertXLIX() throws Exception {
        assertConverted(49, "XLIX");
    }

    @Test
    void convertC() throws Exception {
        assertConverted(100, "C");
    }

    @Test
    void convertCIV() throws Exception {
        assertConverted(104, "CIV");
    }

    @Test
    void convertCV() throws Exception {
        assertConverted(105, "CV");
    }

    @Test
    void convertD() throws Exception {
        assertConverted(500, "D");
    }

    @Test
    void convertM() throws Exception {
        assertConverted(1000, "M");
    }

    @Test
    void convertMMVI() throws Exception {
        assertConverted(2006, "MMVI");
    }

    @Test
    void convertMCMXLIV() throws Exception {
        assertConverted(1944, "MCMXLIV");
    }

    @Test
    void convertMCMLXXXVIII() throws Exception {
        assertConverted(1988, "MCMLXXXVIII");
    }

    @Test
    void convertMMMDCCCLXXXVIII() throws Exception {
        assertConverted(3888, "MMMDCCCLXXXVIII");
    }

    private void assertConverted(int expected, String roman) {
        assertEquals(expected, convert(roman));
    }

    private int convert(String in) {
        return converter.convert(in);
    }
}
