package lab1.services;

import lab1.sportequipment.*;

public class InputEquipment {
    public static SportEquipment createEquipment(int inputType) {
        try {
            SportEquipment newItem;
            switch (inputType) {
                case 0:
                    newItem = new BasketBall();
                    return newItem;
                case 1:
                    newItem = new TennisBall();
                    return newItem;
                case 2:
                    newItem = new Racket();
                    return newItem;
                case 3:
                    newItem = new Shot();
                    return newItem;
                case 4:
                    newItem = new Barbell();
                    return newItem;
                case 5:
                    newItem = new Weight();
                    return newItem;
                default:
                    throw new ArrayIndexOutOfBoundsException("Ошибка! Введено значение, не существующее в таблице. Попробуйте заново.");
            }
            } catch (ArrayIndexOutOfBoundsException Error) {
                    System.out.println(Error);
                    return null;
            }
        }
    }
