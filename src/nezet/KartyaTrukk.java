package nezet;

import java.util.Scanner;
import modell.Pakli;
import modell.Lap;

public final class KartyaTrukk {

    private static final Scanner sc = new Scanner(System.in);
    private Pakli pakli;
    private int oszlop = 0;

    public KartyaTrukk() {
        this.pakli = new Pakli();
        for (int i = 0; i < 3; i++) {
            kirak();
            melyik();
        }
        ezVolt();

    }

    private void melyik() {
        boolean jo;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        this.pakli.kever(oszlop);
    }

    public int getOszlop() {
        return oszlop;
    }

    void kirak() {
        Lap[] lapok = this.pakli.getPakli();
        for (int i = 1; i < lapok.length; i++) {
            System.out.printf("%-8s", lapok[i].getLeiras());
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }
    void ezVolt() {
        System.out.println("A választott lap: " + pakli.ezVolt());
    }
}
