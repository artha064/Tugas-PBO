// Program ini menggunakan implementasi HashSet untuk mencari irisan antara 10 digit pertama bil. ganjil 
// dengan 10 digit pertama bilangan prima.
import java.util.*;
public class ImplementasiSet {
    public static void main(String[] args) {
        //Mendeklarasikan set bilanganGanjil.
        Set<Integer> bilanganGanjil = new HashSet<>();
        //Memasukkan 10 digit pertama bilangan ganjil ke set bilanganGanjil.
        Collections.addAll(bilanganGanjil, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19);

        //Mendeklarasikan set bilanganPrima.
        Set<Integer> bilanganPrima = new HashSet<>();
        //Memasukkan 10 digit pertama bilangan ganjil ke set bilanganGanjil.
        Collections.addAll(bilanganPrima, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        //Mendeklarasikan set yang akan menyimpan irisan
        Set<Integer> irisan = new HashSet<>();
        //Melakukan irisan.
        bilanganGanjil.retainAll(bilanganPrima);
        //Menyimpan irisan pada set irisan.
        irisan.addAll(bilanganGanjil);
        System.out.println("Irisan antara 10 digit pertama bil.ganjil dengan 10 digit pertama bil. prima : ");
        System.out.println(irisan);        
    }
}
