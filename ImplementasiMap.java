// Program ini menggunakan implementasi HashMap untuk menyimpan value berupa nama negara
// dan key berupa kode iso-nya.
import java.util.*;
public class ImplementasiMap {
    public static void main(String[] args) {
        int pilihan;
        char opsiMenu = 't'; 
        String nama_negara, kode_iso;
        Scanner scan = new Scanner(System.in);
        Map<String,String> isoNegara = new HashMap<>();
        do{
            System.out.println("\nSelamat datang di program penyimpanan nama negara berdasarkan kode iso!");
            System.out.println("Silahkan pilih operasi yang anda inginkan : ");
            System.out.println("1) Menambah pasangan kode iso dan nama negara.");
            System.out.println("2) Menghapus nama negara berdasarkan kode iso-nya.");
            System.out.println("3) Melihat kode iso beserta nama negara yang tersimpan.");
            System.out.printf("Pilihan saya : ");
            pilihan = scan.nextInt();
            do {
                switch(pilihan){
                    case 1:
                        //Menangkap input enter agar input tsb tidak masuk ke nama_buah.
                        scan.nextLine();
                        System.out.printf("\nMasukkan kode iso (Alpha-2 / 2 Digit) : ");
                        kode_iso = scan.nextLine();
                        System.out.printf("\nMasukkan nama negara : ");
                        nama_negara = scan.nextLine();
                        isoNegara.put(kode_iso, nama_negara);
                        System.out.println("Apakah anda ingin kembali ke menu utama ? (y/t)");
                        System.out.printf("Pilihan saya : ");
                        //Cara agar java bisa menangkap data char tunggal.
                        opsiMenu = scan.next().charAt(0);
                        break;
                    case 2:
                        scan.nextLine();
                        System.out.printf("\nMasukkan kode iso negara yang ingin dihapus (Alpha-2 / 2 Digit) : ");
                        kode_iso = scan.nextLine();
                        isoNegara.remove(kode_iso);
                        System.out.println("Apakah anda ingin kembali ke menu utama ? (y/t)");
                        System.out.printf("Pilihan saya : ");
                        //Cara agar java bisa menangkap data char tunggal.
                        opsiMenu = scan.next().charAt(0);
                        break;                        
                    case 3:
                        scan.nextLine();
                        System.out.println("\nDaftar nama buah yang tersimpan : " + isoNegara);
                        System.out.println("Apakah anda ingin kembali ke menu utama ? (y/t)");
                        System.out.printf("Pilihan saya : ");
                        //Cara agar java bisa menangkap data char tunggal.
                        opsiMenu = scan.next().charAt(0);                        
                        break;
                    default:
                        System.out.println("Pilihan yang anda masukkan tidak valid.");
                        System.out.println("Apakah anda ingin kembali ke menu utama ? (y/t)");
                        System.out.printf("Pilihan saya : ");
                        //Cara agar java bisa menangkap data char tunggal.
                        opsiMenu = scan.next().charAt(0);                      
                }                
            } while (opsiMenu == 't');
        }while(opsiMenu == 'y');
        scan.close();        
    }
}
