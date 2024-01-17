package Domain;

public class Student<T extends Number> extends Person<String, Integer> implements Comparable<Student<Integer>> {

    private int id;
    private static int generalId;

    /**
     * Обобщение типов класса выполнить не удалось
     * 
     * @param name
     * @param age
     */
    public Student(String name, int age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }

    @Override
    public int compareTo(Student<Integer> o) {

        System.out.println(super.getName() + " - " + o.getName());
        if (super.getAge() == o.getAge()) {
            if (id == o.id)
                return 0;
            if (id > o.id)
                return 1;
            else
                return -1;
            // return 0;
        }

        if (super.getAge() > o.getAge())
            return 1;
        else
            return -1;
    }

}
