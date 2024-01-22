package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.PersonComparator;
import Domain.Student;

public class StudentService implements iPersonService<Student<String, Integer>> {
    private int count;
    private List<Student<String, Integer>> students;

    public StudentService() {
        students = new ArrayList<>();
    }

    @Override
    public List<Student<String, Integer>> getAll() {
        return students;
    }

    @Override
    public void create(String name, int age) {
        Student<String, Integer> stud = new Student<>(name, age);
        count++;
        students.add(stud);
        sortByFIO();
    }

    public void sortByFIO() {
        PersonComparator<Student<String, Integer>> studComp = new PersonComparator<>();
        students.sort(studComp);
    }

}
