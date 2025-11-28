package org.school.lunch;

import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<Integer, Integer> potCookingTimes = Map.of(
        1, 25,
        2, 22,
        3, 40
    );
    private static final Scanner scanner = new Scanner(System.in);

    static void main() {
        int personCount = scanner.nextInt();
        int waterTemp = scanner.nextInt();
        int riceVolume = personCount * 75;
        double washTime = riceVolume * 0.13 * 8 / waterTemp;
        int waterVolume = riceVolume * 100;
        int pattern;
        if (riceVolume < 7500) {
            pattern = 1;
        } else if (riceVolume < 9400) {
            pattern = 2;
        } else {
            pattern = 3;
        }
        System.out.println("お米の量: " + riceVolume + "g");
        System.out.println("お米をすすぐ時間: " + washTime + "分");
        System.out.println("必要な水分量: " + waterVolume + "ml");
        System.out.println("炊飯時間: " + potCookingTimes.get(pattern) + "分");
        System.out.println("使用する鍋の種類: " + pattern);
    }
}
