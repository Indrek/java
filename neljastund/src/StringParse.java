public class StringParse {

    public static void main(String[] args) {
            //Stringi parsimine
        String numberAsString = "2021";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1; // "2021"; 1 -> "1"; "2021" + "1" -> "20211"
        number += 1; // 2021 + 1

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        String doubleAsString = "2021.125";
        double doubleNumber = Double.parseDouble(doubleAsString);

        System.out.println("doubleAsString = " + doubleAsString);
        System.out.println("doubleNumber = " + doubleNumber);

        doubleAsString += 1;
        doubleNumber += 1;

        System.out.println("doubleAsString = " + doubleAsString);
        System.out.println("doubleNumber = " + doubleNumber);
    }
}
