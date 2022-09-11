import java.util.ArrayList;

public class CamelCase {
    public static void jadiCamelCase(ArrayList<String> arrInputKalimat){
        for (int i = 1; i < arrInputKalimat.size(); i++) {
            String[] arrString = arrInputKalimat.get(i).split(" ");
            for (String string : arrString) {
                String hasil = string.substring(0, 1).toUpperCase() + string.substring(1, string.length());
                hasil += " ";
                System.out.print(hasil);
            }
            System.out.println();
        }
    }
}
