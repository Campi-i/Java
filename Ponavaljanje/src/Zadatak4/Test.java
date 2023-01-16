package Zadatak4;

import static Zadatak4.UsporedbaPotrosnje.usporedi;

public class Test {

    public static void main(String[] args){
        //kreiramo dva objekta
        TestAutomobila auto1 = new TestAutomobila("Opel", 50, 100);
        TestAutomobila auto2 = new TestAutomobila("Mercedes", 29, 100);

        //pozivamo metodu usporedi
        usporedi(auto1, auto2);

    }
}
