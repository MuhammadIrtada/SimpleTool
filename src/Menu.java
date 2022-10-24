import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        menu();
    }

    public static void menu(){
        tampilMenu();
        int inputMenu = sc.nextInt();
        int inputLoop;
        do {
            switch (inputMenu) {
                case 0:
                    System.out.println("=====SELESAI=====");
                    System.exit(0);
                    break;
                case 1:
                    HilangChar.hilangAngka(himpunInputKalimat());
                    break;

                case 2:
                    HilangChar.hilangNomorDepan(himpunInputKalimat());
                    break;
            
                case 3:
                    RubahKarakter.jadiCamelCase(himpunInputKalimat());
                    break;
                
                case 4:
                    NewLine.hilangNewLine(himpunInputKalimat());
                    break;

                case 5:
                    BuatImbuhan.boxSiku(himpunInputKalimat());
                    break;

                case 6:
                    BuatImbuhan.convertLinkInstagram(himpunInputKalimat());
                    break;

                case 7:
                    BuatImbuhan.convertLinkWhattsapp(himpunInputKalimat());
                    break;

                case 8:
                    CompareData.compareDataNomer(RubahKarakter.flatNumber(CompareData.pemisahInput(himpunInputKalimat())), himpunInputKalimat());                   
                    break;
    
                default:
                    System.out.println("Pilihan tidak sesuai menu");
                    break;
            }
            System.out.println("\nApakah mau melakukan loop fitur?(0/1) ");
            inputLoop = sc.nextInt();
            if (inputLoop == 0) {
                menu();
                break;
            }
        }while (true);
    }

    public static ArrayList<String> himpunInputKalimat(){
        ArrayList<String> arrInputKalimat = new ArrayList<String>();
        System.out.println("Masukkan Kalimat Anda! Ketik 'Stop' untuk mengakhiri\n");

        while(true){
            String inputKalimat = sc.nextLine();
            if (inputKalimat.equals("stop")) {
                System.out.println();
                break;
            }
            arrInputKalimat.add(inputKalimat);
        }

        return arrInputKalimat;
    }

    public static void tampilMenu() {
        String[] menus = {
            "=====START=====",
            "Hilang NIM/Angka",
            "Hilang nomor depan dengan titik",
            "Buat camelcase dengan spasi",
            "Menghilangkan New Line",
            "Buat Box",
            "Convert id to link IG",
            "Convert nomor to link WA",
            "Pembanding Nomor HP",
            "Keluar",
            "Masukkan Pilihan Anda!"
        };

        for (int i = 0; i < menus.length; i++) {
            if (i == 0 || i == menus.length - 1) {
                System.out.println(menus[i]);
                continue;
            }
            if (i == menus.length - 2) {
                System.out.println("0. " + menus[i]);
                continue;
            }
            System.out.println(i + ". " + menus[i]);
        }
        
    }
}
