import java.util.ArrayList;

public class BuatImbuhan {
    public static void boxSiku(ArrayList<String> arrInputKalimat){
        for (int i = 1; i < arrInputKalimat.size(); i++) {
            if (arrInputKalimat.get(i).toLowerCase().equals("risol") || arrInputKalimat.get(i).toLowerCase().equals("piscok")  || arrInputKalimat.get(i).toLowerCase().contains("total") || arrInputKalimat.get(i).equals("") || i == 1) {
                System.out.println(arrInputKalimat.get(i));
                continue;
            }
            System.out.println("[  ] " + arrInputKalimat.get(i));
        }
    }

    public static void convertLinkInstagram(ArrayList<String> arrInputKalimat){
        for (int i = 1; i < arrInputKalimat.size(); i++) {
            System.out.println("https://www.instagram.com/" + arrInputKalimat.get(i) + "/");
        }
    }

    public static void convertLinkWhattsapp(ArrayList<String> arrInputKalimat){
        for (int i = 1; i < arrInputKalimat.size(); i++) {
            System.out.println("wa.me/" + arrInputKalimat.get(i) + "/");
        }
    }
}