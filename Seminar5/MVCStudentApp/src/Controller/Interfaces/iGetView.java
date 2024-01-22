package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetView {

    public void printAllStudent(List<Student> students); // Вывод на экран списка студентов

    public void setContr(iGetController contr); // Установить контроллер для отображения

    public void ViewRun(); // Выполнение программы

    // Блок отображаемых сообщений
    public String prompt(String msg); // Запрос строки из консоли с выводом заданного сообщения

    public String promptLang(); // Запрос на изменения языка

    public void promptLangChoice(String lang); // Подтверждение изменения языка

    public void promptLangNot(); // Ошибка: Язык отсутствует

    public String promptComEnter(); // Запрос на ввод комманды из консоли

    public void promptExit(); // Сообщение о выходе из программы

    public String promptDelNum(); // Запрос на номер удаляемого студента

    public void promptDelStudent(Integer num); // Сообщение об удалении студента

    public void promptNotStudent(Integer num); // Сообщение: студент не найден

    public void promptNotCommand(); // Сообщение: Комманда не определена

}
