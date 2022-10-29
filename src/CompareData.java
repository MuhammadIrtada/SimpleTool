import java.util.ArrayList;

public class CompareData {
    public static ArrayList<String> pemisahInput(ArrayList<String> arrInputKalimat){
        ArrayList<String> baru = new ArrayList<String>();
        String[] arrInput = arrInputKalimat.get(1).split(", ");
        for (int i = 0; i < arrInput.length; i++) {
            baru.add(arrInput[i]);
        }
        return baru; 
    }

    public static void compareDataNomer(ArrayList<String> dataBase, ArrayList<String> yangDiCek){
        ArrayList<String> terdata = new ArrayList<String>();
        System.out.println(dataBase);
        
        for (int i = 0; i < dataBase.size(); i++) {
            for (int j = 0; j < yangDiCek.size(); j++) {
                if (yangDiCek.get(j).equals(dataBase.get(i))) {
                    terdata.add(yangDiCek.get(j));
                    yangDiCek.remove(j);
                }
            }
        }

        System.out.println("TERDATA : ");
        for (int i = 0; i < terdata.size(); i++) {
            System.out.println(terdata.get(i));
        }


        System.out.println("\nBELUM TERDATA : ");
        for (int i = 0; i < yangDiCek.size(); i++) {
            System.out.println(yangDiCek.get(i));
        }
    }
}
