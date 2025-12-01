package org.school.lunch;

import java.util.Map;

public class PotTable {
    private static final Map<Integer, Integer> potCookingTimes = Map.of(
            1, 25,
            2, 22,
            3, 40
    );
    public static int getCookingTime(int pattern) {
        return potCookingTimes.getOrDefault(pattern, 0);
    }
}
