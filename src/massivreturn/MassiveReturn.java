package massivreturn;

import massivplusten.EddTen;

import java.util.Arrays;
import java.util.Scanner;

public class MassiveReturn {
    public static void main(String[] args) {
        int[] a = {40,10,70};
        EddTen p = new EddTen();
         int result[]= p.prirost(a);
        System.out.println(Arrays.toString(result));
    }

}
