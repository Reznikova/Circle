package otrez;



import otrezok.Otrezok;

import java.util.Scanner;

public class Otrez {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите число");
        int b = sc1.nextInt();

        Otrezok c = new Otrezok();
        int c1 = c.chislo(a, b);
        System.out.println(c1);
    }
}
