
public class Hero {
    // Приватные поля
    private int health;
    private int damage;
    private String superAbility;

    // Конструктор с тремя параметрами
    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    // Конструктор с двумя параметрами (без суперспособности)
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.superAbility = "None";  // По умолчанию суперспособность отсутствует
    }

    // Геттеры для всех полей
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}
