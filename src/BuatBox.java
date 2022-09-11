import java.util.ArrayList;

public class BuatBox {
    public static void boxSiku(ArrayList<String> arrInputKalimat){
        for (int i = 1; i < arrInputKalimat.size(); i++) {
            if (arrInputKalimat.get(i).toLowerCase().equals("risol") || arrInputKalimat.get(i).toLowerCase().equals("piscok")  || arrInputKalimat.get(i).toLowerCase().contains("total") || arrInputKalimat.get(i).equals("") || i == 1) {
                System.out.println(arrInputKalimat.get(i));
                continue;
            }
            System.out.println("[  ] " + arrInputKalimat.get(i));
        }
    }
}
