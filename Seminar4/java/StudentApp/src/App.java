
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Domain.Employee;
import Domain.Person;
import Domain.Student;
import Domain.StudentGroup;
import Domain.Teacher;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {

        Student<Integer> s1 = new Student<>("Иван", 25);
        Student<Integer> s2 = new Student<>("Игорь", 23);
        Student<Integer> s3 = new Student<>("Иван", 22);
        Student<Integer> s4 = new Student<>("Игорь", 23);
        Student<Integer> s5 = new Student<>("Даша", 23);
        Student<Integer> s6 = new Student<>("Лена", 23);

        List<Student<Integer>> listStud = new ArrayList<Student<Integer>>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println(group4580);

        for (Student<Integer> std : group4580) {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for (Student<Integer> std : group4580.getGroup()) {
            System.out.println(std);
        }

        Teacher<String> t1 = new Teacher<>("Эдуард", 50, "Доцент");
        Employee<String> e1 = new Employee<>("Федор", 35, "Дворник");

        // AccountController controller = new AccountController();
        // controller.paySalary(t1, 50000);
        // controller.paySalary(e1, 25000);

        // controller.paySalary(s1, 20000);
        AccountController.paySalary(t1, 50000);
        AccountController.paySalary(e1, 50000);
        // AccountController.paySalary(s1, 50000);

        /**
         * Выполнение практического задания к семинару №4
         */
        // Демонстрация работы метода averageAge, при передаче произвольного списка
        // студентов.
        System.out.println("");
        AccountController.averageAge(listStud);
        System.out.println("");

        // Демонстрация работы метода averageAge, при передаче списка преподавателей из
        // созданного класса TeacherService.
        TeacherService professors = new TeacherService();
        professors.create("Иванов", 37);
        professors.create("Petrov", 52);
        professors.create("Sidorov", 74);
        // Вывод списка профессоров в консоль
        for (Person<String,Integer> p : professors.getAll()) {
            System.out.println(p);
        }
        // Вывод среднего возраста профессоров
        AccountController.averageAge(professors.getAll());

    }
}
