package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student<Integer>> {
    private int counter;
    private final List<Student<Integer>> students;
    
    public StudentIterator(List<Student<Integer>> students) {
        this.students = students;
        this.counter = 0;
    }
    
    @Override
    public boolean hasNext() {
       return counter<students.size();
    }
    @Override
    public Student<Integer> next() {
        if(!hasNext())
        {
            return null;
        }
        //counter++;
        return students.get(counter++);        
    }
    
}

