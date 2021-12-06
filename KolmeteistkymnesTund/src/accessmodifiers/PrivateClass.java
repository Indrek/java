package accessmodifiers;

class PrivateClass {

    //top-levelil saavad olla ainult klassid, interfaced, enum; (ei saa olla private)
    /*
    top-level:
    public: nähtav igal pool. sama package, võõras package, kus iganes, igal pool nähtav.

    package-private: objekti näevad ainult samas packages olevad klasssid. eraldi tunnussõna selle jaoks ei ole
    package-private saab määrata siis selliselt, et sa ei määra nähtavust. (default, kui ei määra public vms)


    member level (nüüd oleme klassi sees)
    public: sama, mis top klassil. nähtav igal pool (nt väli v meetod). saab kasutada ka teistes packagites

    package-private: sama, mis top level. objekt, mis on package-private, on nähtav ainult samas packages
    olevate klasside poolt

    private: objekti (v välja/meetodit) näeb ainult samas klassis, kus ta deklareeriti. (isegi alamklassid ei saa ligi)

    protected: objekti on nähtav ainult oma packages (nagu package-private), aga ka alamklassides (sõltumata
    packagest)

    access modifierid
     */




}
