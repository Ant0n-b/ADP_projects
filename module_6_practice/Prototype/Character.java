import java.util.ArrayList;
import java.util.List;

public class Character implements ICloneable {
    private String name;
    private int health;
    private int strength;
    private int agility;
    private int intelligence;
    private Weapon weapon;
    private Armor armor;
    private List<Skill> skills;

    public Character(String name, int health, int strength, int agility, int intelligence, Weapon weapon, Armor armor) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.weapon = weapon;
        this.armor = armor;
        this.skills = new ArrayList<>();
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public String getName() {
        return name;
    }

    @Override
    public ICloneable clone() {
        Character clonedCharacter = new Character(
                name,
                health,
                strength,
                agility,
                intelligence,
                (Weapon) weapon.clone(),
                (Armor) armor.clone()
        );

        for (Skill skill : skills) {
            clonedCharacter.addSkill((Skill) skill.clone());
        }

        return clonedCharacter;
    }

    @Override
    public String toString() {
        StringBuilder characterInfo = new StringBuilder("Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence +
                ", weapon=" + weapon +
                ", armor=" + armor +
                ", skills=");

        for (Skill skill : skills) {
            characterInfo.append(skill).append(", ");
        }

        characterInfo.append("}");

        return characterInfo.toString();
    }
}
