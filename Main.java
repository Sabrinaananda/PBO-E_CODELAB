import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        String nama;
        String jenisKelamin;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda : ");
        nama = scan.nextLine();

        System.out.print("Jenis Kelamin (L/P) : ");
        jenisKelamin = scan.nextLine();

        if (jenisKelamin.equalsIgnoreCase("L")) {
            jenisKelamin = "Laki-Laki";
        } else if (jenisKelamin.equalsIgnoreCase("P")) {
            jenisKelamin = "Perempuan";
        } else {
            jenisKelamin = "Jenis Kelamin Tidak di Ketahui";
        }

        System.out.print("Tanggal Lahir (yyyy-mm-dd) : ");
        String inputTanggal = scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate tanggalLahir = LocalDate.parse(inputTanggal, formatter);
        LocalDate hariIni = LocalDate.now();

        Period selisih = Period.between(tanggalLahir, hariIni);
        int tahun = selisih.getYears();
        int bulan = selisih.getMonths();

        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umur Anda " + tahun + " tahun " + bulan + " bulan ");
    }
}