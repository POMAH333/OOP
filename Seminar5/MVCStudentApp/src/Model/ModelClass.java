package Model;

import java.util.ArrayList;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClass implements iGetModel {

    private List<Student> students = new ArrayList<>();

    public ModelClass(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    // Метод удаления студента из модели
    public boolean delStudent(Integer num) {
        for (Student student : students) {
            if (student.getId() == num) {
                students.remove(student);
                return true;
            }

        }
        return false;
    }

}
