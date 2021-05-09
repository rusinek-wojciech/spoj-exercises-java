import java.io.IOException;
import java.util.Scanner;

/**
 * Dodawanie
 */
public class JSUMDUZE {

    public static String buildString(String a, String b)  {

        StringBuilder c = new StringBuilder();
        int aSize = a.length();
        int bSize = b.length();
        boolean aLonger;
        int tmp;
        boolean far = false;
        int j = 0;

        if (aSize > bSize) {
            tmp = bSize;
            aLonger = true;
        }
        else {
            tmp = aSize;
            aLonger = false;
        }
        while (tmp != 0) {
            j++;
            int aa = Character.getNumericValue(a.charAt(aSize - j));
            int bb = Character.getNumericValue(b.charAt(bSize - j));
            int cc = aa + bb;
            if (far) {
                cc++;
            }
            far = false;
            if (cc >= 10) {
                cc -= 10;
                far = true;
            }
            c.append(cc);
            tmp--;
        }

        if (aLonger) {
            while (j != aSize) {
                j++;
                int aa = Character.getNumericValue(a.charAt(aSize - j));
                if (far) {
                    aa++;
                    if (aa >= 10) {
                        aa -= 10;
                        far = true;
                    }
                    else {
                        far = false;
                    }
                }
                else {
                    far = false;
                }
                c.append(aa);
            }
        }
        else {
            while (j != bSize) {
                j++;
                int bb = Character.getNumericValue(b.charAt(bSize - j));
                if (far) {
                    bb++;
                    if (bb >= 10) {
                        bb -= 10;
                        far = true;
                    }
                    else {
                        far = false;
                    }
                }
                else {
                    far = false;
                }

                c.append(bb);
            }
        }

        if (far) {
            c.append(1);
        }


        return c.toString();
    }

    public static void main(String[] args) throws IOException {
        try{
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            while (size != 0) {
                String a = scan.next();
                String b = scan.next();
                String c = buildString(a,b);

                for (int i = c.length() - 1; i >= 0; i--) {
                    System.out.print(c.charAt(i));
                }
                System.out.println();

                size--;
            }
        }catch(Exception e){
            return;
        }
    }
}
