package Controllers;

import java.util.List;

import Domain.Person;
import Domain.Worker;

public class AccountController {
    public static <T extends Worker, V> void paySalary(T person, V salar) {
        System.out.println(person.getName() + " выплачена зарплата " + salar);
    }

    /**
     * Обобщённый метод для подсчёта среднего возраста студентов, учителей и
     * работников
     * 
     * @param <T>  - принимаемый тип наследник класса Person.
     * @param pers - принимаемый список людей, для подсчёта возраста.
     */
    public static <T extends Person<String, Integer>> void averageAge(List<T> pers) {
        double age = 0;
        for (T t : pers) {
            age += t.getAge();
        }
        System.out.println("Средний возраст = " + age / pers.size());
    }

    // public void paySalary(Teacher person, int salar)
    // {
    // System.out.println(person.getName() + " выплачена зарплата "+salar);
    // }

    // public void paySalary(Student person, int salar)
    // {
    // System.out.println(person.getName() + " выплачена зарплата "+salar);
    // }
}
