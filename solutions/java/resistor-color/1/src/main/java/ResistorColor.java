class ResistorColor {
    int colorCode(String color) {
        return switch (color) {
            case "black" -> 0;
            case "white" -> 9;
            case "orange" -> 3;
            default -> -1;
        };
    }

    String[] colors() {
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}