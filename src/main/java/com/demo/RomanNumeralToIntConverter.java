package com.demo;

import java.util.HashMap;
import java.util.Map;

class RomanNumeralToIntConverter {

    int convert(String romanNumeralString) {
        final Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < romanNumeralString.length(); i++) {
            char c = romanNumeralString.charAt(i);

            if (i > 0 && map.get(c) > map.get(romanNumeralString.charAt(i - 1))) {
                result += map.get(c) - 2 * map.get(romanNumeralString.charAt(i - 1));
            } else {
                result += map.get(c);
            }
        }

        return result;
    }

}
