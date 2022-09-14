import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri Oluşturuyoruz.

        int mat,fizik,kimya,turkce,tarih,muzik;

        // Scanner sınıfımızı tanımlıyoruz.

        Scanner inp= new Scanner(System.in);

        // kullanıcıdan değerleri alıyoruz.
        System.out.print("Matematik Notunuz:");
        mat= inp.nextInt();
        System.out.print("Fizik Notunuz:");
        fizik= inp.nextInt();
        System.out.print("Kimya Notunuz:");
        kimya=inp.nextInt();
        System.out.print("Türkçe Notunuz:");
        turkce=inp.nextInt();
        System.out.print("Tarih Notunuz:");
        tarih=inp.nextInt();
        System.out.print("Müzik Notunuz:");
        muzik=inp.nextInt();
        int toplam=(mat+fizik+kimya+turkce+muzik+tarih);
        double sonuc= toplam/6;
        System.out.println("Ortalamanız :" + sonuc);

        boolean sonuc2=(sonuc>60);
        String xrm2= sonuc2 ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(xrm2);





    }

}