public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int standardCarOutput = 221 * speed;
        if (speed <= 4) {
            return standardCarOutput;
        } else if (speed >= 5 && speed <= 8) {
            return standardCarOutput * 0.9;
        } else if (speed == 9) {
            return standardCarOutput * 0.8;
        } else {
            return standardCarOutput * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed)/60);
    }
}
