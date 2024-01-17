package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.PersonComparator;
import Domain.Student;

public class StudentService implements iPersonService<Student<Integer>> {
    private int count;
    private List<Student<Integer>> students;
    public StudentService() {
        students = new ArrayList<>();
    }

    @Override
    public List<Student<Integer>> getAll() {
        return students;
    }
    @Override
    public void create(String name, int age) {
        Student<Integer> stud = new Student<>(name, age);
        count++;
        students.add(stud);
        sortByFIO();
    }

    public void sortByFIO()
    {
        PersonComparator<Student<Integer>> studComp = new PersonComparator<>();
        students.sort(studComp);
    }

}
