package static_ja_final;

public class Password {
    private static final int key = 123456789;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }
    private int encryptDecrypt(int password) {
        return password ^ key; //XOR
        //&& || ==
        //XOR, XAND,
        //XOR - kas see või teine, aga mitte mõlemad.
    }
    public final void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("You cannot come in");
            return false;
        }
    }
}
