package accessmodifiers;

//mis on interface ja väljade/meetodite visibility?

// 1. Accessible interface?
// 2. int muutuja SOME_CONSTANT?
// 3. methodA?
// 4. methodB ja methodC?

//vihje: mõtle kuidas interfaced töötasid?

interface Accessible { //package-private, ligipääsetav samas packages
    int SOME_CONSTANT = 100; // public static final.
    public void methodA(); // public
    void methodB(); // public
    boolean methodC(); // public

    //interfaces saab olla ainult public meetodid.
    //me saame interface-i ennast package-private teha. by default meetodid public.

}
