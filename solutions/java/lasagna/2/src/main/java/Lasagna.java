public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int actualMinutes) {
        return expectedMinutesInOven() - actualMinutes;
    }
    public int preparationTimeInMinutes(int numberOfLayers) {
        int layerPrepTime = 2;
        return layerPrepTime*numberOfLayers;
    }

    public int totalTimeInMinutes(int numberOfLayers, int actualMinutes) {
        return preparationTimeInMinutes(numberOfLayers) + actualMinutes;
    }
}
