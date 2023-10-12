import java.util.Scanner;

public class Latihan4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kota = sc.nextLine();
        int jumlah = sc.nextInt();

        int hargaJakarta = jumlah * 145000;
        int hargaBogor = jumlah * 200000;
        int hargaGarut = jumlah * 75000;
        int hargaPurwakarta = jumlah * 75000;

        switch (kota) {
            case "Jakarta":
                System.out.println(hargaJakarta);
                break;
            case "Bogor":
                if (hargaBogor > 250000) {
                    hargaBogor = hargaBogor - (hargaBogor * 10 / 100);
                    System.out.println(hargaBogor);
                } else {
                    System.out.println(hargaBogor);
                }
                break;
            case "Garut":
                System.out.println(hargaGarut);
                break;
            case "Purwakarta":
                System.out.println(hargaPurwakarta);
                break;
        }
    }
}
