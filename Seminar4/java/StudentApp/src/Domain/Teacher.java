package Domain;

public class Teacher<T> extends Worker {
    private T acadDegree;

    /**
     * Произведено обобщение типов класса
     * 
     * @param firstName
     * @param age
     * @param acadDegree
     */
    public Teacher(String firstName, int age, T acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }
}
