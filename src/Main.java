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
        System.out.println("Тренеровочная задача от наставника:->");
        PersonService personService = new PersonService();
        Person sarah = new Person("Sarah", 30);
        if (personService.isAdult(sarah)) {
            System.out.println("Иди в бар!");
        } else {
            System.out.println("Иди в школу!!");
        }
        System.out.println(sarah);
        sarah.increaseAge(30);
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

    public Main() {
    }

    static void task2() {
        System.out.println("Задача реализовать методы toString, equals и hashCode в классах Author и Book, которые создал на прошлом уроке.");
        //Обратить внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать (вызывать) его версию метода.

        Author author = new Author("Александр ", "Пушкин!");
        Book book1 = new Book("Капитанская Дочка!", 1836, author);
        System.out.println("booksOfAlexanderPushkin.booksName = " + book1.getBooksName());
        System.out.println("booksOfAlexanderPushkin.getYearsPublication = " + book1.getYearOfPublicationOfTheBook());
        System.out.println(book1);
        System.out.println("authorsName = " + author.getFirstName() + author.getLastName());
        book1.setYearOfPublicationOfTheBook(1888);
        System.out.println("booksOfAlexanderPushkin.getYearsPublication = " + book1.getYearOfPublicationOfTheBook());

        Author author2 = new Author("Лев ", "Толстой!");
        Book book2 = new Book("Война и Мир!", 1863, author2);
        System.out.println("booksOfLevTolstoy.booksName = " + book2.getBooksName());
        System.out.println("booksOfLevTolstoy.getYearsPublication = " + book2.getYearOfPublicationOfTheBook());
        System.out.println(book2);
        System.out.println("authorsName2 = " + author2.getFirstName() + author2.getLastName());
        book1.setYearOfPublicationOfTheBook(1777);
        System.out.println("booksOfLevTolstoy.getYearsPublication = " + book2.getYearOfPublicationOfTheBook());
        printSeparator();




    }
}








