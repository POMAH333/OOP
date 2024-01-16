package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    // @Override
    // public String toString() {
    // return "StudentGroup{" +
    // "group=" + group +
    // ", idGroup=" + idGroup +
    // '}';
    // }

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
    public Iterator<Student> iterator() {
        return new StudentIterator(group);

    }

    // Реализация интерфейса Comparable (сортировка по количеству студентов и по
    // идентификатору группы)
    @Override
    public int compareTo(StudentGroup o) {
        // Сортровка по количеству студентов
        if (group.size() > o.group.size())
            return -1;
        if (group.size() < o.group.size())
            return 1;
        // Сортировка по идентификатору группы
        if (idGroup < o.idGroup)
            return -1;
        if (idGroup > o.idGroup)
            return 1;
        return 0;
    }

    // Переопределение метода ToString
    @Override
    public String toString() {

        // Формирование списка студентов для вывода
        StringBuilder builder = new StringBuilder();
        for (Student value : group) {
            builder.append(value);
        }

        return "Group [ID=" + idGroup + ", students=" + group.size() + "]" + "\n" + builder;
    }

}
