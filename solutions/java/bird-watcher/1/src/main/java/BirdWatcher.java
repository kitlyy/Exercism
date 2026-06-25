
class BirdWatcher {
    private final int[] birdsPerDay;


//    private final int day1 = 0;
//    private final int day2 = 2;
//    private final int day3 = 5;
//    private final int day4 = 3;
//    private final int day5 = 7;
//    private final int day6 = 8;
//    private final int today = 4 ;
//    private final int [] birdsLastWeek = {day1, day2, day3, day4, day5, day6, today};

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
                System.out.println(birdCount + " is the count to ans is " + true);
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
