package Controllers;

import Domain.Person;
import Domain.Teacher;
import Domain.Worker;

public class AccountController {
    public static <T extends Worker,V> void paySalary(T person, V salar)
    {
        System.out.println(person.getName()  + " выплачена зарплата "+salar);
    }

    // public void paySalary(Teacher person, int salar)
    // {
    //     System.out.println(person.getName()  + " выплачена зарплата "+salar);
    // }

    // public void paySalary(Student person, int salar)
    // {
    //     System.out.println(person.getName()  + " выплачена зарплата "+salar);
    // }
}
