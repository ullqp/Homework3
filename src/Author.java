public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return "Имя: " + this.name + ", Фамилия: " + this.surname;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author2 = (Author) other;
        return (name.equals(author2.name) && surname.equals(author2.surname));
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
}
