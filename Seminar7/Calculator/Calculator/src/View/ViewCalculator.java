package View;

import Calculator.Argument.Argument;
import Calculator.Argument.Complex;
import Calculator.Interface.iCalculable;
import java.util.Scanner;

/**
 * Класс пользовательского взаимодействия с калькулятором
 */
public class ViewCalculator {

    private iCalculable calculator; // Подключение калькулятора

    /**
     * Конструктор вьюера
     * 
     * @param calculator - подключаемый калькулятор
     */
    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    /**
     * Меню для работы с калькулятором
     */
    public void run() {
        while (true) {
            // Ввод первого комплексного аргумента
            System.out.println("Введите первый аргумент:   ");
            double valid = promptDoub("Введите действительную часть числа:   ");
            double imagin = promptDoub("Введите мнимую часть числа:   ");
            calculator.setPrimaryArg(new Complex(valid, imagin));

            // Задание переменной для ввода операций и комманд
            String cmd = "";
            while (true) {
                cmd = prompt("Введите операцию (+, -, *, /):   ");
                switch (cmd) {
                    // Операция сложения
                    case "+":
                        System.out.println("Введите второй аргумент:   ");
                        valid = promptDoub("Введите действительную часть числа:   ");
                        imagin = promptDoub("Введите мнимую часть числа:   ");
                        calculator.setSecondArg(new Complex(valid, imagin));
                        calculator.sum();
                        break;
                    // Операция вычитания
                    case "-":
                        System.out.println("Введите второй аргумент:   ");
                        valid = promptDoub("Введите действительную часть числа:   ");
                        imagin = promptDoub("Введите мнимую часть числа:   ");
                        calculator.setSecondArg(new Complex(valid, imagin));
                        calculator.sub();
                        break;
                    // Операция умножения
                    case "*":
                        System.out.println("Введите второй аргумент:   ");
                        valid = promptDoub("Введите действительную часть числа:   ");
                        imagin = promptDoub("Введите мнимую часть числа:   ");
                        calculator.setSecondArg(new Complex(valid, imagin));
                        calculator.multi();
                        break;
                    // Операция деления
                    case "/":
                        System.out.println("Введите второй аргумент:   ");
                        valid = promptDoub("Введите действительную часть числа:   ");
                        imagin = promptDoub("Введите мнимую часть числа:   ");
                        calculator.setSecondArg(new Complex(valid, imagin));
                        calculator.div();
                        break;
                    // Ввод неопределённой операции
                    default:
                        System.out.println("Данная операция не поддерживается");
                        break;
                }

                // Вывод результатов вычислений
                Argument result = calculator.getResult();
                System.out.println("Результат = " + result);
                break;
            }
            // Запрос на дальнейшую работу с калькулятором
            cmd = prompt("Ещё посчитать Y/N   ");
            if (cmd.toUpperCase().equals("Y")) {
                continue;
            }
            break;
        }
    }

    /**
     * Метод ввода строковых данных из консоли
     * 
     * @param message - выводимый запрос
     * @return
     */
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    /**
     * Метод ввода целочисленных данных из консоли
     * 
     * @param message - выводимый запрос
     * @return
     */
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }

    /**
     * Метод ввода вещественных чисел из консоли
     * 
     * @param message - выводимый запрос
     * @return
     */
    private double promptDoub(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
