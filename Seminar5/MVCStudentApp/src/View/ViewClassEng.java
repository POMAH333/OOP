package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetController;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

/**
 * Класс отображения на английском языке
 */
public class ViewClassEng implements iGetView {

    private iGetController contr; // Подключение контроллера

    // Вывод на экран списка студентов
    public void printAllStudent(List<Student> students) {
        System.out.println("-------------List of students------------");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }

    // Установить контроллер для отображения
    public void setContr(iGetController contr) {
        this.contr = contr;
    }

    // Выполнение программы
    public void ViewRun() {
        contr.run();
    }

    // Блок отображаемых сообщений

    // Запрос строки из консоли с выводом заданного сообщения
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }

    // Запрос на изменения языка
    public String promptLang() {
        return prompt("Specify the language used");
    }

    // Подтверждение изменения языка
    public void promptLangChoice(String lang) {
        System.out.println("The language is set: " + lang);
    }

    // Ошибка: Язык отсутствует
    public void promptLangNot() {
        System.out.println("The specified language is not supported");
    }

    // Запрос на ввод комманды из консоли
    public String promptComEnter() {
        return prompt("Enter the command: ");
    }

    // Сообщение о выходе из программы
    public void promptExit() {
        System.out.println("Exiting the program");
    }

    // Запрос на номер удаляемого студента
    public String promptDelNum() {
        return prompt("Enter the student's number to delete: ");
    }

    // Сообщение об удалении студента
    public void promptDelStudent(Integer num) {
        System.out.println("Student № " + num + ", deleted");
    }

    // Сообщение: студент не найден
    public void promptNotStudent(Integer num) {
        System.out.println("Student № " + num + ", not found");
    }

    // Сообщение: Комманда не определена
    public void promptNotCommand() {
        System.out.println("The command is not supported");
    }

}
