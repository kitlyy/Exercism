import java.util.ArrayList;
import java.util.List;

class HighScores {

    List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.getLast();
    }

    Integer personalBest() {
        return highScores.stream().max(Integer::compare).get();
    }

    List<Integer> personalTopThree() {
        List<Integer> sorted = highScores.stream().sorted().toList().reversed();
        if (sorted.size() < 3) {
            return sorted;
        }
        return new ArrayList<>(List.of(
                sorted.getFirst(),
                sorted.get(1),
                sorted.get(2)
        ));
    }

}
