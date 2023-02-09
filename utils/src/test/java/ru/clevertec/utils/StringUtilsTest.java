package ru.clevertec.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @Test
    void testIsPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("5263"));
    }

    @Test
    void testIsNegativeNumber() {
        assertFalse(StringUtils.isPositiveNumber("-11"));
    }

}