package lab1.sportequipment;

import java.util.HashMap;
import java.util.Scanner;

public class Ball extends SportEquipment {
    int radius;

    public void init(Scanner scanner){
        System.out.println("Введите радиус мяча: ");
        this.radius = scanner.nextInt();
        this.feature = new HashMap<String, Integer>();
        feature.put("radius", this.radius);
    }

    public String toString(){ return "Мяч имеет радиус: " + Integer.toString(this.radius); }
}