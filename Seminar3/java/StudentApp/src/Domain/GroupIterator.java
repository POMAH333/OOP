package Domain;

import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator<StudentGroup> {

    private int counter;
    private final List<StudentGroup> group;

    /**
     * Переопределяет итератор для групп
     * 
     * @param group
     */
    public GroupIterator(List<StudentGroup> group) {
        this.group = group;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < group.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        return group.get(counter++);
    }

}
