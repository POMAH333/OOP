package Domain;

public class Employee<T, V> extends Worker<T, V> {
    private T special;

    /**
     * Произведено обобщение типов класса
     * 
     * @param firstName
     * @param age
     * @param special
     */
    public Employee(T firstName, V age, T special) {
        super(firstName, age);
        this.special = special;
    }
}
