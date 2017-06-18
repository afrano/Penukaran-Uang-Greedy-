package Project;

import java.util.List;

/**
 *
 * @author Amran
 */
public class Greedy {

    public int i, j, k;

    public void solusiGlobal(int jumlah, int nominal, List<Integer> Kombinasi, int[] UangTersedia) {
        i = 0;
        while (i < UangTersedia.length) {
            int Uang = UangTersedia[i];
            jumlah += Uang;

            if (jumlah > nominal) {
                return;
            }
            Kombinasi.add(Uang);
            if (jumlah == nominal) {
                System.out.println(Kombinasi + " " + nominal);
                Kombinasi.remove(Kombinasi.size() - 1);
                return;
            }
            solusiGlobal(jumlah, nominal, Kombinasi, UangTersedia);
            Kombinasi.remove(Kombinasi.size() - 1);
            jumlah -= Uang;
            i++;

        }
    }
}
