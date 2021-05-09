import java.util.Scanner;

/**
 * Złożoność czasowa
 */
public class ML1_B {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        short lines = in.nextShort();

        short n = 0;
        short max = 0;
        String instr;
        while (lines != 0) {
            instr = in.next();
            if (instr.equals("for")) {
                n++;
                if (n > max) {
                    max = n;
                }
            }
            if (instr.equals("end")) {
                n--;
            }
            lines--;
        }
        if (max == 0) {
            System.out.println("O(1)");
        }
        else if (max == 1) {
            System.out.println("O(n)");
        }
        else {
            System.out.println("O(n^" + max + ")");
        }

    }
}
