import java.util.HashMap;
import java.util.Map;

class ResistorColorTrio {

    Map<String, Integer> codes = new HashMap<>(Map.ofEntries(
            Map.entry("black", 0),
            Map.entry("brown", 1),
            Map.entry("red", 2),
            Map.entry("orange", 3),
            Map.entry("yellow", 4),
            Map.entry("green", 5),
            Map.entry("blue", 6),
            Map.entry("violet", 7),
            Map.entry("grey", 8),
            Map.entry("white", 9)));


    String label(String[] colors) {
        StringBuilder result = new StringBuilder();
        int shorthand = 0;
        for (int i = 0; i < 3; i++) {
            Integer ohmTag = codes.get(colors[i]);
            if (i == 2) {
                if (ohmTag < 2) {
                    shorthand = (int) (Integer.parseInt(result.toString()) * Math.pow(10, ohmTag));
                    return shorthand + " ohms";
                } else if (ohmTag < 5) {
                    shorthand = (int) (Integer.parseInt(result.toString()) * Math.pow(10, ohmTag - 3));
                    return shorthand + " kiloohms";
                } else if (ohmTag < 7) {
                    shorthand = (int) (Integer.parseInt(result.toString()) * Math.pow(10, ohmTag - 6));
                    return shorthand + " megaohms";
                }
                shorthand = (int) (Integer.parseInt(result.toString()) * Math.pow(10, ohmTag - 9));
                return shorthand + " gigaohms";
            }
            result.append(ohmTag);
        }
        return result.toString();
    }
}
