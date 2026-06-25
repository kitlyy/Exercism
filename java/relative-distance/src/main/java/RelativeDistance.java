import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RelativeDistance {

    private Map<String, List<String>> familyTree;

    RelativeDistance(Map<String, List<String>>  familyTree) {
        this.familyTree = familyTree;
    }

    int degreeOfSeparation(String personA, String personB) {
        int degree = 0;
        for (String key : familyTree.keySet()) {
            System.out.println(key);
        }
        for (List<String> value : familyTree.values()) {
            System.out.println(value.get(0));
            System.out.println(value.get(1));
        }

        return degree;
    }
}
