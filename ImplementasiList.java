// Program ini menggukanan implementasi ArrayList untuk menyimpan nama buah-buahan.
import java.util.*;
public class ImplementasiList {
    public static void main(String[] args) {
        int pilihan;
        char opsiMenu = 't'; 
        String nama_buah;
        // Mendeklarasikan collection bernama buah sekaligus melakukan alokasi memori.
        List<String> buah = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("\nSelamat datang di program penyimpanan nama buah!");
            System.out.println("Silahkan pilih operasi yang anda inginkan : ");
            System.out.println("1) Menambah nama buah.");
            System.out.println("2) Menghapus nama buah.");
            System.out.println("3) Melihat daftar nama buah.");
            System.out.printf("Pilihan saya : ");
            pilihan = scan.nextInt();
            do {
                switch(pilihan){
                    case 1:
                        //Menangkap input enter agar input tsb tidak masuk ke nama_buah.
                        scan.nextLine();
                        System.out.printf("\nMasukkan nama buah : ");
                        nama_buah = scan.nextLine();
                        buah.add(nama_buah);
                        System.out.println("Apakah anda ingin kembali ke menu utama ? (y/t)");
                        System.out.printf("Pilihan saya : ");
                        //Cara agar java bisa menangkap data char tunggal.
                        opsiMenu = scan.next().charAt(0);
                        break;
                    case 2:
                        scan.nextLine();
                        System.out.printf("\nMasukkan nama buah yang ingin dihapus : ");
                        nama_buah = scan.nextLine();
                        buah.remove(nama_buah);
                        System.out.println("Apakah anda ingin kembali ke menu utama ? (y/t)");
                        System.out.printf("Pilihan saya : ");
                        //Cara agar java bisa menangkap data char tunggal.
                        opsiMenu = scan.next().charAt(0);
                        break;                        
                    case 3:
                        scan.nextLine();
                        System.out.println("\nDaftar nama buah yang tersimpan : " + buah);
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
