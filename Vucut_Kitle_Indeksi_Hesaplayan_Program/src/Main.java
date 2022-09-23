/*
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının
"Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Kilo (kg) / (Boy(m) * Boy(m))
 */

import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        double boy,kilo;

        Scanner inp = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz : ");
        boy = inp.nextDouble();
        Scanner inp1 = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz : ");
        kilo = inp1.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : "+vki);
    }
}
