public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return getAge() > 18;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName() {
        this.name = name;
    }

    public void increaseAge(int increment) {
        if (increment < 0) {
            throw new IllegalArgumentException("Инкремен не может быть отрицательным");
        }
        this.age = age + increment ;
    }

    public String toString() {
        return "Имя " + this.name + " Возраст " + this.age;
    }
}
