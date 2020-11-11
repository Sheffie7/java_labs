package lab1.sportequipment;

import java.util.Scanner;

public class Weight extends WorkoutEquipment {
    int weight;

    public void init(Scanner scanner){
        super.init(scanner);
    }

    @Override
    public String toString(){ return "Гиря. " + super.toString(); }
}