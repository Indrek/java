public class Switch {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        System.out.println("*************************************");
        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was 3, 4 or 5");
                System.out.println("It was " + switchValue);
                break;
            default:
                System.out.println("It was not 1 or 2 or 3 or 4 or 5");
                break;
        }
        char switchChar = 'G';
        switch(switchChar) {
            case 'A':
                System.out.println("Was A");
                break;
            case 'B':
                System.out.println("Was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Was " + switchChar);
                break;
            default:
                System.out.println("Not found");
                break;
        }
        int month, daysOfMonth;
        month = 10;

        switch (month) {
            case 4: case 6: case 9: case 11:
                daysOfMonth = 30;
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysOfMonth = 31;
                break;
            case 2:
                daysOfMonth = 28;
                break;
            default:
                daysOfMonth = 0;
                System.out.println("Month not valid");
                break;
        }
        System.out.println("Days: " + daysOfMonth);

        //kui ülemine switch if-dena välja kirjutada
        if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            daysOfMonth = 30;
        } //jne

    }

}
