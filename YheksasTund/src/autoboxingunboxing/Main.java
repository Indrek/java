package autoboxingunboxing;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Juku");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        //primitiivne tüüp, ei saa listides kasutada. Mida saame teha?

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));
        //uue klassi tegemine  sisuliselt toimiks, aga suht kohmakas.
        //Parem oleks, kui oleks natuke lihtsam

        Integer integer = new Integer(54); //Kuidas tavaliselt uusi objekte luuakse
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (int i = 0; i<=10; i++) {
            intArrayList.add(Integer.valueOf(i));   //autoboxing -
                                                    //prim tüübist wrapperisse
        }
        for (int i = 0; i<=10; i++) {
            System.out.println(i + " -----> " + intArrayList.get(i).intValue());
            //unboxing - wrapper tüübist primitiivsesse int tüüpi
        }

        int randomValue = 10;
        Integer myIntValue = 12; //peaks väärtuse panema konstruktorisse? mis toimub?
        //Integer myIntValue = Integer.valueOf(12);
        int myInt = myIntValue; // primitiivne tüüp vs objekt? /// myIntValue.intValue();

        //double-ga näide
        System.out.println("**************************");
        ArrayList<Double> myDoubleValue = new ArrayList<>();

        for (double dbl = 0.0; dbl <= 10; dbl += 0.5) {
            myDoubleValue.add(dbl); //sulgudes sisuliselt Double.valueOf(dbl) (annab prim tüüpi väärtuse)
        }
        for (int i = 0; i<myDoubleValue.size(); i++) {
            double value = myDoubleValue.get(i); // .doubleValue() võib ära võtta
            System.out.println(i + " -----> " + value);
        }

    }

}
