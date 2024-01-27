import Calculator.*;
import Calculator.Argument.Complex;
import Calculator.Interface.iCalculable;
import Decorator.CalcDecorator;
import Logger.*;
import View.ViewCalculator;

/**
 * Создать проект калькулятора комплексных чисел (достаточно сделать сложение,
 * умножение и деление).
 * Применить при создании программы архитектурные паттерны, добавить логирование
 * калькулятора.
 * Соблюдать принципы SOLID, паттерны проектирования.
 */
public class Main {
    /**
     * Программа калькулятора комплексных чисел
     * 
     * @param args
     */
    public static void main(String[] args) {
        // Инициализация калькулятора и логгера через декоратор

        iCalculable calculator = new CalcDecorator(
                new CalculatorComplex(
                        new Complex(0, 0), new Complex(0, 0)),
                new Logger());
        // Инициализация просмотровщика
        ViewCalculator view = new ViewCalculator(calculator);
        view.run(); // Выполнение программы
    }
}
