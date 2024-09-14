package ru.mirea.prac2.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Stephen King", "HorrorBooks@gmail.com", 'M');
        System.out.println(author + "\n");
        author.setEmail("Advice_in_horror_books_cheap@yandex.ru");
        System.out.println(author + "\n");
        System.out.println(author.getGender() + "\n" + author.getEmail() + "\n" + author.getName());
    }
}
