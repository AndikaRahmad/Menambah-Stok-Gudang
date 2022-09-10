import java.util.Scanner;

public class Tp1No4 {
    public static void main(String[] args) {
        String emoji_banyak ="\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665";
        String emoji_satu ="\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665";
        String emoji_dua ="\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665";
        Scanner input = new Scanner(System.in);

        //Input seluruh nilai variabel
        String namaPria, namaWanita;
        int nilaiAcak, umurPria, umurWanita;
        double hasil;

        System.out.println("Selamat Datang di Program Ramalan Cupu");
        System.out.println(emoji_banyak);
        System.out.println();

        //input personal data
        System.out.println("Data Anda :");
        System.out.println(emoji_satu);
        System.out.print("Masukan Nama Anda  : ");
        namaPria = input.nextLine();
        System.out.print("Masukan Umur Anda  : ");
        umurPria = Integer.parseInt(input.nextLine());
        System.out.println();

        //input data pasangan
        System.out.println("Data Pasangan Anda :");
        System.out.println(emoji_dua);
        System.out.print("Masukan Nama Pasangan Anda  : ");
        namaWanita = input.nextLine();
        System.out.print("Masukan Umur Pasangan Anda  : ");
        umurWanita = Integer.parseInt(input.nextLine());
        System.out.println();

        //output yang dihasilkan
        System.out.println(namaPria +  " [" + umurPria + "] " +  "Tahun");
        System.out.println("\n  \u2665\u2665\u2665    \u2665\u2665\u2665");
        System.out.println(" \u2665\u2665\u2665\u2665\u2665  \u2665\u2665\u2665\u2665\u2665");
        System.out.println("\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665");
        System.out.println(" \u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665");
        System.out.println("   \u2665\u2665\u2665\u2665\u2665\u2665\u2665\u2665");
        System.out.println("     \u2665\u2665\u2665\u2665");
        System.out.println("      \u2665\u2665\n");
        System.out.println(namaWanita +  " [" + umurWanita + "] " +  "Tahun");
        System.out.println();

        //Hasil
        System.out.println("Tekan ENTER untuk melihat hasil ramalan.....");
        String klikEnter = input.nextLine();
        System.out.print(klikEnter);
        nilaiAcak = 50 + (int)(Math.random() * 50);
        hasil = (nilaiAcak/1.1);
        System.out.println();
        System.out.println("kecocokan Anda dengan Pasangan anda adalah :" + String.format("%.2f", hasil) + "%" );
        System.out.println();
        System.out.println("Terimakasih karena anda telah menggunkan jasa Ramalan kami....^^ ");

    }
}

