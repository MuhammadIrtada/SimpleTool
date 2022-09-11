import java.util.ArrayList;

public class Instagram {
    public static void convertLink(ArrayList<String> arrInputKalimat){
        for (int i = 1; i < arrInputKalimat.size(); i++) {
            System.out.println("https://www.instagram.com/" + arrInputKalimat.get(i) + "/");
        }
    }
}
