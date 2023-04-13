import java.util.Arrays;

public class Main {
    public static void printSeparator() {
        System.out.println("===============================================================================================================");
    }

    public static void main(String[] args) {
        task0();//Тренеровочная задача от наставника
        task1();//Задача 1
        task2();//Задача 2
    }

    static void task0() {
        System.out.println("Тренеровочная задача от наставника");
        String nameJohn = "John";
        int ageJohn = 13;

        String nameSarah = "Sarah";
        int ageSarah = 30;

        String[] names = {"John", "Sarah"};
        int[] ages = {13, 30};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Имя - " + names[i] + " Возраст - " + ages[i]);
        }
        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());//геттер
        System.out.println("sarah.age = " + sarah.getAge());  //геттер
        sarah.setAge(31);                                     //сеттер
        System.out.println("sarah.getAge() = " + sarah.getAge());

        Person john = new Person("John", 13);
        System.out.println("john.name = " + john.getName());//геттер
        System.out.println("john.age = " + john.getAge());  //геттер
        john.setAge(14);                                    //сеттер
        System.out.println("john.getAge() = " + john.getAge());
        printSeparator();
    }


    static void task1() {
        System.out.println("Задача 1");

        String booksOfAlexanderPushkin = "Капитанская Дочка!";
        String authorsNameFirst = "Александр";
        String authorsNameLast = "Пушкин";
        int yearsPublicationsBook1 = 1836;

        String booksOfLevTolstoy = "Война и Мир!";
        String authorsNameFirst2 = "Лев";
        String authorsNameLast2 = "Толстой";
        int yearsPublicationsBook2 = 1863;

        String[] booksName = {"Капитанская Дочка!", "Война и мир!"};
        String[] firstName = {"Александр ", "Лев "};
        String[] lastName = {"Пушкин", "Толстой"};
        int[] yearsPublication = {1836, 1863};

        for (int i = 0; i < booksName.length; i++) {
            System.out.println("Название книги - " + booksName[i] + " Автор книги - " + firstName[i] + lastName[i] + "." + " Год издания - " + yearsPublication[i] + ".");
        }
        printSeparator();
    }

    static void task2() {
        System.out.println("Задача написать конструктор");

        Author author = new Author("Александр! ", "Пушкин!");
        Book book = new Book("Капитанская Дочка!", 1836, "Александр Сергеевич Пушкин!");
        System.out.println("booksOfAlexanderPushkin.booksName = " + book.getBooksName());
        System.out.println("booksOfAlexanderPushkin.getYearsPublication = " + book.getYearOfPublicationOfTheBook());
        System.out.println("book.Author = " + book.getAuthor());
        System.out.println("authorsName = " + author.getFirstName() + author.getLastName());
        book.setYearOfPublicationOfTheBook(1888);
        System.out.println("booksOfAlexanderPushkin.getYearsPublication = " + book.getYearOfPublicationOfTheBook());

        Author author2 = new Author("Лев ", "Толстой");
        Book book1 = new Book("Война и Мир!", 1863, "Лев Николаевич Толстой!");
        System.out.println("booksOfLevTolstoy.booksName = " + book1.getBooksName());
        System.out.println("booksOfLevTolstoy.getYearsPublication = " + book1.getYearOfPublicationOfTheBook());
        System.out.println("book.Author = " + book1.getAuthor());
        System.out.println("authorsName2 = " + author2.getFirstName() + author2.getLastName());
        book1.setYearOfPublicationOfTheBook(1777);
        System.out.println("booksOfLevTolstoy.getYearsPublication = " + book1.getYearOfPublicationOfTheBook());
    }
}








