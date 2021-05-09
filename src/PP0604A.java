import java.util.Scanner;

/**
 * Średnia arytmetyczna
 */
public class PP0604A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n>0) {
            int amount = scan.nextInt();
            if (amount == 0)
                continue;
            int[] tab = new int[amount];
            float sum = 0f;
            for (int i=0; i<amount; i++) {
                tab[i] = scan.nextInt();
                sum = sum + tab[i];
            }
            sum = sum/amount;
            float min;
            float[] minTab = new float[amount];
            for (int i=0; i<amount; i++) {
                min = tab[i] - sum;
                if (min<0) {
                    min = -min;
                }
                minTab[i] = min;
            }
            min = minTab[0];
            int j=0;
            for(int i=1; i<amount; i++) {
                if (minTab[i]<min) {
                    min = minTab[i];
                    j=i;
                }
            }
            System.out.println(tab[j]);
            n--;
        }
    }
}
