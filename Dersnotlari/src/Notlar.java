import java.util.Scanner;
public class Notlar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik, fizik, turkce, kimya, muzik;

        System.out.println("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();
        if (matematik<100){}
        else {
            while (matematik>100){
                System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz.");
                matematik = input.nextInt();
            }
        }

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        if (turkce<100){}
        else {
            while (turkce>100){
                System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz.");
                turkce = input.nextInt();
            }
        }
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if (fizik<100){}
        else {
            while (fizik>100){
                System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz.");
                fizik = input.nextInt();
            }
        }
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if (kimya<100){}
        else {
            while (kimya>100){
                System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz.");
                kimya = input.nextInt();
            }
        }
        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if (muzik<100){}
        else {
            while (muzik>100){
                System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz.");
                muzik = input.nextInt();
            }
        }

        double average = (matematik+fizik+turkce+kimya+muzik)/5;

        if (average<55){
            System.out.println("Kaldınız.");
        }
        else
            System.out.println("Geçtiniz.");
    }
}
