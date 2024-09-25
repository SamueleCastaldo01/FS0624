import RettangoloP.Rettangolo;
import SIMP.SIM;

public class Main {
    public static void main(String[] args) {
        System.out.println("prova");


        Rettangolo ret1 = new Rettangolo(21, 23);
        ret1.stampaRettangolo();

        Rettangolo  ret2 = new Rettangolo(23, 34);

        Rettangolo.stampaDueRettangoli(ret1, ret2);

        System.out.println("\n \n Esercizio 2");


        SIM simmo = new SIM(392254321);
        simmo.aggiungiChiamata(38823123, 10);
        simmo.aggiungiChiamata(3241235, 34);
        simmo.stampaDati();

    }
}