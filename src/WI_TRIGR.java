import java.util.Scanner;

/**
 * Zastępowanie trójznaków
 */
public class WI_TRIGR {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String finalLine = "";
            boolean detected = false;
            boolean changed = false;
            for (int i=0; i<line.length(); i++) {
                if (line.charAt(i) == '?' && detected && (i!=line.length()-1)) {
                    detected = false;
                    changed = true;
                    switch(line.charAt(i+1)) {
                        case '=':
                            finalLine = finalLine + "#";
                            break;
                        case '/':
                            finalLine = finalLine + "\\";
                            break;
                        case '\'':
                            finalLine = finalLine + "^";
                            break;
                        case '(':
                            finalLine = finalLine + "[";
                            break;
                        case ')':
                            finalLine = finalLine + "]";
                            break;
                        case '!':
                            finalLine = finalLine + "|";
                            break;
                        case '<':
                            finalLine = finalLine + "{";
                            break;
                        case '>':
                            finalLine = finalLine + "}";
                            break;
                        case '-':
                            finalLine = finalLine + "~";
                            break;
                        default:
                            break;
                    }
                }
                else if (line.charAt(i) == '?') {
                    detected = true;
                }
                else if (changed) {
                    changed = false;
                }
                else {
                    finalLine = finalLine + line.charAt(i);
                }
            }
            System.out.println(finalLine);
        }
    }
}
