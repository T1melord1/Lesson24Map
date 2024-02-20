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

        System.out.println(nameTodos.get("Вася"));

        for (String вася :  nameTodos.get("Вася")) {
            System.out.println(вася);
        }
        for(Map.Entry<String, Set<String>> entry : nameTodos.entrySet()){
            System.out.println(entry.getKey() +" " + entry.getValue());
        }

        for(Map.Entry<String, Set<String>> entry : nameTodos.entrySet()){
            String name = entry.getKey();
           System.out.println(name);
           for (String todo : entry.getValue()) {
               System.out.println("\t" + todo);
           }
        }

        System.out.println(nameTodos.containsKey("Петя"));


        System.out.println(nameTodos.containsValue("Купить акций"));

        for(Map.Entry<String, Set<String>> entry : nameTodos.entrySet()){
            for(String val : entry.getValue()){
                if(val.equals("Купить акций")){
                    System.out.println(val + " содержится в делах " + entry.getKey());
                }else
                    System.out.println("Нет такого дела ");

            }
        }
        boolean isContains = false;
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
