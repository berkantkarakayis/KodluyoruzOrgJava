/*
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360
*/

import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        int r,a;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz : ");
        r = inp.nextInt();
        Scanner inp1 = new Scanner(System.in);
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz : ");
        a = inp1.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double daireDilimiAlan = (pi * (r * r) * a) / 360;

        System.out.println("Dairenin alanı : "+alan);
        System.out.println("Dairenin çevresi : "+cevre);
        System.out.println("Daire diliminin alanı : "+daireDilimiAlan);
    }
}
