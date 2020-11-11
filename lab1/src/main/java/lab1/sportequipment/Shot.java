package lab1.sportequipment;

import lab1.enums.SportType;

import java.util.HashMap;
import java.util.Scanner;

public class Shot extends SportEquipment {
    int weight;

    public void init(Scanner scanner){
        System.out.println("Вес ядра: ");
        this.weight = scanner.nextInt();
        this.feature = new HashMap<String, Integer>();
        feature.put("weight", this.weight);
    }

    @Override
    public int getSportType(){
        return SportType.SHOT.ordinal();
    }

    public String toString(){ return "Ядро для метания. Имеет вес: " + Integer.toString(this.weight); }
}