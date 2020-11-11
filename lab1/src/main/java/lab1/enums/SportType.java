package lab1.enums;

public enum SportType {
    BASKETBALL (0, "Баскетбол"),
    TENNIS (1,"Теннис"),
    SHOT (2, "Метание ядра"),
    WORKOUT (3,"Тренажерный зал");

    private int id;
    private String title;

    SportType(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}