import java.util.Scanner;

public class manavHesap {
    public static void main(String[] args) {

        double akg = 2.14, ekg = 3.67, dkg = 1.11, mkg = 0.95, pkg = 5.00;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ekrana Kaç Kilo Armut Aldığınızı Giriniz:");
        akg *= inp.nextDouble();
        System.out.print("Ekrana Kaç Kilo Elma Aldığınızı Giriniz:");
        ekg *= inp.nextDouble();
        System.out.print("Ekrana Kaç Kilo Domates Aldığınızı Giriniz:");
        dkg *= inp.nextDouble();
        System.out.print("Ekrana Kaç Kilo Muz Aldığınızı Giriniz:");
        mkg *= inp.nextDouble();
        System.out.print("Ekrana Kaç Kilo Patlıcan Aldığınızı Giriniz:");
        pkg *= inp.nextDouble();


        double toplam = akg + ekg + dkg + mkg + pkg;
        System.out.println("Toplam Fiyat: " + toplam);


    }
}
