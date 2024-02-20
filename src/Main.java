import java.util.*;

public class Main {
    public static void main(String[] args) {
      Map<String, Set<String>> nameTodos = new HashMap<>();
      Set<String> todosVasya = new TreeSet<>();

      todosVasya.add("Купить молока");
      todosVasya.add("Сходить в гараж");

      nameTodos.put("Вася", todosVasya);

      Set<String> todosPetya = new TreeSet<>();

      todosPetya.add("Купить акций");
      todosPetya.add("Купить крипту");

      nameTodos.put("Петя", todosPetya);

        System.out.println(nameTodos.get("Вася"));  // [Купить молока, Сходить в гараж]
        System.out.println("");

        for (String вася :  nameTodos.get("Вася")) {  // Купить молока
               System.out.println(вася);              // Сходить в гараж
        }
        System.out.println("");
        for(Map.Entry<String, Set<String>> entry : nameTodos.entrySet()){  // Вася [Купить молока, Сходить в гараж]
            System.out.println(entry.getKey() +" " + entry.getValue());    // Петя [Купить акций, Купить крипту]
        }
        System.out.println("");
        for(Map.Entry<String, Set<String>> entry : nameTodos.entrySet()){     // Вася
            String name = entry.getKey();                                           // Купить молока
           System.out.println(name);                                                // Сходить в гараж
           for (String todo : entry.getValue()) {                             // Петя
               System.out.println("\t" + todo);                                     // Купить акций
           }                                                                        // Купить крипту
        }
        System.out.println("");
        System.out.println(nameTodos.containsKey("Петя"));                    // true
        System.out.println("");

        System.out.println(nameTodos.containsValue("Купить акций"));          // false
        System.out.println("");
        for(Map.Entry<String, Set<String>> entry : nameTodos.entrySet()){                     // Нет такого дела
            for(String val : entry.getValue()){                                               // Нет такого дела
                if(val.equals("Купить акций")){                                               // Купить акций содержится в делах Петя
                    System.out.println(val + " содержится в делах " + entry.getKey());        // Нет такого дела
                }else
                    System.out.println("Нет такого дела ");

            }
        }
        System.out.println("");
        boolean isContains = false;                                                       // Купить акций содержится в делах Петя
        for(Map.Entry<String, Set<String>> entry : nameTodos.entrySet()){
            for(String val : entry.getValue()){
                if(val.equals("Купить акций")){
                    System.out.println(val + " содержится в делах " + entry.getKey());
                    isContains = true;
                }

            }
        }
        if(!isContains){
            System.out.println("Такого значения нет");
        }
    }

}
