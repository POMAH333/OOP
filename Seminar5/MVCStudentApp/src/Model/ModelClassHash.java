package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

/**
 * Класс модели с использованием хэш-таблицы
 */
public class ModelClassHash implements iGetModel {

    // Хэш-таблица для хранения студентов
    private HashMap<Integer, Student> students;

    /**
     * Конструктор класса заполняющий таблицу студентов переданными значениями ключа
     * и записи студента
     * 
     * @param students - Хэш-таблица студентов
     */
    public ModelClassHash(HashMap<Integer, Student> students) {
        this.students = students;
    }

    // Метод возвращающий список студентов из таблицы
    public List<Student> getStudents() {
        List<Student> st = new ArrayList<>(students.values());
        return st;
    }

    // Метод удаления студента по указанному номеру
    public boolean delStudent(Integer num) {
        if (students.containsKey(num)) {
            students.remove(num);
            return true;
        }
        return false;
    }

}
