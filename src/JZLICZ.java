import java.util.Scanner;

/**
 * Zliczacz liter
 */
public class JZLICZ {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int n = scan.nextInt();
        int[] globCount = new int [alphabet.length()];
        while (n>=0) {
            String line = scan.nextLine();
            line = line.replaceAll(" " , "");
            for (int i=0; i<alphabet.length(); i++) {
                int count = 0;
                for (int j=0; j<line.length(); j++) {
                    if (alphabet.charAt(i) == line.charAt(j)) {
                        count++;
                    }
                }
                globCount[i] += count;
            }
            n--;
        }
        for (int i=0; i<alphabet.length(); i++) {
            if (globCount[i]>=1) {
                System.out.println(alphabet.charAt(i) + " " + globCount[i]);
            }
        }
    }
}
