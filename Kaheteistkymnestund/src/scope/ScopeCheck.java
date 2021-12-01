package scope;

public class ScopeCheck {

    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("publicVar = " + publicVar + ", privateVar = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }
    public void timesTwo() {
        int varTwo = 2; //lokaalne meetodile
        for (int i = 0; i<10; i++) {
            System.out.println(i + " times two is " + i * varTwo);
        }
//        System.out.println("Value of i = " + i);
    }
    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("innerClass privateVar: " + innerClass.varThree);
    }

    public class InnerClass {
        private int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass created, privateVar is " + varThree);
        }

        public void timesTwo() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * ScopeCheck.this.varOne);
            }
        }
    }
}
