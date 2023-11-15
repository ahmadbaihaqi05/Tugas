import java.util.Scanner;

public class ReverseBilangan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] bilangan = new int[n];
        for (int i = 0; i < n; i++) {
            bilangan[i] = scn.nextInt();
        }

        int jumlah = 0;
        for (int i = 0; i < n; i++) {
            jumlah += reverse(bilangan[i]);
        }

        int hasilReverse = reverse(jumlah);
        System.out.println(hasilReverse);
    }

    public static int reverse(int num) {
        int balik = 0;
        while (num != 0) {
            int bilangan = num % 10;
            balik = balik * 10 + bilangan;
            num /= 10;
        }
        return balik;
    }
}
