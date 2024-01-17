package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.PersonComparator;
import Domain.Teacher;

public class TeacherService implements iPersonService<Teacher<String>> {
    private int count;
    private List<Teacher<String>> teachers;

    /**
     * Класс для формирования списка преподавателей
     */
    public TeacherService() {
        teachers = new ArrayList<>();
    }

    // Подключение обобщённого интерфейса iPersonService
    @Override
    public List<Teacher<String>> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher<String> teach = new Teacher<>(name, age, "Professor");
        count++;
        teachers.add(teach);
        sortByFIO();
    }

    // Метод сортировки списка преподавателей по имени
    public void sortByFIO() {
        PersonComparator<Teacher<String>> techCom = new PersonComparator<>();
        teachers.sort(techCom);
    }

}
