package Controller.Interfaces;

public interface iGetController {
    public void run(); // Запуск контроллера

    public void addModel(iGetModel model); // Добавление модели в контроллер

    public void addView(String lang, iGetView view); // Добавление отображения в контроллер
}
