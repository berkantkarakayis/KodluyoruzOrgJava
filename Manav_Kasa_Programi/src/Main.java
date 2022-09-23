/*
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */

import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        double armut =2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double armutMiktari,elmaMiktari,domatesMiktari,muzMiktari,patlicanMiktari;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kaç kg : ");
        armutMiktari = inp.nextDouble();

        Scanner inp1 = new Scanner(System.in);
        System.out.print("Elma kaç kg : ");
        elmaMiktari = inp1.nextDouble();

        Scanner inp2 = new Scanner(System.in);
        System.out.print("Domates kaç kg : ");
        domatesMiktari = inp2.nextDouble();

        Scanner inp3 = new Scanner(System.in);
        System.out.print("Muz kaç kg : ");
        muzMiktari = inp3.nextDouble();

        Scanner inp4 = new Scanner(System.in);
        System.out.print("Patlıcan kaç kg : ");
        patlicanMiktari = inp4.nextDouble();

        armut *= armutMiktari;
        elma *= elmaMiktari;
        domates *= domatesMiktari;
        muz *= muzMiktari;
        patlican *= patlicanMiktari;

        double toplamTutar;
        toplamTutar = armut + elma + domates + muz + patlican;

        System.out.println("Toplam tutar : "+toplamTutar + "TL");
    }
}
