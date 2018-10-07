package massivplusten;

import java.util.Arrays;

public class EddTen {
    public int[] prirost (int a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i]=a[i]+a[i]/10;
        }
            return a;
    }
}
