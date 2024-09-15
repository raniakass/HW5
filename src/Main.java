public class Main {

    public static void main(String[] args) {
        // Создаем экземпляр босса и задаем свойства через сеттеры
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setDefenseType("Magical");

        // Распечатываем информацию о боссе
        System.out.println("Босс:");
        System.out.println("Здоровье: " + boss.getHealth());
        System.out.println("Урон: " + boss.getDamage());
        System.out.println("Тип защиты: " + boss.getDefenseType());

        // Вызов метода createHeroes и распечатка информации о героях
        Hero[] heroes = createHeroes();
        System.out.println("\nГерои:");
        for (Hero hero : heroes) {
            System.out.println("Здоровье: " + hero.getHealth() + ", Урон: " + hero.getDamage() + ", Суперспособность: " + hero.getSuperAbility());
        }
    }

    // Метод для создания 3-х героев и возврата массива с ними
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(200, 30, "Fireball");
        Hero hero2 = new Hero(180, 25);  // Суперспособность по умолчанию "None"
        Hero hero3 = new Hero(220, 35, "Invisibility");

        // Помещаем созданных героев в массив
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}
