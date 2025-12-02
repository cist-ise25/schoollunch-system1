package org.school.lunch;

import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    static void main() {
        int personCount = 20;
        int waterTemp = 12;
        int riceVolume = personCount * 75;
        double washTime = riceVolume * 0.003 * 8 / waterTemp;
        int waterVolume = (int) Math.ceil(riceVolume * 1.3);
        int pattern;
        String pot = null;
        if (riceVolume < 7500) {
            pattern = 1;
        } else if (riceVolume < 9400) {
            pattern = 2;
        } else {
            pattern = 3;
        }

        if (pattern == 1){
            pot = "小さい鍋";
        } else if (pattern == 2){
            pot = "浅い鍋";
        } else if (pattern == 3){
            pot = "深い鍋";
        }

        PotTable potTable = new PotTable();
        System.out.println("お米の量: " + riceVolume + "g");
        System.out.println("お米をすすぐ時間: " + washTime + "分");
        System.out.println("必要な水分量: " + waterVolume + "ml");
        System.out.println("炊飯時間: " + potTable.getCookingTime(pattern) + "分");
        System.out.println("使用する鍋の種類: " + pot);
    }
}
