import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
    Map<String,Integer> nameAge = new TreeMap<>();
    nameAge.put("Алиса", 31);
    nameAge.put("Вася", 12);
    nameAge.put("Петя", 44);

        System.out.println(nameAge.get("Вася"));
    }
}
