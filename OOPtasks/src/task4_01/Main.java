// Створіть проект з класом Main.java.
//Потрібно: Створити клас Book. Створити класи Title, Author та Content, кожен з яких повинен містити одне рядкове поле та метод void show().
// Реалізувати можливість додавання назви книги, імені автора та змісту.
// Виведіть на екран за допомогою методу show() назву книги, ім'я автора та Зміст.
package task4_01;

public class Main {
    public static void main(String[] args) {
        Book myBook=new Book();
        myBook.addBookInfo("The Lord of the Rings", "epic high-fantasy novel", "J. R. R. Tolkien");
        myBook.show();
        myBook.addBookInfo("Death on the Nile", "detective fiction about Hercule Poirot", "Agatha Christie");
        myBook.show();
    }
}
