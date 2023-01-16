package Zadatak1;

import java.util.Scanner;

public class ZadatakPrvi {

    public static void main(String[] args) {

        final int konstNumb = 10;

        int broj;

        int brojPokusaja = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Unesite vašu pretpostavku:");

            broj = input.nextInt();

            brojPokusaja++;

            if (broj > konstNumb) {
                System.out.println("Unijeli ste veći broj.");
            }
            else if (broj < konstNumb) {
                System.out.println("Unijeli ste manji broj.");
            }
        } while (broj != konstNumb);

        System.out.println("Bravo! Pogodili ste broj zadan u programu, trebalo vam je " + brojPokusaja + " pokušaja.");
    }
}
