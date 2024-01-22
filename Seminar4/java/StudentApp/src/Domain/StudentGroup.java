package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student<String, Integer>> {
    private List<Student<String, Integer>> group;
    private Integer idGroup;

    public StudentGroup(List<Student<String, Integer>> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student<String, Integer>> getGroup() {
        return group;
    }

    public void setGroup(List<Student<String, Integer>> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

    // @Override
    // public Iterator<Student> iterator() {
    // return new Iterator<Student>() {

    // private int counter;

    // @Override
    // public boolean hasNext() {

    // if(counter<group.size())
    // {
    // return true;
    // }
    // else
    // {
    // return false;
    // }
    // }

    // @Override
    // public Student next() {
    // return group.get(counter++);
    // }

    // };

    // }

    @Override
    public Iterator<Student<String, Integer>> iterator() {
        return new StudentIterator(group);

    }

}
