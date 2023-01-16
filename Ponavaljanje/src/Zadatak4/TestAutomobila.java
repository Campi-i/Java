package Zadatak4;

public class TestAutomobila {
    private String naziv;
    private double potrosenoGoriva;
    private double prijedenPut;

    public TestAutomobila(String naziv, double potrosenoGoriva, double prijedenPut) {
        this.naziv = naziv;
        this.potrosenoGoriva = potrosenoGoriva;
        this.prijedenPut = prijedenPut;
    }

    public double getProsjecnaPotrosnja() {
        return potrosenoGoriva / prijedenPut;
    }

    public String getNaziv() {
        return naziv;
    }
}
