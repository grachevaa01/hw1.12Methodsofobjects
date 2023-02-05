import java.util.Objects;

public class Book {
    private String name;
    private int release;

    public Book(String name, int release) {
        this.name = name;
        this.release = release;

    }

    public String getname() {
        return this.name;

    }

    public int getRelease() {
        return this.release;
    }

    public void setrelease(int release) {
        this.release = release;
    }

    public String toString() {
        return "Name " + this.name + "Release" + this.release;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return release == book.release && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, release);
    }


    }


