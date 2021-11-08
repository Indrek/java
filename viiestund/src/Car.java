//public = access modifier
//piiramatu ligipääs klassile
//private - ükski teine klass ei saa ligi
//protected - samas packages (kaustas) klassid saavad ligi

//klassi muutujad - (field / väljad)
//klassi muutujad (väljad) on ka access modifieritega (tavaliselt private)
//kapseldamine (peidame väljad ja meetodid, et neid avalikult ei näeks)

import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {

        String validModel = model.toLowerCase();
        if (validModel.equals("panamera") || validModel.equals("astra")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }
    public String getModel() {
        return this.model;
    }

}
