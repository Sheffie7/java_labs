package lab1.sportequipment;

import lab1.enums.SportType;

import java.util.HashMap;
import java.util.Scanner;

public class Racket extends SportEquipment {
    int price;

    public void init(Scanner scanner){
        System.out.println("Цена: ");
        this.price = scanner.nextInt();
        this.feature = new HashMap<String, Integer>();
        feature.put("price", this.price);
    }

    @Override
    public int getSportType(){
        return SportType.TENNIS.ordinal();
    }

    @Override
    public String toString(){
        return "Цена теннисной ракетки: " + this.price;
    }
}