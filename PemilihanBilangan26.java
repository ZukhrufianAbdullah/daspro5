import java.util.Scanner;

public class PemilihanBilangan26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        String tenary = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.printf("Angka %s termasuk bilangan %s",angka, tenary);
    }
}