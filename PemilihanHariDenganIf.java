import java.util.Scanner;

public class PemilihanHariDenganIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Deklarasi
        int day;
        String dayType = "", dayName = "";
        
        System.out.println("Pilih hari ke: \n1.monday\n2.tuesday\n3.wednesday\n4.thursday\n5.friday\n6.saturday\n7.sunday");
        System.out.print("Masukkan pilihan anda: ");
        day = input.nextInt();
        
        if(day == 1) {
            dayName = "monday";
            dayType = "Weekday";
        } else if(day == 2) {
            dayName = "tuesday";
            dayType = "Weekday";
        } else if(day == 3) {
            dayName = "wednesday";
            dayType = "Weekday";
        } else if(day == 4) {
            dayName = "thursday";
            dayType = "Weekday";
        } else if(day == 5) {
            dayName = "friday";
            dayType = "Weekday";
        } else if(day == 6) {
            dayName = "saturday";
            dayType = "Weekend";
        } else if(day == 7) {
            dayName = "sunday";
            dayType = "Weekend";
        } else {
            dayType = "Invalid Number";   // Akan dijalankan jika input tidak sesuai range [1-7]
        }
        
        if(!dayType.equals("Invalid Number")) {
            System.out.printf("%s is a %s", dayName, dayType);
        } else {
            System.out.println(dayType);
        }
        
        input.close();
    }
}