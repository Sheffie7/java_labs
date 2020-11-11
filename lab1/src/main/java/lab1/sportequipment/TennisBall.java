package lab1.sportequipment;

import lab1.enums.SportType;
import java.util.Scanner;

public class TennisBall extends Ball {
    public void init(Scanner scanner){
        super.init(scanner);
    }

    @Override
    public int getSportType(){
        return SportType.TENNIS.ordinal();
    }

    @Override
    public String toString(){return "Теннисный мяч. " + super.toString(); }
}