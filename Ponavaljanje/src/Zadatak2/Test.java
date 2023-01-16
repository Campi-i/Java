package Zadatak2;

public class Test {

    public static void main(String[] args) {
        Ptica pero = new Ptica();
        Lastavica zorka = new Lastavica();

        pero.setIme("Ptica");
        zorka.setIme("Lastavica");

        System.out.println("Ime ptice: " + pero.getIme());
        pero.glasajSe();
        System.out.println("");
        System.out.println("Ime lastavice: " + zorka.getIme());
        zorka.glasajSe();
    }
}
