import java.util.Scanner;

public class PenitipanBarang {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int jumlahBarang = scn.nextInt();

        String[] barang = new String[jumlahBarang];

        int pointer = 0;
        int counter = 0;

        for (int i = 0; i < jumlahBarang; i++) {
            String namaBarang = scn.next();

            if (!isBarangDilarang(namaBarang)) {
                barang[pointer] = namaBarang;
                pointer++;
            } else {
                counter++;
            }
        }

        if (pointer == 0) {
            System.out.println("Tidak ada barang di semua loker!");
        } else {
            System.out.println("List Barang :");
            for (int i = 0; i < pointer; i++) {
                System.out.println((i + 1) + ". " + barang[i] + " pada loker ke-" + i);
            }
        }
    }

    public static boolean isBarangDilarang(String namaBarang) {
        return namaBarang.equalsIgnoreCase("pedang") ||
               namaBarang.equalsIgnoreCase("racun") ||
               namaBarang.equalsIgnoreCase("narkoba");
    }
}
