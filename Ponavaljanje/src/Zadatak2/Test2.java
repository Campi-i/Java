package Zadatak2;

public class Test2 {

    public static void main(String[] args) {
        Zivotinja[] niz = new Zivotinja[4];
        //kreiramo niz od 4 objekta, ali su instancirana s dva objekta klase ptica i dva objekta klase lastavica

        niz[0] = new Ptica();
        niz[1] = new Lastavica();
        niz[2] = new Ptica();
        niz[3] = new Lastavica();

        niz[0].setIme("mile");
        niz[1].setIme("djuro");
        niz[2].setIme("zvonimir");
        niz[3].setIme("ana");

        //petlja for-each koja prolazi kroz svaki objekt u nizu
        for (Zivotinja obj : niz) {
            System.out.println("Ime zivotinje : " + obj.getIme());
            obj.glasajSe();
        }
    }
}
