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
            System.out.print("wa.me/");
            if (arrInputKalimat.get(i).charAt(0) == '0') {
                System.out.println("62" + arrInputKalimat.get(i).substring(1));
                continue;
            }
            System.out.println(arrInputKalimat.get(i));
        }
    }

    public static ArrayList<String> imbuhDepanBelakang(ArrayList<String> arrInputKalimat){
        System.out.println("Menu Imbuhan :");
        System.out.println("1. Depan\n2. Belakang\n3.Depan dan Belakang");

        int menu = Menu.sc.nextInt();
        Menu.sc.nextLine();

        String imbuh2 = "";
        
        System.out.println("Masukkan apa yang ingin diimbuh : ");
        String imbuh = Menu.sc.nextLine();

        if (menu == 3) {
            System.out.println("Masukkan imbuhan dibelakang : ");
            imbuh2 = Menu.sc.nextLine();
        }

        for (int i = 0; i < arrInputKalimat.size(); i++) {
            switch (menu) {
                case 1:
                    arrInputKalimat.set(i, imbuh + arrInputKalimat.get(i));
                    break;
                case 2:
                    arrInputKalimat.set(i, arrInputKalimat.get(i) + imbuh);
                    break;
                case 3:
                    arrInputKalimat.set(i, imbuh + arrInputKalimat.get(i) + imbuh2);
                    break;
            
                default:
                    break;
            }
            
        }
        return arrInputKalimat;
    }
}
