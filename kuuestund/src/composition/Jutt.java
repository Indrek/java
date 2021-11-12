package composition;

public class Jutt {
    //klass vs objekt vs instance vs reference

    //Maja ehitamise analoog
    //klass = blueprint, mille abil me saame ehitada nii mitu maja, kui tahame
    //
    //iga maja, mille me ehitame on objekt
    //deklareerime "new" sõnaga
    //
    //igal majal on oma aadress. Kui annad kellelegi paberi peal aadressi, siis see on reference (viide)
    //viidet (paberit) saab copyda nii palju kui tahad, aga maja (objekti) on ikka ainult 1

    //static vs instance meetodid
    //static ei saa "this." kasutada
    //meetodid, mis "this." ei kasuta, võiks olla static

    //instance meetodid(!) kuuluvad klassi instantsi. saavad kasutada static meetodeid ja muutujaid
    //
    //Kas peaks olema static?
    //Kas kasutab instance muutujaid v mitte?
    //jah (kasutab)
    //peaks olema instance meetod
    //
    //ei:
    //peaks olema static meetod
    //
    //muutujad (variables)
    //static muutuja(väli (field)) klassis
    //kõik klassid jagavad seda ühte ja sama static muutujat.
    //üldjuhul static meetodeid klassides ei kasutata (kuna igal instantsil mingid omad omadused)
    //
    //kui tahad näiteks kasutajalt sisendit küsida, siis nt scanner võib olla static klassis.
}
