//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author rowling = new Author("Joanne", "Rowling ");
        Author pushkin = new Author("Alexander", "Pushkin");
        System.out.println("Имя - " + rowling.getName());
        System.out.println("Фамилия - " + rowling.getSurname() + "\n");
        System.out.println("Имя - " + pushkin.getName());
        System.out.println("Фамилия - " + pushkin.getSurname() + "\n\n");

        Book harryPotter = new Book("Harry Potter", rowling, 1997);
        Book evgeniyOnegin = new Book("Evgeniy Onegin", pushkin, 1833);
        System.out.println("Название - " + harryPotter.getTitle());
        System.out.println("Автор - " + harryPotter.getAuthor().getName() + " " + harryPotter.getAuthor().getSurname());
        System.out.println("Год публикации - " + harryPotter.getYear() + "\n");

        System.out.println("Название - " + evgeniyOnegin.getTitle());
        System.out.println("Автор - " + evgeniyOnegin.getAuthor().getName() + " " + evgeniyOnegin.getAuthor().getSurname());
        System.out.println("Год публикации - " + evgeniyOnegin.getYear() + "\n");

        evgeniyOnegin.setYear(2026);
        System.out.println("Год публикации - " + evgeniyOnegin.getYear());





    }
}