package Zadatak5;
class Nit extends Thread {
    private int[] redak;
    private int redniBroj;

    public Nit(int[] redak, int redniBroj) {
        this.redak = redak;
        this.redniBroj = redniBroj;
    }

    @Override
    public void run() {

        int max = redak[0];

        for (int i = 1; i < redak.length; i++) {

            if (redak[i] > max) {
                max = redak[i];
            }
        }
        System.out.println("Nit " + redniBroj + " je zavrsila s radom, najveci broj u retku je: " + max);
    }
}
