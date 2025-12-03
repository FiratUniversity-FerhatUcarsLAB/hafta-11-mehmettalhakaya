/*
 * Ad Soyad: MEHMET TALHA KAYA
 * Ogrenci No: 250542009
 * Tarih: 03.12.2025
 */

public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        // a * b + c işlemini yapar
        return a * b + c;
    }

    public static double expSum(double x) {
        // expSum(x) = x * e^(-x) + sqrt(1 - e^(-x))
        double expNegX = Math.exp(-x);             // e^(-x)
        return multadd(x, expNegX, Math.sqrt(1 - expNegX));
    }

    public static void main(String[] args) {

        // 1) sin(pi/4) + cos(pi/4) / 2 -> multadd ile
        double result1 = multadd(
                Math.sin(Math.PI / 4),             // a
                1.0,                                // b = 1
                Math.cos(Math.PI / 4) / 2           // c
        );
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + result1);

        // 2) log(10) + log(20)
        double result2 = multadd(
                Math.log(10),                       // a
                1.0,                                // b = 1
                Math.log(20)                        // c
        );
        System.out.println("log(10) + log(20) = " + result2);

        // 3) expSum(x) testleri
        double x1 = 1.0;
        System.out.println("expSum(" + x1 + ") = " + expSum(x1));

        double x2 = 2.0;
        System.out.println("expSum(" + x2 + ") = " + expSum(x2));
    }
}
