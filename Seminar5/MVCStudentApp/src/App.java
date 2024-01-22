import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.ModelClassFile;
import Model.ModelClassHash;
import Model.Domain.Student;
import View.ViewClass;
import View.ViewClassEng;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // Список студентов
        Student student1 = new Student("Ivan", 21);
        Student student2 = new Student("Anna", 25);
        Student student3 = new Student("Vasya", 22);
        Student student4 = new Student("Nastya", 27);
        Student student5 = new Student("Vasilisa", 26);
        Student student6 = new Student("Karina", 25);
        Student student7 = new Student("Andrey", 22);
        Student student8 = new Student("Masha", 27);
        Student student9 = new Student("Irina", 28);
        Student student10 = new Student("Nikolay", 30);

        // Формирование основной модели
        List<Student> studList = new ArrayList<>();
        studList.add(student1);
        studList.add(student2);
        studList.add(student3);
        studList.add(student5);
        studList.add(student7);
        iGetModel model = new ModelClass(studList);

        // Формирование файловой модели
        iGetModel fmodel = new ModelClassFile("StudentDB.csv");

        // Формирование модели с хэш-таблицей
        HashMap<Integer, Student> studMap = new HashMap<>();
        studMap.put(student4.getId(), student4);
        studMap.put(student6.getId(), student6);
        studMap.put(student8.getId(), student8);
        studMap.put(student9.getId(), student9);
        studMap.put(student10.getId(), student10);
        iGetModel hmmodel = new ModelClassHash(studMap);

        // Формирование отображений
        iGetView view = new ViewClass();
        iGetView viewEng = new ViewClassEng();

        // Формирование контроллера
        ControllerClass controller = new ControllerClass(model, view);
        controller.addModel(fmodel); // Добавление файловой модели
        controller.addModel(hmmodel); // Добавление хэш модели
        controller.addView("EN", viewEng); // Добавление английского отображения

        // Связь отображений с контроллером
        view.setContr(controller);
        viewEng.setContr(controller);

        // Выбор модели
        controller.setModelNum(1);

        // Запуск выполнения
        view.ViewRun();

        // controller.update("Маса и мет");
        // controller.run();
    }
}
