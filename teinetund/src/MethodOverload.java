public class MethodOverload {

    public static void main(String[] args) {
        System.out.println("String");
        System.out.println(10);
        System.out.println(5.5);

        // Meetodi ülelaadimine (method overload)
        // Meetodid erinevad parameetri(te) tüübi, arvu või järjekorra poolest
        say(5);
        say("Hello");
        say(7, 5.5);
        say(3.1, 6);

    }

    public static void say(int a) {
        System.out.println("Ütlen numbri " + a);
    }
    public static void say(String s) {
        System.out.println(s);
    }
    public static void say(int a, double b) {
        System.out.println("Ütlen numbri " + a + " ja komaarvu " + b);
    }
    public static void say(double b, int a) {
        System.out.println("Ütlen komaga arvu " + b + " ja numbri " + a);
    }

}
