package ru.clevertec.core;

import ru.clevertec.utils.StringUtils;

import java.util.Arrays;
import java.util.List;

public class Utils {

    private Utils() {
        throw new IllegalStateException("Utility class");
    }

    public static List<Boolean> isAllPositiveNumbers(String... str) {
        return Arrays.stream(str)
                .map(StringUtils::isPositiveNumber)
                .toList();
    }

}
