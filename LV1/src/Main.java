import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Prvi Zadatak

        System.out.println("J a v v a");

        System.out.println("J a a v v a a");

        System.out.println("J J aaaaa V V aaaaa");

        System.out.println("JJ a a V a a");

        //Drugi zadatak

        System.out.println("Hello");
        System.out.println("Luka Stific");



        //Treci zadatak

        int firstNumb;
        int secNumb;
        int suma = 0;

        Scanner input = new Scanner(System.in);
        firstNumb = input.nextInt();
        secNumb = input.nextInt();


        suma = firstNumb + secNumb;


        System.out.println(suma);

        //Cetvrti zadatak

        int firstNumbDj = 1;
        int secNumbDj = 1;
        int rez;

        firstNumbDj = input.nextInt();

        while(firstNumbDj == 0) {
            System.out.println("Ponovno unesite prvi broj");
            firstNumbDj = input.nextInt();
        }

        secNumbDj = input.nextInt();

        while(secNumbDj == 0) {
            System.out.println("Ponovno unesite drugi broj");
            secNumbDj = input.nextInt();
        }

        rez = firstNumbDj / secNumbDj;

        System.out.println(rez);

        //Peti zadatak

        int firstNumbMn;
        int secNumbMn;
        int rezMn;

        firstNumbMn = input.nextInt();
        secNumbMn = input.nextInt();

        rezMn = firstNumbMn * secNumbMn;

        System.out.println(rezMn);

        //Sesti zadatak

        int broj1;
        int broj2;

        int rezultat;

        broj1 = input.nextInt();
        broj2 = input.nextInt();

        rezultat = broj1 + broj2;
        System.out.println(rezultat);

        rezultat = broj1 - broj2;
        System.out.println(rezultat);

        rezultat = broj1 * broj2;
        System.out.println(rezultat);

        rezultat = broj1 / broj2;
        System.out.println(rezultat);

        rezultat = broj1 % broj2;
        System.out.println(rezultat);

    }




}