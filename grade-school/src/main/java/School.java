import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class School {

    private Map<Integer, List<String>> db = new TreeMap<>();

    public Map<Integer, List<String>> db() {
        return db;
    }

    public void add(String name, Integer grade) {
        if (db.containsKey(grade)) {
            db.get(grade).add(name);
        } else {
            List<String> list = new ArrayList<>();
            list.add(name);
            db.put(grade, list);
        }
    }

    public List<String> grade(int grade) {
        return (db.containsKey(grade)) ? db.get(grade) : new ArrayList<>();
    }

    public Map<Integer, List<String>> sort() {
        Map<Integer, List<String>> dbSortedByKeys = new TreeMap<>(db);
        Map<Integer, List<String>> fullySorted = new TreeMap<>();

        for (Map.Entry<Integer, List<String>> entry : dbSortedByKeys.entrySet()) {
            List<String> names = new ArrayList<>(entry.getValue());
            Collections.sort(names);
            fullySorted.put(entry.getKey(), names);
        }

        return fullySorted;
    }

}
