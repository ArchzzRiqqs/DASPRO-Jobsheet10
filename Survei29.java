
import java.util.Scanner;

public class Survei29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int JUMLAH_RESPONDEN = 10;
        final int JUMLAH_PERTANYAAN = 6;
        int[][] jawaban = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];
        int totalKeseluruhan = 0;

        for (int i = 0; i < jawaban.length; i++) {
            System.out.println("\nResponden ke-" + (i + 1));

            for (int j = 0; j < jawaban[i].length; j++) {
                int nilai;

                do {
                    System.out.print("Pertanyaan ke-" + (j + 1) + " (1-5): ");
                    nilai = sc.nextInt();

                    if (nilai < 1 || nilai > 5) {
                        System.out.println("Jawaban harus antara 1 sampai 5!");
                    }
                } while (nilai < 1 || nilai > 5);

                jawaban[i][j] = nilai;
                totalKeseluruhan += nilai;
            }
        }

        System.out.println("\nRATA-RATA RESPONDEN");

        for (int i = 0; i < jawaban.length; i++) {
            int total = 0;

            for (int j = 0; j < jawaban[i].length; j++) {
                total += jawaban[i][j];
            }

            double rata = (double) total / jawaban[i].length;
            System.out.println("Responden ke-" + (i + 1) + ": " + rata);
        }

        System.out.println("\nRATA-RATA PERTANYAAN");

        for (int j = 0; j < jawaban[0].length; j++) {
            int total = 0;

            for (int i = 0; i < jawaban.length; i++) {
                total += jawaban[i][j];
            }

            double rata = (double) total / jawaban.length;

            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rata);
        }

        double rataKeseluruhan = (double) totalKeseluruhan / (JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN);

        System.out.println("\nRATA-RATA KESELURUHAN");
        System.out.println("Rata-rata survei: " + rataKeseluruhan);

        sc.close();
    }
}
