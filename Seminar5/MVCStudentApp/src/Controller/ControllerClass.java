package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetController;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.Domain.Student;
import View.ViewClass;

/**
 * Класс контроллера
 */
public class ControllerClass implements iGetController {

    private List<iGetModel> model = new ArrayList<>(); // Список подключенных моделей
    private Integer modelNum = 0; // Текущая модель

    private HashMap<String, iGetView> view = new HashMap<>(); // Список подключённых отображений
    private String lang = "RU"; // Текущее отображение

    private List<Student> studBuffer = new ArrayList<>();

    /**
     * Конструктор класса.
     * Добавляет в списки переданные по умолчанию отображение и модель.
     * 
     * @param model - Модель по умолчанию
     * @param view  - Отображение по умолчанию
     */
    public ControllerClass(iGetModel model, iGetView view) {
        this.model.add(model);
        this.view.put(lang, view);
    }

    /**
     * Геттер номера текущей модели.
     * 
     * @return - Возвращает номер текущей модели
     */
    public Integer getModelNum() {
        return modelNum;
    }

    /**
     * Сеттер номера текущей модели.
     * 
     * @param modelNum - Устанавливаемый номер текущей модели
     */
    public void setModelNum(Integer modelNum) {
        if (modelNum < model.size() && modelNum >= 0) {
            this.modelNum = modelNum;
        }
    }

    // Добавление принятой модели в список
    public void addModel(iGetModel model) {
        this.model.add(model);
    }

    // Добавление принятого отображения в список
    public void addView(String lang, iGetView view) {
        this.view.put(lang, view);
    }

    private boolean tesdData(List<Student> stud) {
        if (stud.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update(String Request) {
        // MVP
        studBuffer = model.get(modelNum).getStudents();
        if (tesdData(studBuffer)) {
            view.get(lang).printAllStudent(studBuffer);
        } else {
            System.out.println("Список студентов пуст!");
        }

        // MVC
        // view.printAllStudent(model.getStudents());
    }

    // Метод запуска контроллера
    public void run() {
        Command com = (Command) Command.NONE;
        boolean getNewIter = true;

        // Выбор языка отображения из имеющихся в списке отображений
        while (getNewIter) {
            String command = view.get(lang).promptLang();
            command = command.toUpperCase();
            switch (command) {
                case "RU":
                    getNewIter = false;
                    lang = "RU";
                    break;
                case "EN":
                    getNewIter = false;
                    lang = "EN";
                    break;
                default:
                    view.get(lang).promptLangNot();
            }
        }
        view.get(lang).promptLangChoice(lang);

        getNewIter = true; // Сброс переменной для нового цикла

        // Выбор действия в зависимости от команды введённой пользователем
        while (getNewIter) {
            String command = view.get(lang).promptComEnter();
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT: // Выход из программы
                    getNewIter = false;
                    view.get(lang).promptExit();
                    break;
                case LIST: // Просмотр списка студентов в текущей модели
                    view.get(lang).printAllStudent(model.get(modelNum).getStudents());
                    break;
                case DELETE: // Удаление студента с заданным номером с обходом всех моделей
                    Integer num = Integer.parseInt(view.get(lang).promptDelNum());
                    boolean studentDelete = false;
                    for (iGetModel cur : model) {
                        if (!studentDelete) {
                            studentDelete = cur.delStudent(num);
                            // Вывод сообщения об успешности удаления
                            if (studentDelete) {
                                view.get(lang).promptDelStudent(num);
                            }
                        }
                    }
                    if (!studentDelete) {
                        view.get(lang).promptNotStudent(num);
                    }
                    break;
                default:
                    view.get(lang).promptNotCommand();
            }
        }
    }

}
