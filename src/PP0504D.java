import java.util.Scanner;

public class PP0504D {
    static void printFloat(float numb) {
        String numbText;
        if (numb == 0) {
            numbText = "0 0 0 0";
        }
        else {
            int intBits = Float.floatToIntBits(numb);
            String hexRep = Integer.toHexString(intBits);
            StringBuilder builder = new StringBuilder();
            for (int i=0; i<4; i++) {
                String twoBytes = hexRep.substring(2*i,2*i+2);
                if (twoBytes.equals("00"))
                    builder.append("0");
                else
                    builder.append(twoBytes);
                if (i!=3)
                    builder.append(' ');
            }
            numbText = builder.toString();
        }
        System.out.println(numbText);
    }



    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n>0) {
            String numbText =  scan.next();
            numbText = numbText.replace(',' , '.');
            printFloat(Float.valueOf(numbText));
            n--;
        }
    }
}
