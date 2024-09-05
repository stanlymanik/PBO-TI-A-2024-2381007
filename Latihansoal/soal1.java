package soal1;
import  java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        int[] bilangan = new int[2];
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Bilangan Pertama : ");
        bilangan[0] = input.nextInt();

        System.out.println("Masukan BIlangan Kedua :");
        bilangan[1] = input.nextByte();

        if (bilangan[1] > bilangan[0]) {
            System.out.println(bilangan[1]);
        }else {
            System.out.println(bilangan[0]);
        }
    }
}
