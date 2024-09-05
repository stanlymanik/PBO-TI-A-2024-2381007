public class Perbandingan {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean hasilSamaDengan = (a == b);
        System.out.println("a ==b:" + hasilSamaDengan);

        boolean hasilTidakSamaDengan = (a != b);
        System.out.println("a != b: " + hasilTidakSamaDengan);

        boolean hasilLebihBesarDari = (a > b);
        System.out.println("a > b:" + hasilLebihBesarDari);

        boolean hasillebihkecildari = (a< b);
        System.out.println("a <= b:" + hasillebihkecildari);

        boolean hasillebihbesardarisamadengan = (a>= b);
        System.out.println("a >= b:" + hasillebihbesardarisamadengan);

        boolean hasillebihkecilsamadengan = (a <= b);
        System.out.println("a <= b: " + hasillebihkecilsamadengan);
    }
}
