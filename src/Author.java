import java.util.Objects;

public class Author {
    private String AuthorName;
    private String AuthorSurname;

    public Author(String AuthorName, String AuthorSurname) {
        this.AuthorName = AuthorName;
        this.AuthorSurname = AuthorSurname;
    }

    public String getAuthorName() {
        return this.AuthorName;
    }

    public String getAuthorSurname() {
        return this.AuthorSurname;
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!o.getClass().equals(Author.class)) return false;
        Author other = (Author) o;
        return Objects.equals(this.AuthorName, other.AuthorName)
                && Objects.equals(this.AuthorSurname, other.AuthorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.AuthorName, this.AuthorSurname);

    }

    @Override
    public String toString(){
        return this.AuthorName + " " + this.AuthorSurname;
    }
}


