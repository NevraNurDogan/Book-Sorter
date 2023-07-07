import java.util.Arrays;
public class Book implements Comparable<Book>{
private String name;
private int numPages;
private String writer;
private String releaseDate;
    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.getName());
    }


    public Book(String name, int numPages, String writer, String releaseDate) {
        this.name = name;
        this.numPages = numPages;
        this.writer = writer;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
