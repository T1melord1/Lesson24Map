import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
    Map<String,Integer> nameAge = new TreeMap<>();
    nameAge.put("Алиса", 31);
    nameAge.put("Вася", 12);
    nameAge.put("Петя", 44);


        for (Map.Entry<String, Integer> entry : nameAge.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for (String s : nameAge.keySet()) {
            System.out.println(s);
        }
        for (Integer value : nameAge.values()) {
            System.out.println(value);
        }
    }
}
