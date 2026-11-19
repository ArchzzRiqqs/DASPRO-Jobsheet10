
import java.util.Scanner;

public class BioskopWithScanner29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int pilihan;

        do {
            System.out.println("\nMENU BIOSKOP");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan nama: ");
                String nama = sc.nextLine();

                boolean berhasil = false;

                while (!berhasil) {
                    System.out.print("Masukkan baris: ");
                    int baris = sc.nextInt();

                    System.out.print("Masukkan kolom: ");
                    int kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > penonton.length) {
                        System.out.println("Nomor baris tidak tersedia!");
                    } else if (kolom < 1 || kolom > penonton[baris - 1].length) {
                        System.out.println("Nomor kolom tidak tersedia!");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi!");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data berhasil disimpan.");
                        berhasil = true;
                    }
                }

            } else if (pilihan == 2) {
                System.out.println("\nDAFTAR PENONTON");

                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }

            } else if (pilihan == 3) {
                System.out.println("Program selesai.");

            } else {
                System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 3);

        sc.close();
    }
}