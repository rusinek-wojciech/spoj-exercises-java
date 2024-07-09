import java.util.Scanner;

/* Sumy wielokrotne */
public class KC008 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        long sumTotal = 0L;
        long sum = 0L;

        while (scan.hasNextLong()) {
            sum = 0L;
            
            while(scan.hasNextLong()) {
                long numb = scan.nextLong();
                if (numb == 0) {
                    sumTotal += sum;
                    break;
                }
                sum += numb;
            }
            System.out.println(sum);
        }
        System.out.println(sumTotal);
    }
}
