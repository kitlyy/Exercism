
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[6] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birdCount : this.birdsPerDay) {
            if (birdCount == 0) {
                return true;
            }
        } return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalBirds = 0;
        if (numberOfDays > 7) {
            numberOfDays = 7;
        }
        for (int i = 0; i < numberOfDays; i++) {
            totalBirds += this.birdsPerDay[i];
        } return totalBirds;
    }

    public int getBusyDays() {
        int numberOfBusyDays = 0;
        for (int birdCount : this.birdsPerDay) {
            if (birdCount >= 5) {
                numberOfBusyDays += 1;
            }
        } return numberOfBusyDays;
    }
}
