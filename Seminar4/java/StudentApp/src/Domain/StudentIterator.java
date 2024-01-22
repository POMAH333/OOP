package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student<String, Integer>> {
    private int counter;
    private final List<Student<String, Integer>> students;

    public StudentIterator(List<Student<String, Integer>> students) {
        this.students = students;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    @Override
    public Student<String, Integer> next() {
        if (!hasNext()) {
            return null;
        }
        // counter++;
        return students.get(counter++);
    }

}
