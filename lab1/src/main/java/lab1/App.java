package lab1;

import lab1.services.InputEquipment;
import lab1.sportequipment.SportEquipment;

import java.util.Scanner;

//Вариант 6 (14)
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество предметов: ");
        int equipmentCount;
        equipmentCount = scanner.nextInt(); //Добавить в будущем проверку на "пользователя-тролля"

        SportEquipment[] equipments = new SportEquipment[equipmentCount];
        SportEquipment newItem;
        for (int i = 0; i < equipmentCount; ) {
            System.out.println("Для ввода предмета, введите соответствующую цифру.\n" +
                    "0 - Баскетбольный мяч\n" +
                    "1 - Теннисный мяч\n" +
                    "2 - Ракетка\n" +
                    "3 - Ядро\n" +
                    "4 - Штанга\n" +
                    "5 - Гиря\n"
            );
            int scanSportType = scanner.nextInt();
            newItem = InputEquipment.createEquipment(scanSportType);
            while (newItem == null) { //Немного костыльный обработчик исключений, но рабочий. К 2 лабе переделаю.
                scanSportType = scanner.nextInt();
                newItem = InputEquipment.createEquipment(scanSportType);
            }
            newItem.init(scanner);
            equipments[i] = newItem;
            i++;
        }
        System.out.println("Ввод завершен.");
        System.out.println("Следующие предметы имеют характеристику 'Вес':");
        for (SportEquipment sportEquipment : equipments) {
            if (sportEquipment.getFeature().containsKey("weight")) {
                System.out.println(sportEquipment.toString());
            }
        }
    }
}