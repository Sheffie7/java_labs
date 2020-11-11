package lab1.sportequipment;

import java.util.Map;
import java.util.Scanner;

public abstract class SportEquipment {
    Map<String, Integer> feature;

    public abstract void init(Scanner scanner); // считывание параметров с консоли

    public int getSportType() { // возвращает вид спорта, к которому относится
        return 0;
    }

    public Map<String, Integer> getFeature() {
        return this.feature;
    }
}
