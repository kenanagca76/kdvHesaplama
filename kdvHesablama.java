package kdvHesaplama;
import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        /*
        KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin 
KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , 
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */
        
        double tutar;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Kdv hesaplanacak Tutarı giriniz : ");
        tutar = scanner.nextDouble();

        double kdvOrani;
        if (tutar <= 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        double kdvTutari = tutar * kdvOrani;
        double toplamTutar = tutar + kdvTutari;

        System.out.println("KDV'siz Fiyat = " + tutar);
        System.out.println("KDV Oranı: " + (kdvOrani * 100) + " %");
        System.out.println("KDV Tutarı: " + kdvTutari + " TL");
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
    }
}
