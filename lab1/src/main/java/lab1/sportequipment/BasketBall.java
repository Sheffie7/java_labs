package lab1.sportequipment;

import lab1.enums.SportType;
import java.util.Scanner;

public class BasketBall extends Ball {
    public void init(Scanner scanner){
        super.init(scanner);
    }
    @Override
    public int getSportType(){
        return SportType.BASKETBALL.ordinal();
    }

    @Override
    public String toString(){
        return "Баскетбольный мяч. " + super.toString();
    }
}