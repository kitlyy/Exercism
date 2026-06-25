class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{

    int distanceTravelled = 0;
    int numberOfVictories = 0;

    public void drive() {
        distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }


    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        if (getNumberOfVictories() == o.getNumberOfVictories()) {
            return 0;
        } else if (getNumberOfVictories() < o.getNumberOfVictories()) {
            return 1;
        }
        return -1;
    }
}
