/*
 * Ad Soyad: MEHMET TALHA KAYA
 * Ogrenci No: 250542009
 * Tarih: 03.12.2025
 */

public class Exercise4_2 {

    // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) {
        zippo("rattle", 13);              // zippo ilk kez çağrılır
    }

    public static void baffle(String blimp) {
        System.out.println(blimp); // blimp ekrana basılır
        zippo("ping", -5); // zippo ikinci kez çağrılır
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) { // ikinci zippo çağrısında bu blok çalışır
            System.out.println(quince + " zoop ");  // flag 0'dan küçükse quince + zoop yazdırılır
        } else {
            System.out.println("ik"); // ilk zippo’da çalışır (ve ik yazdırılır)
            baffle(quince); // baffle çağrılır
            System.out.println("boo-wa-ha-ha"); // baffle’dan dönünce çalışır (boo-wa-ha-ha yazdırılır)
        }
    }
}
