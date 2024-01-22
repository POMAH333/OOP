package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetModel {
   public List<Student> getStudents(); // Возвращает список студентов

   public boolean delStudent(Integer num); // Удаляет студента с заданным номером
}
