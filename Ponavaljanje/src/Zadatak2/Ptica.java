package Zadatak2;

//klasa ptica implementira zivotinju i ima svoju implementaciju metode GlasajSe
public class Ptica implements Zivotinja{
    private String ime;

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }

    public void glasajSe() {
        System.out.println("cip cip");
    }
}
