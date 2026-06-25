public class GameMaster {

    public String describe(Character character) {
        return String.format("You're a level %d %s with %d hit points.", character.getLevel(), character.getCharacterClass(), character.getHitPoints());
    }

    public String describe(Destination destination) {
        return String.format("You've arrived at %s, which has %d inhabitants.", destination.getName(), destination.getInhabitants());
    }

    public String describe(TravelMethod method) {
        return switch (method) {
            case HORSEBACK -> "You're traveling to your destination on horseback.";
            case WALKING -> "You're traveling to your destination by walking.";
            default -> "";
        };
    }

    public String describe(Character character, Destination destination, TravelMethod method) {
        return String.format("%s %s %s", describe(character), describe(method), describe(destination));
    }

    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character character, Destination destination) {
        return String.format("%s You're traveling to your destination by walking. %s", describe(character), describe(destination));

    }
}
