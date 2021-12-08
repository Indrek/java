package map;

import java.util.HashMap;
import java.util.Map;

public class Main {

    //Map on andmekogum. Mapis on võti ja siis võtmele vastav väärtus.
    //Võtmete seas ei tohi olla korduvaid elemente.
    //Tavaliselt kasutatakse juhul, kui on vaja kiiresti mingi võtme järgi üles leida vastavat väärtust.
    //Võti on alati seotud ühe väärtusega

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        //kui listi puhul oli meil .add(), mis lisab
        //siis mapi puhul on .put()
        languages.put("Java", "Object oriented high level language");
        languages.put("Python", "Object oriented language (lihtsam)");
        languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code");
        languages.put("C", "Also language");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "This course is java");
            System.out.println("Java added successfully");
        }
        System.out.println(languages.get("Java")); //vaikimisi võtab java väärtuse, mis on
        //selle võtmega (key seotud)
        //iga võti on unikaalne
        languages.put("Java", "This course is java");
        System.out.println(languages.get("Java"));

        System.out.println("**********************************************");

//        languages.remove("Python"); //commenti välja kui replace
        if(languages.remove("C", "random")) {
            System.out.println("C removed");
        } else {
            System.out.println("C not removed, key/value pair not found");
        }

        System.out.println(languages.replace("Python", "Snake")); //commenti Pythoni remove välja
        System.out.println(languages.replace("Chicken", "This will not be added"));
        System.out.println(languages.replace("Python", "Snake", "Big snake"));

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }

}
