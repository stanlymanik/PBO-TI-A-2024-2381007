import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1 = input.nextDouble();

        System.out.println("Masukkan angka ke - 1 : ");
        double angka2 = input.nextDouble();

        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulus");
        int hasil = input.nextInt();

        switch (hasil){
            case 1 :
                System.out.println(angka1 + angka2);
                break;
            case 2 :
                System.out.println(angka1 - angka2);
                break;
            case 3 :
                System.out.println(angka1 * angka2);
                break;
            case 4:
                System.out.println(angka1 / angka2);
                break;
            case 5:
                System.out.println(angka1 % angka2);
                break;
            default :
                System.out.println("Masukkan angka yang betul ");
                break;
        }
    }
}
