public class Book {

    private String title;
    private Author author;
    private int year;

    public Book (String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return "Название: " + this.title + "; Автор: " + this.author + "; Год издания: " + this.year + ".";
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book2 = (Book) other;
        return title.equals(book2.title) && author.equals(book2.author) && year == book2.year;
    }

    public String getTitle() {
        return this.title;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
