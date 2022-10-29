import java.util.ArrayList;

public class RubahKarakter {
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

    public static ArrayList<String> flatNumber(ArrayList<String> arrInputKalimat){
        ArrayList<String> baru = new ArrayList<String>();
        System.out.println(arrInputKalimat);
        
        for (int i = 0; i < arrInputKalimat.size(); i++) {
            String nomer = "0";
            for (int j = 4; j < arrInputKalimat.get(i).length(); j++) {
                if (arrInputKalimat.get(i).charAt(j) != '-') {
                    nomer += arrInputKalimat.get(i).substring(j, j+1);
                }
            }
            baru.add(nomer);
        }
        System.out.println(baru);
        return baru;
    }  
    
    public static ArrayList<String> replaceString(){
        System.out.println("Masukkan string yang ingin dirubah : ([before] -> [after])");
        ArrayList<String> diubah = Menu.himpunInputKalimat();

        System.out.println("Kalimat yang ingin dirubah : ");
        ArrayList<String> terubah = Menu.himpunInputKalimat();


        for (int i = 0; i < diubah.size(); i++) {
            
            String[] change = diubah.get(i).split(" -> ");
            for (int j = 0; j < terubah.size(); j++) {
                terubah.set(j, terubah.get(j).replaceAll(change[0], change[1]));
            }
        }
        return terubah;
    }

    public static ArrayList<String> replaceIncrement(ArrayList<String> arrInputKalimat){
        System.out.println("Masukkan apa yang ingin dirubah : ");
        String replace = Menu.sc.nextLine();
        for (int i = 0; i < arrInputKalimat.size(); i++) {
            arrInputKalimat.set(i, arrInputKalimat.get(i).replaceAll(replace, "" + (i + 1)));
        }
        return arrInputKalimat;
    }
}
