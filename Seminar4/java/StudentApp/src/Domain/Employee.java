package Domain;

public class Employee<T> extends Worker {
    private T special;

    /**
     * Произведено обобщение типов класса
     * 
     * @param firstName
     * @param age
     * @param special
     */
    public Employee(String firstName, int age, T special) {
        super(firstName, age);
        this.special = special;
    }
}
