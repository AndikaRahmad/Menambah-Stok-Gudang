import java.util.Scanner;
import java.text.DecimalFormat;

class Tp1Programing {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.print("Masukan nama anda : ");
        String nama;
        nama = input.nextLine();
        System.out.println();
        System.out.println("Stok gudang input barang");
        System.out.println("##########################");
        System.out.println();
        System.out.println("Selamat Datang "  + nama);
        System.out.print("Masukan nama barang yang mau ditambah : ");
        String namaBarang;
        namaBarang = input.nextLine();
        System.out.print("Masukan jumlah barang yang mau ditambah : ");
        int jumlahBarang;
        jumlahBarang = Integer.parseInt(input.nextLine());
        System.out.print("Masukan harga beli untuk barang tersebut : ");
        double hargaBeli;
        hargaBeli = Double.parseDouble(input.nextLine());
        System.out.print("Masukan harga jual barang tersebut : ");
        double hargaJual;
        hargaJual = Double.parseDouble(input.nextLine());
        System.out.println();
        System.out.println("Stok gudang rincian barang");
        System.out.println("###########################");
        System.out.println();
        System.out.println("Nama Barang   :" + namaBarang);
        System.out.println("Jumlah Barang :" + jumlahBarang);
        System.out.println("Harga Beli    :Rp." + df.format(hargaBeli));
        System.out.println("Harga Jual    :Rp." + df.format(hargaJual));

    }
}


