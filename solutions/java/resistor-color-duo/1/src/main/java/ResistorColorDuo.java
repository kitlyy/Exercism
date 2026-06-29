import java.util.HashMap;
import java.util.Map;

class ResistorColorDuo {

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
            Map.entry("white", 9)
    ));

    int value(String[] colors) {
        String result = "";
        for (int i = 0; i < 2; i++) {
            result += codes.get(colors[i]);
        }
        return Integer.parseInt(result);
    }
}
