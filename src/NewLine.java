import java.util.ArrayList;

public class NewLine {
    public static void hilangNewLine(ArrayList <String> arrInputKalimat){
        for (int i = 0; i < arrInputKalimat.size(); i++) {
            System.out.print(arrInputKalimat.get(i));
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
