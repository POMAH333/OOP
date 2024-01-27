package java.src;

import java.src.Calculator.*;
import java.src.Calculator.Argument.Complex;
import java.src.Calculator.Interface.iCalculable;
import java.src.Decorator.CalcDecorator;
import java.src.Logger.*;
import java.src.View.ViewCalculator;

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
