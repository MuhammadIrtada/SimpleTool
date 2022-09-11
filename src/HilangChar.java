import java.util.ArrayList;

public class HilangChar {
    public static void hilangAngka(ArrayList<String> arrInputKalimat){
        for (int i = 1; i <arrInputKalimat.size(); i++) {
            int numSpasi = 0;
            char[] b = arrInputKalimat.get(i).toCharArray();
            for (int j = 0; j < arrInputKalimat.get(i).length(); j++) {
                if (b[j] != '0' && b[j] != '1' &&b[j] != '2' &&b[j] != '3' &&b[j] != '4' &&b[j] != '5' &&b[j] != '6' &&b[j] != '7' &&b[j] != '8' &&b[j] != '9') {
                    if (b[j] == ' ') {
                        numSpasi++;
                    }
                    if (numSpasi != 1) {
                        System.out.print(b[j]);
                    }
                    numSpasi++;
                }
            }
            System.out.println();
        }
    }
    public static void hilangNomorDepan(ArrayList<String> arrInputKalimat) {
        for (int i = 0; i < arrInputKalimat.size(); i++) {
            char[] b = arrInputKalimat.get(i).toCharArray();
            for (int j = 0; j < b.length; j++) {
                if ((int)b[j] == 32 || (int)b[j] == 46 || (int)b[j] >= 48 && (int)b[j] <= 57) {
                    continue;
                }
                System.out.print(b[j]);
            }
            System.out.println();
        }
        
    }
}
