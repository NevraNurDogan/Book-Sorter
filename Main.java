import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> kitapListesi = new ArrayList<>();
        kitapListesi.add(new Book("Küçük Prens",112,"Antoine de Saint","1943"));
        kitapListesi.add(new Book("Dune",412,"  Frank Herbert","1965"));
        kitapListesi.add(new Book("Savaş ve Barış",1225," Lev Tolstoy","1869"));
        kitapListesi.add(new Book("Harry Potter ve Felsefe Taşı",223," J.K. Rowling","1997"));
        kitapListesi.add(new Book("Yabancı",185,"Camus","1942"));
        // Kitapları adlarına göre alfabetik sıralama
        Collections.sort(kitapListesi);
        System.out.println("Kitaplar (Ad'a göre sıralı):");
        for (Book kitap : kitapListesi) {
            System.out.println(kitap.getName() + " - " + kitap.getWriter() + " - " + kitap.getNumPages());
        }

        // Kitapları sayfa sayısına göre sıralama
        Collections.sort(kitapListesi, Book.SayfaSayisiComparator);
        System.out.println("\nKitaplar (Sayfa sayısına göre sıralı):");
        for (Book kitap : kitapListesi) {
            System.out.println(kitap.getName() + " - " + kitap.getWriter() + " - " + kitap.getNumPages());
        }
    }
}