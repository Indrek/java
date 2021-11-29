public interface ITelephone {

    //abstraktne

    void powerOn(); //lülitab telefoni sisse
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
