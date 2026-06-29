class Darts {
    int score(double xOfDart, double yOfDart) {
        double radius = Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2);
        if (radius > 100) {
            return 0;
        } else if (radius > 25) {
            return 1;
        } else if (radius > 1) {
            return 5;
        } return 10;
    }
}
