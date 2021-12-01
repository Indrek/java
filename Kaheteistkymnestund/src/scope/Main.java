package scope;

public class Main {

    public static void main(String[] args) {
        String varFour = "This is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println(varFour);
        System.out.println("scopeInstance privateVar is " + scopeInstance.getVarOne());
        System.out.println(scopeInstance.publicVar);

        scopeInstance.timesTwo();
        System.out.println("*****************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();

        scopeInstance.useInner();
//        System.out.println(innerClass.varThree);
    }

}
