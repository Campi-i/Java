/*Napiši klasu „Zaposlenik“ koja ima privatne podatkovne članove „staz“, „starost“ i „placa“.
Napiši konstruktor koji inicijalizira podatkovne članove prilikom stvaranja objekta. Napiši
pristupne metode kojima se mogu promijeniti podatkovni članovi kao i metode kojima se
može dobiti njihova vrijednost. Napiši 2 metode koje računaju koliko je do sada zaradio
zaposlenik. Jedna metoda ne prima nikakav parametar pri pozivu nego računa sa podacima
objekta koji ju poziva, a druga metoda je statična i prima referencu na objekt klase Zaposlenik
za koji onda radi izračun. Obje metode računaju koliko je zaposlenik ukupno zaradio za
vrijeme rada (mjeseci broj godina staža mjesečna plaća).*/

public class Zaposlenik {

    private double Staz, Starost, Placa;

    public Zaposlenik(double Staz, double Starost, double Placa) {
        this.Staz = Staz;
        this.Starost = Starost;
        this.Placa = Placa;
    }

    public double getStaz() {
        return Staz;
    }

    public void setStaz(double staz) {
        Staz = staz;
    }

    public double getStarost() {
        return Starost;
    }

    public void setStarost(double starost) {
        Starost = starost;
    }

    public double getPlaca() {
        return Placa;
    }

    public void setPlaca(double placa) {
        Placa = placa;
    }

    public double IzracunZarade(){
        double zarada;

        zarada = this.Placa * this.Staz * 12;

        return zarada;
    }

    public static double IzracunZarade2(Zaposlenik zaposlenik){
        double zarada2 = 0;

        zarada2 = zaposlenik.Placa * zaposlenik.Staz * 12;

        return zarada2;

    }

    public static void main(String[] args) {

        Zaposlenik zaposlenik = new Zaposlenik(23, 56, 9632);

        double KonacnaZarada = zaposlenik.IzracunZarade();
        double KonacnaZarada2 = IzracunZarade2(zaposlenik);

        System.out.println(KonacnaZarada);

        System.out.println(KonacnaZarada2);
    }
}
