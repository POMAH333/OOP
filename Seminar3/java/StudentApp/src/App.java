import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println(group4580);

        for (Student std : group4580) {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for (Student std : group4580.getGroup()) {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        // Проверка правильности выполнения практического задания
        System.out.println(group4580);
        System.out.println("-------");

        // Формирование группы 2
        List<Student> listStud2 = new ArrayList<>(listStud);
        listStud2.add(s1);
        StudentGroup group4581 = new StudentGroup(listStud2, 4581);
        System.out.println(group4581);
        System.out.println("-------");

        // Формирование группы 3
        List<Student> listStud3 = new ArrayList<>(listStud2);
        listStud3.add(s2);
        StudentGroup group4582 = new StudentGroup(listStud3, 4582);
        System.out.println(group4582);
        System.out.println("-------");

        // Формирование группы 4
        List<Student> listStud4 = new ArrayList<>(listStud3);
        StudentGroup group4583 = new StudentGroup(listStud4, 4583);
        System.out.println(group4583);
        System.out.println("-------");

        // Формирование потока 1
        List<StudentGroup> listGroup = new ArrayList<>();
        listGroup.add(group4580);
        listGroup.add(group4581);
        listGroup.add(group4582);
        listGroup.add(group4583);
        StudentSteam steam1 = new StudentSteam(listGroup, 1);

        // Печать списка потока
        System.out.println(steam1);

        // Сортировка групп
        Collections.sort(steam1.getSteam());
        System.out.println("Отсортированный список:");
        System.out.println(steam1);

    }
}
