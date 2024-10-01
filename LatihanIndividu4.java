import java.util.Scanner;

public class LatihanIndividu4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Variabel
        int usia;
        String kategoriUsia;

        //Input user
        System.out.print("Masukkan usia anda: ");
        usia = sc.nextInt();

        //Menghitung kategori usia
        if (usia >= 0 && usia <= 12) {
            kategoriUsia = "Anak-anak";
        }
        else if (usia >= 13 && usia <= 19) {
            kategoriUsia = "Remaja";
        }
        else if (usia >= 20 && usia <= 64) {
            kategoriUsia = "Lansia";
        }
        else {
            kategoriUsia = "Input tidak valid";
        }

        //Output
        System.out.println("Usia anda: " + usia + "Tahun");
        System.out.println("Kategori usia: " + kategoriUsia);
    }
}