package View;

import java.util.List;
import java.util.Scanner;

import Controller.ControllerClass;
import Controller.Interfaces.iGetController;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

/**
 * Класс отображения на русском языке
 */
public class ViewClass implements iGetView {

    private iGetController contr; // Подключение контроллера

    // Вывод на экран списка студентов
    public void printAllStudent(List<Student> students) {
        System.out.println("-------------Список студентов------------");
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
        return prompt("Укажите используемый язык");
    }

    // Подтверждение изменения языка
    public void promptLangChoice(String lang) {
        System.out.println("Установлен язык: " + lang);
    }

    // Ошибка: Язык отсутствует
    public void promptLangNot() {
        System.out.println("Указанный язык не поддерживается");
    }

    // Запрос на ввод комманды из консоли
    public String promptComEnter() {
        return prompt("Введите команду: ");
    }

    // Сообщение о выходе из программы
    public void promptExit() {
        System.out.println("Выход из программы");
    }

    // Запрос на номер удаляемого студента
    public String promptDelNum() {
        return prompt("Введите номер студента для удаления: ");
    }

    // Сообщение об удалении студента
    public void promptDelStudent(Integer num) {
        System.out.println("Студент № " + num + ", удалён");
    }

    // Сообщение: студент не найден
    public void promptNotStudent(Integer num) {
        System.out.println("Студент № " + num + ", не найден");
    }

    // Сообщение: Комманда не определена
    public void promptNotCommand() {
        System.out.println("Команда не поддерживается");
    }
}
