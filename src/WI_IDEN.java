import java.util.Scanner;

/**
 * Skracanie identyfikatorów
 */
public class WI_IDEN {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String data;
        if (size > 0) {
            data = in.next();
        }
        else {data = "";}

        StringBuilder sb = new StringBuilder();
        sb.append(data);


        if (sb.length() > size) {

            boolean end = false;
            for (int i = sb.length() - 1; i >= 0; i--) {
                if (sb.charAt(i) == '_' ) { // || sb.charAt(i) == '$'
                    sb.deleteCharAt(i);
                }
                if (sb.length() <= size) {
                    end = true;
                    break;
                }
            }
            if (!end) {
                for (int i = sb.length() - 1; i >= 0; i--) {
                    if (Character.isDigit(sb.charAt(i))) {
                        sb.deleteCharAt(i);
                    }
                    if (sb.length() <= size) {
                        end = true;
                        break;
                    }
                }
            }
            if (!end) {
                for (int i = sb.length() - 1; i >= 0; i--) {
                    if (sb.charAt(i) == 'A' || sb.charAt(i) == 'a' ||
                            sb.charAt(i) == 'E' || sb.charAt(i) == 'e' ||
                            sb.charAt(i) == 'Y' || sb.charAt(i) == 'y' ||
                            sb.charAt(i) == 'U' || sb.charAt(i) == 'u' ||
                            sb.charAt(i) == 'I' || sb.charAt(i) == 'i' ||
                            sb.charAt(i) == 'O' || sb.charAt(i) == 'o' ) {
                        sb.deleteCharAt(i);
                    }
                    if (sb.length() <= size) {
                        end = true;
                        break;
                    }
                }
            }
            if (!end) {
                for (int i = sb.length() - 1; i >= 0; i--) {
                    sb.deleteCharAt(i);
                    if (sb.length() <= size) {
                        end = true;
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }

}
