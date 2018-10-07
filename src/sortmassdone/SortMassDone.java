package sortmassdone;

import massivplusten.EddTen;
import sortmassiv.SortMass;

import java.util.Arrays;

public class SortMassDone {
    public static void main(String[] args) {
        int[] a = {4,1,7};
        SortMass p = new SortMass();
        int result []= p.sort(a);
        System.out.println("Результат:"+ Arrays.toString(result));
    }
}
