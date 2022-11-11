/*1. Napisati program koji će imati sljedeće mogućnosti odabira (koristiti switch):
 (1) Izračunati aritmetičku sredinu sporedne dijagonale.
 (2) Izračunati sumu neparnih elemenata prvog retka i prvog stupca matrice. Ukoliko
ne postoje neparni elementi ispisati da nije bilo moguće izračunati sumu.
 (3) Ispisati sve brojeve na parnim indeksima vektora V (koristiti continue).

Program na početku treba od korisnika zatražiti unos maksimalnog broja elemenata (n)
vektora V kao i dimenzije kvadratne matrice (mxm). Koristeći do-while petlju ograničiti
unos broja elemenata (n) na interval između 2 i 10, a za kvadratnu matricu broj (m)
ograničiti na interval između 1 i 5. Unos se mora ponavljati sve dok nije unesen broj u
traženom intervalu.
Koristiti try-catch blokove za zaštitu od grešaka kao što je npr. unos znaka na mjesto
unošenja dimenzija vektora i matrice.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;

        int m;
        int n;

        System.out.println("Unesite dimenziju vektora V [2, 10]");

        do{

            n = input.nextInt();
        }
        while(n < 2 || n > 10);

        int[] vektorV = new int[n];

        System.out.println("Unesite elemente u intervalu [1,10]");

        for(int i = 0; i < n; i++){
            vektorV[i] = input.nextInt();
        }

        System.out.printf("Unesite dimenziju m x m matrice <1, 5]");

        do{

                m = input.nextInt();
        }
        while(m <= 1 || m > 5);

        int[][] matrix = new int[m][m];

        System.out.println("Unesite elemente u intervalu [1,10]");

        for(int i = 0; i < m; i++){

            for(int j = 0; j < m ; j++){
                    matrix[i][j] = input.nextInt();
            }


        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------Menu------------");
        System.out.println("(1) Izracunati aritmetičku sredinu sporedne dijagonale.");
        System.out.println("(2) Izracunati sumu neparnih elemenata prvog retka i prvog stupca matrice.");
        System.out.println("(3) Ispisati sve brojeve na parnim indeksima vektora V.");
        System.out.println("------------Menu------------");


        choice = input.nextInt();

        switch (choice){

            case 1: {

                aritmetickaSredina(matrix, m);

            }
            break;

            case 2: {
                sumNeparnihEl(matrix, m);
            }

            break;

            case 3: {
                ispisBrojeva(vektorV, n);
            }

            break;

            default:
                System.out.println("Wrong input");
        }


    }

    private static void aritmetickaSredina (int matrix[][], int m){
       int suma = 0;
       double aritmetickaSredinaDijagonale = 0;

        for(int i = 0; i < m; i++){

            for(int j = 0; j < m; j++){

                if((i + j) == (m - 1)){
                    suma += matrix[i][j];
                }
            }
        }
        aritmetickaSredinaDijagonale = suma / m;

        System.out.println("Aritmeticka sredina sporedne dijagonale: " + aritmetickaSredinaDijagonale);
    }
    private static void sumNeparnihEl(int matrix[][], int m){
        int suma = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                if(i == 0){
                    if(matrix[i][j] % 2 == 1){
                        suma += matrix[i][j];
                    }
                }

                if(j == 0){
                    if(matrix[i][j] % 2 == 1){
                        suma += matrix[i][j];
                    }
                }
            }
        }

        System.out.println("Suma neparnih elemanata prvog reda i stupca: " + suma);
    }
    private static void ispisBrojeva(int vektorV[], int n){
        for(int i = 0; i < n; i++){
            if(i % 2 == 1){
                continue;
            }

            System.out.println("Element " + vektorV[i] + " je na parnom indexu " + i + ".");
        }
    }

    }