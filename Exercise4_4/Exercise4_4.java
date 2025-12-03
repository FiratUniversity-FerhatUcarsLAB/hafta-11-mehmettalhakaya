/*
 * Ad Soyad: MEHMET TALHA KAYA
 * Ogrenci No: 250542009
 * Tarih: 03.12.2025
 */

public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        // Bu satır derlenir ve çalışır, fakat getNumber()'ın döndürdüğü 42 değeri
        // hiçbir değişkende tutulmadığı için "kullanılmaz". Programda görünür bir etkisi yoktur.
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // Aşağıdaki satır DERLEME HATASI verir çünkü sayHello() bir değer döndürmez (void).
        // Bu yüzden System.out.println içinde bir değermiş gibi kullanılamaz.
        // Örnek hata: "void type not allowed here"
        // System.out.println(sayHello() + 7);

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
