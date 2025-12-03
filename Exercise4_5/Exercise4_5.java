/*
 * Ad Soyad: MEHMET TALHA KAYA
 * Ogrenci No: 250542009
 * Tarih: 03.12.2025
 */

public class Exercise4_5 {

     public static void zoop(String fred, int bob) {
        System.out.println(fred);          // zoop: önce gelen string'i ekrana yazar
        if (bob == 5) {                    // bob 5 ise ping çağrılacak
            ping(" not ");                 // ping metodu çağrılır
        } else {
            System.out.println("!");       // bob 5 değilse sadece "!" yazılır
        }
    }

    public static void main(String[] args) {
        int bizz = 5;                      // bizz = 5
        int buzz = 2;                      // buzz = 2

        zoop(" just for ", bizz);          // 1. zoop çağrısı: fred=" just for ", bob=5
        clink(2 * buzz);                   // clink(4) çağrılır
    }

    public static void clink(int fork) {
        System.out.print("It ’s ");        // "It's " yazılır (aynı satırda kalır)
        zoop(" breakfast ", fork);         // 2. zoop çağrısı: fred=" breakfast ", bob=4
    }

    public static void ping(String strangStrung) {
        System.out.println(" any " + strangStrung + " more ");  
                                           // ping: verilen string'i bir cümlede yazar
    }
}
