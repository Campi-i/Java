package Zadatak4;

public class UsporedbaPotrosnje {

    //kreiramo static metodu koja prima dva objekta klase TestAutomobila
    public static void usporedi(TestAutomobila auto1, TestAutomobila auto2) {

        double prosjek1 = auto1.getProsjecnaPotrosnja();
        double prosjek2 = auto2.getProsjecnaPotrosnja();

        System.out.println("Prosječna potrošnja automobila " + auto1.getNaziv() + " je " + prosjek1);
        System.out.println("Prosječna potrošnja automobila " + auto2.getNaziv() + " je " + prosjek2);

        if (prosjek1 < prosjek2) {
            System.out.println("");
            System.out.println("Automobil " + auto1.getNaziv() + " je štedljiviji od automobila " + auto2.getNaziv());
        }
        else if (prosjek2 < prosjek1) {
            System.out.println("");
            System.out.println("Automobil " + auto2.getNaziv() + " je štedljiviji od automobila " + auto1.getNaziv());
        }
        else {
            System.out.println("");
            System.out.println("Automobili imaju jednaku prosječnu potrošnju");
        }
    }
}
