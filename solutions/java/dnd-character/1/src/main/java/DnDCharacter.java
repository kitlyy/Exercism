import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    Random random = new Random();
    int strength = 0;
    int dexterity = 0;
    int constitution = 0;
    int intelligence = 0;
    int wisdom = 0;
    int charisma = 0;

    DnDCharacter() {
        strength = ability(rollDice());
        dexterity = ability(rollDice());
        constitution = ability(rollDice());
        intelligence = ability(rollDice());
        wisdom = ability(rollDice());
        charisma = ability(rollDice());
    }

    int ability(List<Integer> scores) {
        scores = scores.stream()
                .sorted()
                .toList();
        return scores.get(1) + scores.get(2) + scores.get(3);
    }

    List<Integer> rollDice() {
        List<Integer> abilityRolls = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            abilityRolls.add(random.nextInt(1, 7));
        }
        return abilityRolls.stream()
                .sorted()
                .toList();
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10,  2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
    }
}
