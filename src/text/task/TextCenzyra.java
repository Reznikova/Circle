package text.task;

import byaka.Cenzura;

import java.util.Scanner;

public class TextCenzyra {
    public static void main(String[] args)    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фразу");
        String text = sc.nextLine();
       Cenzura cenzura = new Cenzura();
       String result = cenzura.convert(text);
        System.out.println(result);




    }
}
