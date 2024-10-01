import java.util.Scanner;

public class SIAKAD26 {

    public static void main(String[] args) {
        //Deklarasi scanner
        Scanner sc = new Scanner(System.in);

        //Deklrasi variabel
       String nama, nim;
       byte absen;
       double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
       char kelas;


       //Data Mahasiswa
       System.out.print("Masukkan nama\t: ");
       nama = sc.nextLine();
       System.out.print("Masukkan NIM\t: ");
       nim = sc.nextLine();
       System.out.print("Masukkan kelas\t: ");
       kelas = sc.nextLine().charAt(0);
       System.out.print("Masukkan nomor absen: ");
       absen = sc.nextByte();
       System.out.print("Masukkan nilai kuis: ");
       nilaiKuis = sc.nextDouble();
       System.out.print("Masukkan nilai tugas: ");
       nilaiTugas = sc.nextDouble();
       System.out.print("Masukkan nilai ujian: ");
       nilaiUjian = sc.nextDouble();

       //Hitung nilai akhir
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        //Hitung nilai huruf
        String nilaiHuruf, kualifikasi;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat baik";
        }
        else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari baik";
        }
        else if (nilaiAkhir > 65 && nilaiAkhir <= 73 ) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        }
        else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari cukup";
        }
        else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        }
        else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        }
        else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }
        else {
            nilaiHuruf = "Invalid";
            kualifikasi = "Kualifikasi";
        }

        //Output
       System.out.println("Nama: " + nama + " NIM: " + nim);
       System.out.println("Kelas: " + kelas + " Absen: " + absen);
       System.out.println("Nilai akhir: " + nilaiAkhir);
       System.out.println("Nilai akhir huruf: " + nilaiHuruf);
       System.out.println("Kualifikasi: " + kualifikasi);
    }
}