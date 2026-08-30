import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rastgele = new Random();
        int sayi = rastgele.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int tahmin = 0;
        int deneme = 0;

        System.out.println("1 ile 100 arasında bir sayı tuttum, tahmin et!");

        while (tahmin != sayi) {
            System.out.print("Tahminin: ");
            tahmin = scanner.nextInt();
            deneme++;

            if (tahmin > sayi) {
                System.out.println("Daha küçük söyle");
            } else if (tahmin < sayi) {
                System.out.println("Daha büyük söyle");
            } else {
                System.out.println("Bildin! " + deneme + " denemede buldun.");
            }
        }

        scanner.close();
    }
}