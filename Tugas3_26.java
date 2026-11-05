import java.util.Scanner;

public class Tugas3_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko <= 0) {
            System.out.println("Jumlah toko harus minimal 1.");
        } else {
            int totalBarangSeluruhToko = 0;
            int maxBarangToko = -1;
            int tokoTerbanyak = 0;
            
            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("--- Toko " + i + " ---");
                System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + ": ");
                int jumlahPelanggan = sc.nextInt();

                int totalBarangToko = 0;

                for (int j = 1; j <= jumlahPelanggan; j++) {
                    System.out.print("  Masukkan jumlah barang yang dibeli oleh pelanggan " + j + ": ");
                    int barangPelanggan = sc.nextInt();

                    while (barangPelanggan < 0) {
                        System.out.print("  Jumlah barang tidak boleh negatif. Ulangi: ");
                        barangPelanggan = sc.nextInt();
                    }
                    totalBarangToko += barangPelanggan;
                }

                totalBarangSeluruhToko += totalBarangToko;

                System.out.println("Toko " + i + " -> pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

                if (totalBarangToko > maxBarangToko) {
                    maxBarangToko = totalBarangToko;
                    tokoTerbanyak = i;
                }
            }

            System.out.println("Total barang seluruh toko    : " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak : " + tokoTerbanyak);
        }
        sc.close();
    }
}