public class PrototypePatternDemo {
    public static void main(String[] args) {
        // Создание оригинального персонажа
        Weapon sword = new Weapon("Sword", 15);
        Armor shield = new Armor("Shield", 10);
        Character originalCharacter = new Character("Hero", 100, 20, 15, 10, sword, shield);
        originalCharacter.addSkill(new Skill("Fireball", 30));
        originalCharacter.addSkill(new Skill("Shield Bash", 20));

        // Клонирование персонажа
        Character clonedCharacter = (Character) originalCharacter.clone();

        // Изменение клонированного персонажа
        clonedCharacter.addSkill(new Skill("Ice Spike", 25));

        // Вывод информации о персонажах
        System.out.println("Original Character: " + originalCharacter);
        System.out.println("Cloned Character: " + clonedCharacter);
    }
}
