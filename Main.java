import java.io.PrintStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book>nameTreeSet=new TreeSet<>();
        System.out.println("Alfabetik sıraya göre:");
        nameTreeSet.add(new Book("Küçük Prens",112,"Antoine de Saint","1943"));
        nameTreeSet.add(new Book("Dune",412,"  Frank Herbert","1965"));
        nameTreeSet.add(new Book("Savaş ve Barış",1225," Lev Tolstoy","1869"));
        nameTreeSet.add(new Book("Harry Potter ve Felsefe Taşı",223," J.K. Rowling","1997"));
        nameTreeSet.add(new Book("Yabancı",185,"Camus","1942"));
        Iterator itr= nameTreeSet.iterator();
        while(itr.hasNext()){
            Book book=(Book)itr.next();
            System.out.println(book.getName()+","+book.getNumPages()+","+book.getWriter()+","+book.getReleaseDate());
        }
        }
}