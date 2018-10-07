package getusd;

import usd.Usd;

import java.util.Scanner;

public class GetUSD {
    public static void main(String[] args) {
       /* Usd getKurs = new Usd();
        getKurs.setKurs(10);
        getKurs.setRub(55);

        System.out.println(getKurs.result());*/
        Scanner scanner = new Scanner(System.in);
        Usd getKurs1 = new Usd(scanner.nextDouble(), scanner.nextDouble());
        Usd getKurs2 = new Usd(20, 10);
        System.out.println("Результат1 = "+ getKurs1.result());
        System.out.println("Результат2 = "+getKurs2.result());

    }

}
