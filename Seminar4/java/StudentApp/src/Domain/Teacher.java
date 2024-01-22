package Domain;

public class Teacher<T, V> extends Worker<T, V> {
    private T acadDegree;

    /**
     * Произведено обобщение типов класса
     * 
     * @param firstName
     * @param age
     * @param acadDegree
     */
    public Teacher(T firstName, V age, T acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }
}
