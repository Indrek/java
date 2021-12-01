import java.util.List;

public interface Naidis {

    //abstrakteerimine - implementeerid midagi,
    //sa keskendud selle, on vaja teha, mitte kuidas teha
    //ei näita, kuidas implementeerida, see jääb klasside teha.

    List<String> write();
    void read(List<String> savedValues);
}
