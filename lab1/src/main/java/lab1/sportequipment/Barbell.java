package lab1.sportequipment;

import java.util.Scanner;

public class Barbell extends WorkoutEquipment {
    int weight;

    public void init(Scanner scanner){
        super.init(scanner);
    }

    @Override
    public String toString(){ return "Штанга. " + super.toString(); }
}