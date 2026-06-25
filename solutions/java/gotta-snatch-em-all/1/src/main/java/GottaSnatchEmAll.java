import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return (!myCollection.equals(theirCollection)) &&
                !(myCollection.isEmpty() || theirCollection.isEmpty()) &&
                !(myCollection.containsAll(theirCollection) || theirCollection.containsAll(myCollection));
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> result = new HashSet<>(collections.getFirst());
        for (Set<String> set : collections) {
            result.retainAll(set);
        }
        return result;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> result = new HashSet<>();
        for (Set<String> set : collections) {
            result.addAll(set);
        }
        return result;
    }
}
